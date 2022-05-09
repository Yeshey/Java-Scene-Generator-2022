package gui;

import javax.swing.JButton;
import java.awt.event.*;

public class Button {
    private JButton housesButton = new JButton("Houses");

    public Button(){

    }

    public void addActionListener(ActionListener listener) {
        housesButton.addActionListener(listener);
    }

    public void actionPerformed(ActionEvent e) {
        //if (e.getSource() == buttons.getHouseButton()) {
        //    tifyUpDrawingArea();
        //    drawing.getVillage().setHouses();
        //}
    }
}