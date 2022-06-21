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
    private JButton resetButton = new JButton("Reset");
    private JButton randomColorButton = new JButton("Random color");
    private JButton dayStateButton = new JButton("Turn day");
    private JButton eveningStateButton = new JButton("Turn evening");
    private JButton nightStateButton = new JButton("Turn night");
    private JButton sharkAttackStateButton = new JButton("SHARK ATTACK!");

    public void addActionListener(ActionListener listener) {
        fishesButton.addActionListener(listener);
        terrainButton.addActionListener(listener);
        resetButton.addActionListener(listener);
        randomColorButton.addActionListener(listener);
        dayStateButton.addActionListener(listener);
        eveningStateButton.addActionListener(listener);
        sharkAttackStateButton.addActionListener(listener);
        nightStateButton.addActionListener(listener);
    }

    public void addButtonsToAPanel(JFrame frame) {
        JPanel menu = new JPanel();
        menu.setLayout(new GridLayout(18, 1, 15, 20));

        menu.add(fishesButton);
        menu.add(terrainButton);
        menu.add(resetButton);
        menu.add(randomColorButton);
        menu.add(dayStateButton);
        menu.add(eveningStateButton);
        menu.add(nightStateButton);
        menu.add(sharkAttackStateButton);

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
        return resetButton;
    }

    public JButton getRandomColorButton() {
        return randomColorButton;
    }

    public JButton getDayStateButton() {
        return dayStateButton;
    }

    public JButton getEveningStateButton() {
        return eveningStateButton;
    }

    public JButton getNightStateButton() {
        return nightStateButton;
    }

    public JButton getSharkAttackStateButton() {
        return sharkAttackStateButton;
    }
}