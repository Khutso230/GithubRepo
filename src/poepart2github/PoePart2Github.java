/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poepart2github;

/**
 *
 * @author RC_Student_lab
 */
public class PoePart2Github {

    /**
     * @param args the command line arguments
     */
    static Student studi= new Student ();
    public static void main(String[] args) {
        // TODO code application logic here
        
        String name="Ephraim";
        String Surname="Nobela";
        
        studi.setName(name);
        studi.setSname(Surname);
        
        System.out.println(" Your name is " + studi.getName());
        System.out.println(" Your name is " + studi.getSname());
    }
    
}
