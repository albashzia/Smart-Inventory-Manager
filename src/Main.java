import Code.FileHandler;
import GUI.HomeFrame;

public class Main {
    public static void main(String[] args){
        FileHandler.loadInventory();
        new HomeFrame();
    }
}
