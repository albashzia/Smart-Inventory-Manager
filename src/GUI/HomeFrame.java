package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeFrame implements ActionListener {
    CreateFrame frame = new CreateFrame();
    JLabel titleLabel;
    CreateButton addProductFrame;
    CreateButton removeProductFrame;
    CreateButton searchProductFrame;
    CreateButton viewStockFrame;
    CreateButton exitButton;

    public HomeFrame(){
        // Title Label at the top
        titleLabel = new JLabel("Smart Inventory Management System", SwingConstants.CENTER);
        titleLabel.setBounds(50, 30, 500, 40);
        titleLabel.setFont(new Font("Roboto", Font.BOLD, 20));
        titleLabel.setForeground(Color.BLACK);

        // Sub-frame Trigger Buttons
        addProductFrame = new CreateButton("Add Product", 100, 110);
        removeProductFrame = new CreateButton("Remove Product", 320, 110);
        searchProductFrame = new CreateButton("Search", 100, 190);
        viewStockFrame = new CreateButton("View Stock", 320, 190);
        exitButton = new CreateButton("Exit", 210, 270);

        // Adding Action Listeners
        addProductFrame.addActionListener(this);
        removeProductFrame.addActionListener(this);
        searchProductFrame.addActionListener(this);
        viewStockFrame.addActionListener(this);
        exitButton.addActionListener(this);

        // Compiling Interface Layout
        frame.add(titleLabel);
        frame.add(addProductFrame);
        frame.add(removeProductFrame);
        frame.add(searchProductFrame);
        frame.add(viewStockFrame);
        frame.add(exitButton);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addProductFrame) {
            frame.dispose();
            new AddProductFrame();
        }
        if (e.getSource() == removeProductFrame) {
            frame.dispose();
            new DeleteProductFrame();
        }
        if (e.getSource() == searchProductFrame) {
            frame.dispose();
            new SearchProductFrame();
        }
        if (e.getSource() == viewStockFrame) {
            frame.dispose();
            new ViewInventoryFrame();
        }
        if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }
}