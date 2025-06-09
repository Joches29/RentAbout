/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Bicycles;

/**
 *
 * @author rodol
 */

//Estructura basica de un Enum
public enum BicycleStatus {
    AVAILABLE ("Available"),
    RENTED ("Rented"),
    MAINTENANCE("Maintenance");
    
    // va a guardar los valores ^
    private final String status;
    
    // constructor
    BicycleStatus(String status){
        this.status = status;
    }
    
    // getter
    public String getStatus(){
        return status;
    }
    
    //toString
    public String toString(){
        return status;
    }
}
