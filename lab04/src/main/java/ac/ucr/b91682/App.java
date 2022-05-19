package ac.ucr.b91682;

import ac.ucr.b91682.domain.Contact;
import ac.ucr.b91682.persistence.PersistenceContext;
import ac.ucr.b91682.persistence.PersistenceStrategy;
import ac.ucr.b91682.service.ContactService;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        PersistenceContext.getInstance().setRoot("c:/data");
        PersistenceContext.getInstance().setStrategy(PersistenceStrategy.XML);

        ContactService service = new ContactService();

        Contact c = new Contact();
        c.setBirthdate(LocalDate.now());
        c.setName("Miguel");
        c.setSurname("De Cervantes");
        service.save(c);

    }
}
