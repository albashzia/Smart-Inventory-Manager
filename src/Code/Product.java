package Code;

abstract public class Product {

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


    public void setProductID(String productID){
        this.productID = productID;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public String getProductID(){
        return productID;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }

}
