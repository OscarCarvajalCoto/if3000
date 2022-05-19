/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.ucr.b91682.patternsdecorator;

/**
 *
 * @author oandr
 */
public interface Watch {
    //Se tiene un reloj en el cual se busca que tenga funcionalidades, 
    //dependiendo de estas funcionalidades se convierte en reloj deportivo
    //o reloj de lujo
    void createFunctionality();
}
