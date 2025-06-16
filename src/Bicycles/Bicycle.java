package Bicycles;


public class Bicycle {
    
    private int id;
    private String brand;
    private BicycleStatus status;

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public BicycleStatus getStatus() {
        return status;
    }

    public void setState(BicycleStatus status) {
            this.status = status;
    }

    public Bicycle(int id, String brand, BicycleStatus status) {
        this.id = id;
        this.brand = brand;
        this.status = BicycleStatus.AVAILABLE;
    }
    
    @Override
    public String toString(){
        return "Id: " + id + " Estado: " + status + " Marca: " + brand;
    }
    
}
