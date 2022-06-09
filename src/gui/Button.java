package gui;

/**
 * Code heavily influenced by Prof. Gottfried
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Button {
    private JButton fishesButton = new JButton("Fish");
    private JButton terrainButton = new JButton("Terrain");
    private JButton reset = new JButton("Reset");

    public void addActionListener(ActionListener listener) {
        fishesButton.addActionListener(listener);
        terrainButton.addActionListener(listener);
        reset.addActionListener(listener);
    }

    public void addButtonsToAPanel(JFrame frame) {
        JPanel menu = new JPanel();
        menu.setLayout(new GridLayout(18, 1, 15, 20));

        menu.add(fishesButton);
        menu.add(terrainButton);
        menu.add(reset);

        menu.setBorder(BorderFactory.createRaisedBevelBorder());
        frame.add(menu, BorderLayout.WEST);
    }

    public JButton getFishesButton() {
        return fishesButton;
    }

    public JButton getTerrainButton() {
        return terrainButton;
    }

    public JButton getResetButton() {
        return reset;
    }
}