/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentRegisters;

/**
 *
 * @author rodol
 */
public class RentRegister {
    
    private String fechaInicio;
    private int bicycleId;
    private int userId;
    private String fechaFinalizacion;
    public static final String fechaRegex = "^\\d{2}/\\d{2}/\\d{4}$";

    public String getFechaInicio() {
        return fechaInicio;
    }

    public int getBicycleId() {
        return bicycleId;
    }

    public int getUserId() {
        return userId;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        if (validateDateFinal(fechaFinalizacion)){
            this.fechaFinalizacion = fechaFinalizacion;
        }
    }
    
    public void setFechaInicio(String fechaInicio) {
         if (validateDateStart(fechaInicio)){
             this.fechaInicio = fechaInicio;
         }
    }
    
    private boolean validateDateFinal(String fechaFinalizacion){
        return fechaFinalizacion.matches(fechaRegex);
    }
    
    private boolean validateDateStart(String fechaInicio){
        return fechaInicio.matches(fechaRegex);
    }

    

    public RentRegister(String fechaInicio, int bicycleId, int userId, String fechaFinalizacion) {
        this.fechaInicio = fechaInicio;
        this.bicycleId = bicycleId;
        this.userId = userId;
         if (validateDateFinal(fechaFinalizacion)){
            this.fechaFinalizacion = fechaFinalizacion;
        }
    }

    @Override
    public String toString() {
        return "Fecha de Inicio del Alquiler: " + fechaInicio + "Bicycle Id: " + bicycleId + " User Id: " + userId + " Fecha de Finalizacion del Alquiler: " + fechaFinalizacion + '}';
    }
  
    
    
}
