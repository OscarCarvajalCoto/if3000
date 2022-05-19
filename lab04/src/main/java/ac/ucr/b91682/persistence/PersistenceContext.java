/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.ucr.b91682.persistence;

import ac.ucr.b91682.persistence.strategy.JsonPersistence;
import ac.ucr.b91682.persistence.strategy.XmlPersistence;

/**
 *
 * @author Gerson Cordero
 */
public class PersistenceContext {

    private String root;
    private PersistenceStrategy strategy;

    private static PersistenceContext instance;

    private PersistenceContext() {
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public void setStrategy(PersistenceStrategy strategy) {
        this.strategy = strategy;
    }

    public static PersistenceContext getInstance() {
        if (instance == null) {
            instance = new PersistenceContext();
        }
        return instance;
    }

    public <E extends PersistenceEntity> Persistence<E> getPersistenceInstance() {
        switch (strategy) {
            case XML:
                return new XmlPersistence<>(root);
            case JSON:
                return new JsonPersistence<>(root);
        }
        throw new RuntimeException("Estrategia no encontrada");
   
    }
}
