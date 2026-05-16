package GUI;

import javax.swing.*;

public class SearchProductFrame {
    CreateFrame frame = new CreateFrame();

    public SearchProductFrame() {
        frame.setTitle("Search Inventory");

        JLabel label = new JLabel("Search by Product ID:", SwingConstants.CENTER);
        label.setBounds(50, 30, 500, 30);
        frame.add(label);

        CreateButton searchBtn = new CreateButton("Find", 210, 280);
        frame.add(searchBtn);

        frame.setVisible(true);
    }
}
