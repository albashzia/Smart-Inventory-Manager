package Code;

public class Electronics extends Product{
    private double warrantyYears;
    private String brand;

    public Electronics(){
        super();
        this.warrantyYears = 0;
        this.brand = null;
    }

    public Electronics(String productId, String name, double price, int quantity, double warrantyYears, String brand){
        super(productId,name,price,quantity);
        this.warrantyYears = warrantyYears;
        this.brand = brand;
    }

}
