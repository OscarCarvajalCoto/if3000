/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.ucr.b91682.hw01;

import java.time.LocalDate;

/**
 *
 * @author oandr
 */
public class LotteryNumber {

    public LotteryNumber(int number, LocalDate date) {
        this.number = number;
    }

    LotteryNumber next = null;
    LotteryNumber greater = null;
    LotteryNumber lower = null;
    LocalDate date = LocalDate.now();
    int number = 0;
    // TODO Definir nuevo parámetro(Parte 2)

    public void add(LotteryNumber next) {
        if (this.next == null) {
            this.next = next;
        } else {
            this.next.add(next);
        }
    }

    public void print() {
        // TODO Modificar el print (Parte 2)
        System.out.println(toString());
        if (next != null) {
            next.print();
        }
    }

    public boolean find(int number) {
        if (this.number == number) {
            return true;
        } else {
            if (this.next != null) {
                return next.find(number);
            } else {
                return false;
            }
        }

    }

    public LotteryNumber searchGreaterThan(Integer value) {
        // TODO Implementar búsqueda por el value( Parte 1)

//        if (number >= value) {
//            this.greater.add(new LotteryNumber(number));
//            System.out.println(greater);
//            return greater;
//        }else {
            return null;
       // }

        

    }

    public LotteryNumber searchLowerThan(Integer value) {
        // TODO Implementar búsqueda por el value( Parte 1)
//         if (number <= value) {
//            this.lower.add(new LotteryNumber(number));
//            System.out.println(lower);
//            return lower;
//        }else {
            return null;
        //}
    }

    // TODO Sobreescribir toString(Parte 2)

    @Override
    public String toString() {
        return " numero " + number + ", fecha " + date;
    }
    
}
