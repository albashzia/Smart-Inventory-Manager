package Code;

public class Product {

    private String productID;
    private String name;
    private double price;
    private int quantity;

    public Product(){
        this.productID = null;
        this.name = null;
        this.price = 0;
        this.quantity = 0;
    }

    public Product(String productID, String name, double price, int quantity){
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

}
