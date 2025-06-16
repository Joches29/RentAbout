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
    
    private int nivelBateria;

    public int getNivelBateria() {
        return nivelBateria;
    }
    
    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    public ElectricBicycle(int id, String brand) {
        super(id, brand);
        this.nivelBateria = 100;
    }

    @Override
    public String toString() {
        return "Electric Bicycle: " + super.toString() +  " Nivel Bateria: " + nivelBateria + "%";
    }
    
    
    
}
