package Code;

import java.io.Serializable;

public class Grocery extends Product implements Serializable {
    private String expiryDate;
    private double weight;


    public Grocery(){
        super();
        this.expiryDate = null;
        this.weight = 0;
    }

    public Grocery(String productId, String name, double price, int quantity,String expiryDate, double weight){
        super(productId,name,price,quantity);
        this.expiryDate = expiryDate;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }
}
