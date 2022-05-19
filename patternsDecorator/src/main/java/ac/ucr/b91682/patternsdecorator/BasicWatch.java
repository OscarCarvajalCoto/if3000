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

//Esta es la clase del reloj sin ninguna funcionalidad añadida
public class BasicWatch implements Watch {

    @Override
    public void createFunctionality() {
        System.out.println(" Basic Watch with: ");
        this.addTimer();
    }

    private void addTimer() {
        System.out.print(" Timer");
    }
}