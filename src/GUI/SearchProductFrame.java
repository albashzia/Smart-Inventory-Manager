package GUI;

import Code.InventoryManager;
import Code.Product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchProductFrame implements ActionListener {
    CreateFrame frame = new CreateFrame();
    JTextField idField;
    JTextArea resultArea;
    CreateButton searchBtn;
    CreateButton backBtn;

    public SearchProductFrame() {
        frame.setTitle("Search Inventory");

        // Instructional Label
        JLabel label = new JLabel("Search by Product ID:", SwingConstants.CENTER);
        label.setBounds(50, 20, 500, 30);
        frame.add(label);

        // Input Text Field
        idField = new JTextField();
        idField.setBounds(200, 60, 200, 30);
        frame.add(idField);

        // Result Display Area
        resultArea = new JTextArea("Enter an ID above and click Find.");
        resultArea.setBounds(100, 110, 400, 130);
        resultArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
        resultArea.setEditable(false);
        resultArea.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
        frame.add(resultArea);

        // Find Action Button
        searchBtn = new CreateButton("Find", 100, 270);
        searchBtn.addActionListener(this);
        frame.add(searchBtn);

        // Back to Dashboard Button
        backBtn = new CreateButton("Back", 320, 270);
        backBtn.addActionListener(this);
        frame.add(backBtn);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle Search Action
        if (e.getSource() == searchBtn) {
            String productId = idField.getText().trim();

            if (productId.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please enter a Product ID to search!", "Input Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Look up the product using our Generic Inventory search logic
            Product foundProduct = InventoryManager.inventory.searchProduct(productId);

            if (foundProduct != null) {
                // Display the details using the polymorphic toString() implementation
                resultArea.setText("--- Product Found ---\n" + foundProduct.toString());
            } else {
                resultArea.setText("");
                JOptionPane.showMessageDialog(frame, "No product found with ID: " + productId, "Not Found", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        // Handle Back Action
        else if (e.getSource() == backBtn) {
            frame.dispose();
            new HomeFrame();
        }
    }
}