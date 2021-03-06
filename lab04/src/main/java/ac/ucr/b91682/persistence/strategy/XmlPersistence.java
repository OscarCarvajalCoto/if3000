/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.ucr.b91682.persistence.strategy;

import ac.ucr.b91682.persistence.FilePersistence;
import ac.ucr.b91682.persistence.Persistence;
import ac.ucr.b91682.persistence.PersistenceEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;


/**
 *
 * @author PC
 */
public class XmlPersistence<E extends PersistenceEntity>
        extends FilePersistence<E>
        implements Persistence<E> {

    public XmlPersistence(String root) {
        super(root, "json");
    }

    @Override
    protected String convert(E value) {
        try {
            // No formatea el JSON
            //return mapper().writeValueAsString(value);
            //Formatea el JSON
            return mapper().writerWithDefaultPrettyPrinter().writeValueAsString(value);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    private ObjectMapper mapper() {
        XmlMapper mapper = new XmlMapper();
        // Para poder convertir LocalDate
        mapper.registerModule(new JavaTimeModule());
        // Para evitar que falle cuando no encuentre una propiedad en un bean
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // Para no escribir fechas como timestamps
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        return mapper;

    }

    @Override
    public E save(E value) {
        try {
            storeFile(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return value;
    }
}
