package Code;
import java.util.*;
import java.io.*;

public class FileHandler {

    private static final String FILE_NAME = "inventory.dat";

    public static void saveInventory(Inventory<Product> inventory)
    {
        try
        {
            ObjectOutputStream out =new ObjectOutputStream(new FileOutputStream(FILE_NAME));
            out.writeObject(inventory.getAllProducts());
            out.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void loadInventory(){
        try
        {
            ObjectInputStream in =new ObjectInputStream(new FileInputStream(FILE_NAME));
            InventoryManager.inventory =new Inventory<>();
            ArrayList<Product> list = (ArrayList<Product>)in.readObject();

            for(Product p : list)
            {
                InventoryManager.inventory.addProduct(p);
            }
            in.close();

        }
        catch(Exception e)
        {
            System.out.println("No previous inventory found");
        }
    }

}
