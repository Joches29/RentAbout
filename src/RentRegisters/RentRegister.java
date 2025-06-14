/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RentRegisters;
import java.time.LocalDateTime;
import Bicycles.Bicycle;
import Persons.User;
/**
 *
 * @author rodol
 */
public class RentRegister {
    
    private int id;
    private Bicycle bicycle;
    private User user;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    
     public int getId() {
        return id;
    }

    public Bicycle getBicycle() {
        return bicycle;
    }

    public User getUser() {
        return user;
    }
    
    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public void setBicycle(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public RentRegister(int id, Bicycle bicycle, User user, LocalDateTime startDate, LocalDateTime endDate) {
        this.id = id;
        this.bicycle = bicycle;
        this.user = user;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "RentRegister: " + " Id: " + id + " Bicycle: " + bicycle + " User: " + user + " Start Date: " + startDate + " End Date: " + endDate;
    }
}
