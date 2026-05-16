package GUI;

import javax.swing.*;

public class DeleteProductFrame {
    CreateFrame frame = new CreateFrame();

    public DeleteProductFrame() {
        frame.setTitle("Remove Product");

        JLabel label = new JLabel("Enter Product ID to Remove:", SwingConstants.CENTER);
        label.setBounds(50, 30, 500, 30);
        frame.add(label);

        CreateButton deleteBtn = new CreateButton("Delete", 210, 280);
        frame.add(deleteBtn);

        frame.setVisible(true);
    }
}
