package Code;

import java.io.Serializable;

public class Furniture extends Product implements Serializable {
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

    public String getMaterial() {
        return material;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}
