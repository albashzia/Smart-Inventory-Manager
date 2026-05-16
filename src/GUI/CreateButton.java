package GUI;

import javax.swing.*;
import java.awt.*;

public class CreateButton extends JButton {

    public CreateButton(String title, int x, int y){
        this.setLocation(x,y);
        this.setSize(160,50);
        this.setFont(new Font("Roboto", Font.BOLD, 14));
        this.setBackground(Color.BLACK);
        this.setForeground(Color.WHITE);
        this.setText(title);
        this.setOpaque(true);
        this.setFocusable(false);
    }
}
