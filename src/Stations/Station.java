/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stations;
import Bicycles.Bicycle;
/**
 *
 * @author rodol
 */
public class Station {
    
    private int id;
    private String location;
    private int maxCapacity;
    // duda lista bicicletas como se hace
    private Bicycle bicycleList[];

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public Bicycle[] getBicycleList() {
        return bicycleList;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public Station(int id, String location, int maxCapacity) {
        this.id = id;
        this.location = location;
        this.maxCapacity = maxCapacity;
        this.bicycleList = new Bicycle [maxCapacity];
    }
    
    public void addBicycle(Bicycle Locker) {
        for (int i = 0; i < maxCapacity; i++) {
            if(bicycleList[i]==null){
                bicycleList[i]=Locker;
                break;
                        }
        }
    }

    @Override
    public String toString() {
        return "Station: " + " Id: " + id + " Location: " + location + " Max Capacity: " + maxCapacity;
    }
}
