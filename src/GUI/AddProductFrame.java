package GUI;

import javax.swing.*;

public class AddProductFrame {
    CreateFrame frame = new CreateFrame();

    public AddProductFrame() {
        frame.setTitle("Add New Product");

        JLabel label = new JLabel("Enter Product Details Below:", SwingConstants.CENTER);
        label.setBounds(50, 30, 500, 30);
        frame.add(label);

        CreateButton saveBtn = new CreateButton("Save Product", 210, 280);
        frame.add(saveBtn);

        frame.setVisible(true);
    }
}
