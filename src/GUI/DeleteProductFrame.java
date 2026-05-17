package GUI;

import Code.FileHandler;
import Code.InventoryManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteProductFrame implements ActionListener {
    CreateFrame frame = new CreateFrame();
    JTextField idField;
    CreateButton deleteBtn;
    CreateButton backBtn;

    public DeleteProductFrame() {
        frame.setTitle("Remove Product");

        // Instructional Label
        JLabel label = new JLabel("Enter Product ID to Remove:", SwingConstants.CENTER);
        label.setBounds(50, 40, 500, 30);
        frame.add(label);

        // Text Field for Product ID Input
        idField = new JTextField();
        idField.setBounds(200, 100, 200, 30);
        frame.add(idField);

        // Delete Action Button
        deleteBtn = new CreateButton("Delete", 100, 220);
        deleteBtn.addActionListener(this);
        frame.add(deleteBtn);

        // Back to Dashboard Button
        backBtn = new CreateButton("Back", 320, 220);
        backBtn.addActionListener(this);
        frame.add(backBtn);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle Delete Action
        if (e.getSource() == deleteBtn) {
            String productId = idField.getText().trim();

            if (productId.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Please enter a Product ID!", "Input Error", JOptionPane.WARNING_MESSAGE);
                return;
            }

            // Attempt to remove the product utilizing our Generic Inventory method
            boolean isDeleted = InventoryManager.inventory.deleteProduct(productId);

            if (isDeleted) {
                // Save changes to inventory.dat file immediately to ensure persistence
                FileHandler.saveInventory(InventoryManager.inventory);

                JOptionPane.showMessageDialog(frame, "Product with ID '" + productId + "' removed successfully!");
                idField.setText(""); // Clear field on success
            } else {
                JOptionPane.showMessageDialog(frame, "Product ID not found in inventory!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        // Handle Back Action
        else if (e.getSource() == backBtn) {
            frame.dispose();
            new HomeFrame();
        }
    }
}