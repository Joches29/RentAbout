/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bicycles;

/**
 *
 * @author rodol
 */
public class PedalBicycle extends Bicycle {

    public PedalBicycle(int id, String brand, BicycleStatus status) {
        super(id, brand, status);
    }

    @Override
    public String toString() {
        return "Pedal Bicyle: " + super.toString();
    }
    
    
    
}
