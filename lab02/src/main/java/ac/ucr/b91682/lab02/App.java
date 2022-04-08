/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.ucr.b91682.lab02;

import java.util.ArrayList;



/**
 *
 * @author oandr
 */
public class App {
    static void arreglo() {
        Node nodo1 = new Node("1");
        nodo1.setOpinion(true);
       Node nodo2 = new Node("2");
       nodo2.setOpinion(true);
       Node nodo3 = new Node("3");
        ArrayList array1 = new ArrayList();
        array1.add(nodo2);
        array1.add(nodo3);
       // array1.add(new Node("5"));
     
        System.out.println("Arraylist creado");
        for (Object node : array1) {
            System.out.println(node);
        }

        System.out.println("-------Conexiones----------");
        //nodo1.connect(nodo2);
        
        nodo1.setFriends(array1);
        
        System.out.println(nodo1.toString());
    }
    
    public static void main (String args[]){
      arreglo();
    }
}
