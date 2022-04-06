/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.ucr.b91682.hw01;

/**
 *
 * @author oandr
 */
public class App {
//branch tarea
    public static void main(String args[]) {
//prueba del branch
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
   
}
