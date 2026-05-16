package GUI;

public class HomeFrame {
    CreateFrame frame = new CreateFrame();
    CreateButton addProductFrame;
    CreateButton removeProductFrame;
    CreateButton searchProductFrame;
    CreateButton updateStockFrame;
    CreateButton exitButton;

    public HomeFrame(){

        addProductFrame = new CreateButton("Add Product",100,100);
        removeProductFrame = new CreateButton("Remove Product",320,100);
        searchProductFrame = new CreateButton("Search",100,180);
        updateStockFrame = new CreateButton("Update Stock",320,180);
        exitButton = new CreateButton("Exit",210,260);



        frame.add(addProductFrame);
        frame.add(removeProductFrame);
        frame.add(searchProductFrame);
        frame.add(updateStockFrame);
        frame.add(exitButton);

        frame.setVisible(true);
    }
}
