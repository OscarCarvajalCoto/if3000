/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.ucr.b91682.hw01;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author oandr
 */
public class App {

    public static void main(String args[]) {

        LotteryNumber first = new LotteryNumber(98, LocalDate.of(2022, 3, 25));
        first.add(new LotteryNumber(03, LocalDate.of(2022, 4, 1)));

        first.add(new LotteryNumber(33, LocalDate.of(2022, 4, 2)));
        first.add(new LotteryNumber(45, LocalDate.of(2022, 4, 3)));
        first.add(new LotteryNumber(67, LocalDate.of(2022, 4, 4)));
        first.add(new LotteryNumber(98, LocalDate.of(2022, 4, 5)));
        first.print();
        System.out.println("Buscamos el número 33 " + first.find(33));
        System.out.println("Buscamos el número 88 " + first.find(88));
        System.out.println("numeros arriba de 45 " + first.searchGreaterThan(45));
        System.out.println("numeros abajo de 45 " + first.searchLowerThan(45));
    }

}
