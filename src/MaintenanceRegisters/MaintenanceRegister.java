/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MaintenanceRegisters;
import java.time.LocalDateTime;
import Persons.Technician;
import Bicycles.Bicycle;
/**
 *
 * @author rodol
 */
public class MaintenanceRegister {
    
    private LocalDateTime maintenanceDate;
    private String description;
    private Technician technician;
    private Bicycle bicycle;


    public LocalDateTime getMaintenanceDate() {
        return maintenanceDate;
    }

    public String getDescription() {
        return description;
    }

    public Technician getTechnician() {
        return technician;
    }

    public Bicycle getBicycleId() {
        return bicycle;
    }

    public void setMaintenanceDate(LocalDateTime maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }

    public void setBicycleId(Bicycle bicycle) {
        this.bicycle = bicycle;
    }    

    public MaintenanceRegister(LocalDateTime maintenanceDate, String description, Technician technician, Bicycle bicycle) {
        this.maintenanceDate = maintenanceDate;
        this.description = description;
        this.technician = technician;
        this.bicycle = bicycle;
    }

    @Override
    public String toString() {
        return "Maintenance Register: " + " Fecha: " + maintenanceDate + " Descripcion: " + description +  " Tecnico: " + technician + " Bicicleta: " + bicycle ;
    }
}
