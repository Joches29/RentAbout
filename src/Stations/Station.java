/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stations;

/**
 *
 * @author rodol
 */
public class Station {
    
    private int id;
    private String location;
    private int maxCapacity;

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Station(int id, String location, int maxCapacity) {
        this.id = id;
        this.location = location;
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return "Station Id: " + id + " Station Location :" + location + " Station Max Capacity: " + maxCapacity;
    }
}
