package Code;

import java.util.ArrayList;

public class Inventory <T extends Product>{
    ArrayList<T> list = new ArrayList<>();

    public void addProduct(T product){
        list.add(product);
    }

    public void deleteProduct(T product){
        list.remove(product);
    }
}
