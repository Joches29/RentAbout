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
    
    private int nivelCombustible;

    public int getNivelCombustible() {
        return nivelCombustible;
    }

    public void setNivelCombustible(int nivelCombustible) {
        this.nivelCombustible = nivelCombustible;
    }

    public GasBicycle( int id,  String brand) {
        super(id, brand);
        this.nivelCombustible = 100;
    }

    @Override
    public String toString() {
        return "Gas Bicycle: " + super.toString() + " Nivel Combustible: " + nivelCombustible + "%";
    }
    
    
    
}
