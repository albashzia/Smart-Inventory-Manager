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

    public T searchProduct(String id){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getProductID().equalsIgnoreCase(id)){
                return list.get(i);
            }
        }
        return null;
    }
}
