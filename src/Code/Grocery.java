package Code;

public class Grocery extends Product{
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

}
