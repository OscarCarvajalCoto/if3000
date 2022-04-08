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
public class Node {

    private String name;
    private boolean opinion = false;
    private ArrayList<Node> friends=null;
    

    public Node(String name) {
        this.name = name;
        
    }
    
    public Node connect(Node nodeName){
        
        
        return nodeName;
    }
    public String getName() {
        return name;
    }
    
  
    public boolean isOpinion() {
        return opinion;
    }

    public void setOpinion(boolean opinion) {
        this.opinion = opinion;
    }

    public ArrayList<Node> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<Node> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Node{" + "name=" + name + ", opinion=" + opinion + ", friends=" + friends + '}';
    }

    

    

  

 
    
    


}
