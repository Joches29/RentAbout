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
    // duda lista bicicletas como se hace
    private int [] bicycleList;

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int[] getBicycleList() {
        return bicycleList;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setBicycleList(int[] bicycleList) {
        this.bicycleList = bicycleList;
    }

    public Station(int id, String location, int maxCapacity) {
        this.id = id;
        this.location = location;
        this.maxCapacity = maxCapacity;
        this.bicycleList = new int [maxCapacity];
    }

    @Override
    public String toString() {
        return "Station: " + " Id: " + id + " Location: " + location + " Max Capacity: " + maxCapacity;
    }
}
