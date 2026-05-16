package GUI;

import javax.swing.*;

public class ViewInventoryFrame {

    CreateFrame frame = new CreateFrame();

    public ViewInventoryFrame() {
        frame.setTitle("Current Stock Levels");

        JLabel label = new JLabel("Warehouse Inventory Stock Records", SwingConstants.CENTER);
        label.setBounds(50, 20, 500, 30);
        frame.add(label);

        JTextArea displayArea = new JTextArea("No records loaded yet.");
        displayArea.setBounds(50, 70, 480, 180);
        displayArea.setEditable(false);
        frame.add(displayArea);

        CreateButton refreshBtn = new CreateButton("Refresh Data", 210, 280);
        frame.add(refreshBtn);

        frame.setVisible(true);
    }
}
