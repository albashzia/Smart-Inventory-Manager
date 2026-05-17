package Code;

import java.util.ArrayList;

public class Inventory <T extends Product>{
    private ArrayList<T> list = new ArrayList<>();

    public ArrayList<T> getAllProducts(){
        return list;
    }

    public void addProduct(T product){
        list.add(product);
    }

    public boolean deleteProduct(String id){
        T product = searchProduct(id);

        if(product != null){
            list.remove(product);
            return true;
        }

        return false;
    }

    public T searchProduct(String id){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getProductID().equalsIgnoreCase(id)){
                return list.get(i);
            }
        }
        return null;
    }

    public void updateStock(T product, int newStock){
        product.setQuantity(newStock);
    }

}
