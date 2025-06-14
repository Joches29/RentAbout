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
    private Bicycle bike;
    private User user;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    
     public int getId() {
        return id;
    }

    public Bicycle getBike() {
        return bike;
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

    public RentRegister(int id, Bicycle bike, User user, LocalDateTime startDate, LocalDateTime endDate) {
        this.id = id;
        this.bike = bike;
        this.user = user;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "RentRegister{" + "id=" + id + ", bike=" + bike + ", user=" + user + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }

    
    
}
