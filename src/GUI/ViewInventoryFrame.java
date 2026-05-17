package GUI;

import Code.InventoryManager;
import Code.Product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ViewInventoryFrame implements ActionListener {

    CreateFrame frame = new CreateFrame();
    JTextArea displayArea;
    CreateButton refreshBtn;
    CreateButton backBtn;

    public ViewInventoryFrame() {
        frame.setTitle("Current Stock Levels");

        // Main Header Label
        JLabel label = new JLabel("Warehouse Inventory Stock Records", SwingConstants.CENTER);
        label.setBounds(50, 20, 500, 30);
        frame.add(label);

        // Editable false Text Area for display
        displayArea = new JTextArea();
        displayArea.setEditable(false);
        displayArea.setFont(new Font("Monospaced", Font.PLAIN, 13));

        // JScrollPane to allow scrolling when records exceed window dimensions
        JScrollPane scrollPane = new JScrollPane(displayArea);
        scrollPane.setBounds(50, 70, 480, 180);
        frame.add(scrollPane);

        // Refresh Action Button
        refreshBtn = new CreateButton("Refresh Data", 100, 280);
        refreshBtn.addActionListener(this);
        frame.add(refreshBtn);

        // Back to Dashboard Button
        backBtn = new CreateButton("Back", 320, 280);
        backBtn.addActionListener(this);
        frame.add(backBtn);

        // Populate records automatically upon opening the screen
        updateStockDisplay();

        frame.setVisible(true);
    }

    // Method to fetch data from the generic structure and append to UI text canvas
    private void updateStockDisplay() {
        ArrayList<Product> products = InventoryManager.inventory.getAllProducts();

        if (products.isEmpty()) {
            displayArea.setText("--- Warehouse Empty ---\nNo product records found in the database.");
            return;
        }

        String data = "============= WAREHOUSE INVENTORY STATUS =============\n\n";

        int count = 1;
        for (Product p : products) {
            data += count + ". " + p.getClass().getSimpleName().toUpperCase() + "\n";
            data += p.toString() + "\n";
            data += "--------------------------------------------------\n";
            count++;
        }

        displayArea.setText(data);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle explicit manual refresh event
        if (e.getSource() == refreshBtn) {
            updateStockDisplay();
            JOptionPane.showMessageDialog(frame, "Inventory display updated to latest state!");
        }
        // Handle Back Navigation
        else if (e.getSource() == backBtn) {
            frame.dispose();
            new HomeFrame();
        }
    }
}