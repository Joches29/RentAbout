/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package RentAbouts;

import Bicycles.Bicycle;
import Bicycles.BicycleList;
import Bicycles.ElectricBicycle;
import Bicycles.GasBicycle;


/**
 *
 * @author rodol
 */
public class RentAbout {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle b1 = new Bicycle(1,"Superpro");
        ElectricBicycle b2 = new ElectricBicycle(2,"Energy");
        GasBicycle b3 = new GasBicycle(3,"Gas");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        
        BicycleList bicycleList = new BicycleList();
        System.out.println(bicycleList.add(b1));
        System.out.println(bicycleList.add(b2));
        System.out.println(bicycleList.add(b3));
        
        System.out.println(bicycleList.search(2));
        bicycleList.delete(b1);
        System.out.println(bicycleList.search(1));
        
       
        
        
    }
    
}
