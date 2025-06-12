/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MaintenanceRegisters;

/**
 *
 * @author rodol
 */
public class MaintenanceRegister {
    
    private String fechaMantenimiento;
    private String description;
    private String technicianName;
    private int bicycleId;
    public static final String fechaRegex = "^\\d{2}/\\d{2}/\\d{4}$";


    public String getFechaMantenimiento() {
        return fechaMantenimiento;
    }

    public String getDescription() {
        return description;
    }

    public String getTechnicianName() {
        return technicianName;
    }

    public int getBicycleId() {
        return bicycleId;
    }
    
     private boolean validateDateMaintenance(String fechaMantenimiento){
        return fechaMantenimiento.matches(fechaRegex);
    }

    public MaintenanceRegister(String fechaMantenimiento, String description, String technicianName, int bicycleId) {
        if (validateDateMaintenance(fechaMantenimiento)){
            this.fechaMantenimiento = fechaMantenimiento;
        }
        this.description = description;
        this.technicianName = technicianName;
        this.bicycleId = bicycleId;
    }

    @Override
    public String toString() {
        return "Fecha de Mantenimiento: " + fechaMantenimiento + " Descripcion del Mantinimiento: " + description +  " Nombre del Tecnico: " + technicianName + " Bicicleta Id: " + bicycleId ;
    }
}
