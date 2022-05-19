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
// Reloj de tipo inteligente o lujo, este tiene las funcionaliodades de carga ráppida, resistente al agua y notificaciones
public class LuxuryWatchDecorator extends WatchDecorator {

    public LuxuryWatchDecorator(Watch watch) {
        super(watch);
    }

    @Override
    public void createFunctionality() {
        super.createFunctionality();
        System.out.print(" and  more features (Luxury Watch): ");
        this.addFastCharge();
        this.addImpermeability();
        this.addNotification();
    }

    private void addFastCharge() {
        System.out.print(" FastCharge ");
    }

    private void addImpermeability() {
        System.out.print(" Impermeability ");
    }

    private void addNotification() {
        System.out.print(" Notification ");
    }
}