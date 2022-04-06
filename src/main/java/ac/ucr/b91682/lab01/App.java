/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.ucr.b91682.lab01;

/**
 *
 * @author oandr
 */
public class App {

    public static void main(String args[]) {
//        LotteryNumber today= new LotteryNumber();
//        today.number=98;
//        LotteryNumber tomorrow= new LotteryNumber();
//        tomorrow.number=03;
//        today.add(tomorrow);
//        tomorrow.add(today);
//        today= new LotteryNumber();
//        today.number=33;

        LotteryNumber first = new LotteryNumber(98);
        first.add(new LotteryNumber(03));
       
        first.add(new LotteryNumber(33));
        first.add(new LotteryNumber(45));
        first.add(new LotteryNumber(67));
        first.add(new LotteryNumber(98));
       first.print();
        System.out.println("Buscamos el número 33 "+first.find(33));
          System.out.println("Buscamos el número 88 "+first.find(88));
    }
    //Tarea, hacer un find que pida los números mayores a ún número ingresado
    //Que retorne esa lista y que luego la imprima
    //se hacen dos variables de LotteryNumber con la lista nueva 
    //el metodo se puede llamar search
}
