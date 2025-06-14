/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bicycles;

/**
 *
 * @author rodol
 */
public class ElectricBicycle extends Bicycle{
    
    private String nivelBateria;

    public String getNivelBateria() {
        return nivelBateria;
    }
    
    public void setNivelBateria(String nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public ElectricBicycle(String nivelBateria, int id, String brand, BicycleStatus status) {
        super(id, brand, status);
        this.nivelBateria = nivelBateria;
    }

    @Override
    public String toString() {
        return "Electric Bicycle: " + super.toString() +  " Nivel Bateria: " + nivelBateria;
    }
    
    
    
}
