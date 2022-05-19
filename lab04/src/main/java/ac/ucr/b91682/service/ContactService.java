package ac.ucr.b91682.service;

import ac.ucr.b91682.domain.Contact;
import ac.ucr.b91682.persistence.Persistence;
import ac.ucr.b91682.persistence.PersistenceContext;

public class ContactService {

    private final Persistence<Contact> persistence = PersistenceContext
            .getInstance()
            .getPersistenceInstance();

    public void save(Contact contact) {
        // validar inputs  ->
        // retornando algún tipo de valor diferente o lanzando una excepcion personalizada
        persistence.save(contact);
    }

}
