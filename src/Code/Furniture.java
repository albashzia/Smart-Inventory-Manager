package Code;

public class Furniture extends Product{
    private String material;
    private String dimensions;

    public Furniture(){
        super();
        this.material = null;
        this.dimensions = null;
    }

    public Furniture(String productId, String name, double price, int quantity,String material, String dimensions){
        super(productId,name,price,quantity);
        this.material = material;
        this.dimensions = dimensions;
    }
}
