package Code;

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

}
