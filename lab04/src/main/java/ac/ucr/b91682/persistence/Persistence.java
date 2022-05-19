/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.ucr.b91682.persistence;

import java.util.List;

/**
 *
 * @author Gerson Cordero
 */
public interface Persistence<E> {

    E save(E value);

    List<E> findAll();
}
