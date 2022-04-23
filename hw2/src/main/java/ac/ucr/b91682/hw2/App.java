/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.ucr.b91682.hw2;

/**
 *
 * @author oandr
 */
public class App {

    static Node node1 = new Node("Daniela");

    static Node node2 = new Node("Josue");
    static Node node3 = new Node("Francisco");
    static Node node4 = new Node("Carlos");
    static Node node5 = new Node("Maria");
    static Node node6 = new Node("Antonio");

    public static void main(String[] args) {
        node1.add(node3);
        node1.add(node2);
        node1.add(node4);
        node1.add(node5);
        node2.add(node6);
        node3.add(node4);
        node4.add(node1);
        node3.add(node1);
        node3.add(node5);
        node5.add(node1);
        
        node3.opinionPositive();
        
        node1.publish();
        node2.publish();
        node4.publish();
        node5.publish();
        node6.publish();
        System.out.println("Se vuelve positiva la opinión del nodo 3");
        System.out.println("Se revisan las opiniones de los nodos");
        System.out.println("nodo 1 " + node1.getPublishedOpinion());
        System.out.println("nodo 2 " + node2.getPublishedOpinion());
        System.out.println("nodo 3 " + node3.getPublishedOpinion());
        System.out.println("nodo 4 " + node4.getPublishedOpinion());
        System.out.println("nodo 5 " + node5.getPublishedOpinion());
        System.out.println("nodo 6 " + node6.getPublishedOpinion());

         System.out.println("Se revisa la publicidad de los nodos");
        System.out.println("nodo 1 " + node1.isPublished());
        System.out.println("nodo 2 " + node2.isPublished());
        System.out.println("nodo 3 " + node3.isPublished());
        System.out.println("nodo 4 " + node4.isPublished());
        System.out.println("nodo 5 " + node5.isPublished());
        System.out.println("nodo 6 " + node6.isPublished());
        
        
         node4.opinionPositive();
         node5.opinionPositive();
         node3.publish();
    
       
        System.out.println("Se vuelve positiva la opinión del nodo 4 y 5");
        System.out.println("Se revisan las opiniones de los nodos");
        System.out.println("nodo 1 " + node1.getPublishedOpinion());
        System.out.println("nodo 2 " + node2.getPublishedOpinion());
        System.out.println("nodo 3 " + node3.getPublishedOpinion());
        System.out.println("nodo 4 " + node4.getPublishedOpinion());
        System.out.println("nodo 5 " + node5.getPublishedOpinion());
        System.out.println("nodo 6 " + node6.getPublishedOpinion());

         System.out.println("Se revisa la publicidad de los nodos");
        System.out.println("nodo 1 " + node1.isPublished());
        System.out.println("nodo 2 " + node2.isPublished());
        System.out.println("nodo 3 " + node3.isPublished());
        System.out.println("nodo 4 " + node4.isPublished());
        System.out.println("nodo 5 " + node5.isPublished());
        System.out.println("nodo 6 " + node6.isPublished());
        
        
        
        
    }

}
