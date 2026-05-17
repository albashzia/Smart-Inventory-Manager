package GUI;

import Code.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddProductFrame implements ActionListener
{
    CreateFrame frame = new CreateFrame();
    JComboBox<String> typeBox;

    JTextField idField;
    JTextField nameField;
    JTextField priceField;
    JTextField quantityField;
    JTextField extra1Field;
    JTextField extra2Field;

    JLabel extra1Label;
    JLabel extra2Label;

    CreateButton saveBtn;

    public AddProductFrame()
    {
        frame.setTitle("Add New Product");
        // Heading
        JLabel heading = new JLabel("Enter Product Details", SwingConstants.CENTER);
        heading.setBounds(170,20,250,30);

        // Product Type
        JLabel typeLabel = new JLabel("Product Type:");
        typeLabel.setBounds(50,70,120,25);

        String[] types = {
                "Electronics",
                "Furniture",
                "Grocery"
        };

        typeBox = new JComboBox<>(types);
        typeBox.setBounds(180,70,150,25);
        typeBox.addActionListener(this);

        // Product ID
        JLabel idLabel = new JLabel("Product ID:");
        idLabel.setBounds(50,110,120,25);

        idField = new JTextField();
        idField.setBounds(180,110,150,25);

        // Name
        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50,150,120,25);

        nameField = new JTextField();
        nameField.setBounds(180,150,150,25);

        // Price
        JLabel priceLabel = new JLabel("Price:");
        priceLabel.setBounds(50,190,120,25);

        priceField = new JTextField();
        priceField.setBounds(180,190,150,25);

        // Quantity
        JLabel quantityLabel = new JLabel("Quantity:");
        quantityLabel.setBounds(50,230,120,25);

        quantityField = new JTextField();
        quantityField.setBounds(180,230,150,25);

        // Extra 1
        extra1Label = new JLabel("Warranty:");
        extra1Label.setBounds(350,110,120,25);

        extra1Field = new JTextField();
        extra1Field.setBounds(430,110,120,25);

        // Extra 2
        extra2Label = new JLabel("Brand:");
        extra2Label.setBounds(350,150,120,25);

        extra2Field = new JTextField();
        extra2Field.setBounds(430,150,120,25);

        // Save Button
        saveBtn = new CreateButton("Save Product", 210, 300);

        saveBtn.addActionListener(this);

        // Add Components
        frame.add(heading);

        frame.add(typeLabel);
        frame.add(typeBox);

        frame.add(idLabel);
        frame.add(idField);

        frame.add(nameLabel);
        frame.add(nameField);

        frame.add(priceLabel);
        frame.add(priceField);

        frame.add(quantityLabel);
        frame.add(quantityField);

        frame.add(extra1Label);
        frame.add(extra1Field);

        frame.add(extra2Label);
        frame.add(extra2Field);

        frame.add(saveBtn);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Type Selection
        if (e.getSource() == typeBox) {
            String selected = (String) typeBox.getSelectedItem();

            if (selected.equals("Electronics"))
            {
                extra1Label.setText("Warranty:");
                extra2Label.setText("Brand:");
            }

            else if (selected.equals("Furniture"))
            {
                extra1Label.setText("Material:");
                extra2Label.setText("Dimensions:");
            }

            else
            {
                extra1Label.setText("Expiry:");
                extra2Label.setText("Weight:");
            }
        }

        // Save Button
        else if (e.getSource() == saveBtn)
        {
            try
            {
                String type = (String) typeBox.getSelectedItem();

                String id = idField.getText();

                String name = nameField.getText();

                double price = Double.parseDouble(priceField.getText());

                int quantity = Integer.parseInt(quantityField.getText());

                String extra1 = extra1Field.getText();

                String extra2 = extra2Field.getText();

                Product product;

                if (type.equals("Electronics")) {
                    product = new Electronics(
                            id,
                            name,
                            price,
                            quantity,
                            Double.parseDouble(extra1),
                            extra2
                    );
                }

                else if (type.equals("Furniture")) {
                    product = new Furniture(
                            id,
                            name,
                            price,
                            quantity,
                            extra1,
                            extra2
                    );
                }

                else {
                    product = new Grocery(
                            id,
                            name,
                            price,
                            quantity,
                            extra1,
                            Double.parseDouble(extra2)
                    );
                }

                JOptionPane.showMessageDialog(
                        frame,
                        "Product Created Successfully"
                );

                System.out.println(
                        product.getName()
                );

            }

            catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        frame,
                        "Invalid Input!"
                );
            }
        }
    }
}