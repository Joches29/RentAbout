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
    
    public Bicycle (int id, String brand){
        this.id = id;
        this.status = BicycleStatus.AVAILABLE;
        this.brand = brand;
    }
    
    
}
