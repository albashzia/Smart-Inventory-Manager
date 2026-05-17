package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeFrame implements ActionListener {
    CreateFrame frame = new CreateFrame();
    CreateButton addProductFrame;
    CreateButton removeProductFrame;
    CreateButton searchProductFrame;
    CreateButton viewStockFrame;
    CreateButton exitButton;

    public HomeFrame(){

        addProductFrame = new CreateButton("Add Product",100,100);
        removeProductFrame = new CreateButton("Remove Product",320,100);
        searchProductFrame = new CreateButton("Search",100,180);
        viewStockFrame = new CreateButton("View Stock",320,180);
        exitButton = new CreateButton("Exit",210,260);


        addProductFrame.addActionListener(this);
        removeProductFrame.addActionListener(this);
        searchProductFrame.addActionListener(this);
        viewStockFrame.addActionListener(this);
        exitButton.addActionListener(this);

        frame.add(addProductFrame);
        frame.add(removeProductFrame);
        frame.add(searchProductFrame);
        frame.add(viewStockFrame);
        frame.add(exitButton);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==addProductFrame){
            frame.dispose();
            new AddProductFrame();
        }
        if (e.getSource()==removeProductFrame){
            frame.dispose();
            new DeleteProductFrame();
        }
        if (e.getSource()==searchProductFrame){
            frame.dispose();
            new SearchProductFrame();
        }
        if (e.getSource()==viewStockFrame){
            frame.dispose();
            new ViewInventoryFrame();
        }
        if (e.getSource()==exitButton){
            System.exit(0);
        }

    }
}
