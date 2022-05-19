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

//Reloj de tipo deportivo que contiene la funcionalidad de contar pasos y medidor de sueño
public class SportWatchDecorator extends WatchDecorator {

    public SportWatchDecorator(Watch watch) {
        super(watch);
    }

    @Override
    public void createFunctionality(){
        super.createFunctionality();
        System.out.print(" and more features (Sport Watch): ");
        this.addPedometer();
        this.addSleepMode();
    }

    private void addPedometer() {
        System.out.print(" Pedometer");
    }

    private void addSleepMode() {
        System.out.print(" SleepMode ");
    }
}