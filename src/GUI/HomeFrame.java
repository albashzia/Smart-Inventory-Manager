package GUI;

public class HomeFrame {
    CreateFrame frame = new CreateFrame();
    CreateButton addProductFrame;
    CreateButton removeProductFrame;
    CreateButton searchProductFrame;
    CreateButton updateStockFrame;
    CreateButton exitButton;

    public HomeFrame(){

        addProductFrame = new CreateButton("Add Product",100,150);
        removeProductFrame = new CreateButton("Remove Product",200,150);
        searchProductFrame = new CreateButton("Search",300,150);
        updateStockFrame = new CreateButton("Update Stock",400,150);
        exitButton = new CreateButton("Exit",300,300);



        frame.add(addProductFrame);
        frame.add(removeProductFrame);
        frame.add(searchProductFrame);
        frame.add(updateStockFrame);
        frame.add(exitButton);

        frame.setVisible(true);
    }
}
