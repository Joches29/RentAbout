/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bicycles;
/**
 *
 * @author rodol
 */
public class GasBicycle extends Bicycle{
    
    private String nivelCombustible;

    public String getNivelCombustible() {
        return nivelCombustible;
    }

    public void setNivelCombustible(String nivelCombustible) {
        this.nivelCombustible = nivelCombustible;
    }

    public GasBicycle(String nivelCombustible, int id, String brand, BicycleStatus status) {
        super(id, brand, status);
        this.nivelCombustible = nivelCombustible;
    }

    @Override
    public String toString() {
        return "Gas Bicycle: " + super.toString() + " Nivel Combustible: " + nivelCombustible;
    }
    
    
    
}
