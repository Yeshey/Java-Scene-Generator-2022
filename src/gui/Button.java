package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Button extends JPanel implements ActionListener{
    private JButton fishesButton;
    private JButton terrainButton;
    private JButton lightingButton;
    private JPanel westPanel;

    public Button(){
        fishesButton = new JButton("Fishes");
        fishesButton.setToolTipText("Make fishes appear");

        terrainButton = new JButton("Terrain");
        fishesButton.setToolTipText("Make terrain appear");

        lightingButton = new JButton("Lighting");
        fishesButton.setToolTipText("change lighting");

        addActionListener(this); // needs implements ActionListener

        westPanel = new JPanel();

        //setLayout(new BorderLayout());
        //setLayout(new GridLayout(12,1,15,20));
        setLayout(new FlowLayout());

        addToScene();

        add(westPanel, BorderLayout.WEST);
    }

    public void addToScene(){
        westPanel.add(fishesButton, BorderLayout.SOUTH);
        westPanel.add(terrainButton, BorderLayout.SOUTH);
        westPanel.add(lightingButton, BorderLayout.SOUTH);
        System.out.println("OK");
    }

    public void addActionListener(ActionListener listener) {
        fishesButton.addActionListener(listener);
        terrainButton.addActionListener(listener);
        lightingButton.addActionListener(listener);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionPerformed " + (((JButton)/*This is a cast*/(e.getSource())).getText()));
        if ( (((JButton)(e.getSource())).getText().equals("Fishes")) ) {
            System.out.println("A button with he number 1 on it has been pushed");
        }
        //if (b1)
    }
}