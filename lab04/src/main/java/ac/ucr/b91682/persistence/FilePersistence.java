/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.ucr.b91682.persistence;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Gerson Cordero
 */
public abstract class FilePersistence<E extends PersistenceEntity> {

    private String root;
    private String extension;

    public FilePersistence(String root, String extension) {
        this.root = root;
        this.extension = extension;
    }

    /**
     * Guarda archivos de acuerdo a su extensión(XML o JSON) y los convierte
     *
     * @return
     */
    public void storeFile(E value) throws IOException {
        File file = new File(root, value.getId() + "." + extension);
        String valueConverted = convert(value);
        // Java 8
//        BufferedWriter writer2=null;
//        try {
//            writer2= new BufferedWriter(new FileWriter(file));
//        }finally {
//
//            writer2.close();
//        }
        try ( BufferedWriter writer = new BufferedWriter(new FileWriter(file)); writer) {
            writer.write(valueConverted);
        }
    }

    protected abstract String convert(E value);

    public boolean deleteFile(E value) {
        File fileName = new File(root, value.getId() + "." + extension);
        if (fileName.exists()) {
            return fileName.delete();
        } else {
            return false;
        }
    }

    public List findAll() {
        return null;
    }

}
