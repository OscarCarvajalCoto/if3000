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
public class LotteryNumber {

    public LotteryNumber(int number) {
        this.number = number;
        //aqui se podrian hacer validaciones de numeros positivos y enteros
    }

    LotteryNumber next = null;
    int number;

    public void add(LotteryNumber next) {
        if (this.next == null) {
            this.next = next;
            //print();
        } else {
            this.next.add(next);

        }

    }

    public void print() {
        System.err.println(number);
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
}
