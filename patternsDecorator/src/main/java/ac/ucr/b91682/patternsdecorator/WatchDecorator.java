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

//Esta clase es la que se encargará de añadir la funcionalidad al reloj base (decorador principal)
public abstract class WatchDecorator implements Watch {

    private final Watch watch;

    public WatchDecorator(Watch watch) {
        this.watch = watch;
    }
    @Override
    public void createFunctionality() {
        this.watch.createFunctionality();
    }
}
