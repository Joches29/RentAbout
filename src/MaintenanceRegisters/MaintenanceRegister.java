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

    public MaintenanceRegister(String fechaMantenimiento, String description, String technicianName, int bicycleId) {
        this.fechaMantenimiento = fechaMantenimiento;
        this.description = description;
        this.technicianName = technicianName;
        this.bicycleId = bicycleId;
    }

    @Override
    public String toString() {
        return "Fecha de Mantenimiento: " + fechaMantenimiento + " Descripcion del Mantinimiento: " + description +  " Nombre del Tecnico: " + technicianName + " Bicicleta Id: " + bicycleId ;
    }
}
