/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author Asus
 */
public class MainPerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person pr = new Person("Galih", "Garut", "0000", 19);
        
        System.out.println(pr.toString());
        
        Person pr2 = new Person();
        
        pr2.setName("Galih");
        pr2.setAge(19);
        pr2.setAddress("Garut");
        pr2.setNhp("0000");
        System.out.println(pr2.toString());
        
             
        
    }
    
}
