/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RentAbouts;
import Persons.User;
import Persons.Technician;

/**
 *
 * @author rodol
 */
public class RentAbout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User u1 = new User(2, "Leandro","adawndajwnd@est.utn.ac.cr", "88818552");
        Technician t1 = new Technician(3, "Marco", "owndjanwd@est.utn.ac.cr", "Llantas");
        System.out.println(u1);
        System.out.println(t1);
        
    }
    
}
