package gui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import animal.Anglerfish;
import animal.Fish;

import javax.swing.*;

//import drawingTool.Drawing;

public class Scene extends JPanel implements ActionListener {
	//public Scene() {
	//}
    Button guiButton;
    private JPanel westPanel = new JPanel();
    private JButton b1 = new JButton("2");

    public Scene(){
        guiButton = new Button();
    }

	public void draw() {
        String color = "#ffff00";

        Drawing.pen().setColor(Color.decode(color)); // a color constant
        Drawing.pen().fillRect(10, 10, 200, 300);

        Drawing.pen().setColor(Color.decode("#7a5230")); // HEX representation
        Drawing.pen().fillOval(300, 234, 800, 100);

        Drawing.pen().setColor(new Color(255,100,100)); // RGB representation
        Drawing.pen().drawString("Hello World", 666, 280);
        
        // Draw the triangle
        int[] polygonX = {10, 60, 30};
        int[] polygonY = {10, 10, 60};
        int polygonN = 3;
        Drawing.pen().drawPolygon(polygonX, polygonY, polygonN);
		Drawing.pen().drawLine(100, 200, 800, 800);


        // ------------- Layout Tests ------------- //
        //setLayout(new BorderLayout());
        setLayout(new GridLayout(12,1,15,20));
        setLayout(new FlowLayout());


        add(westPanel, BorderLayout.WEST);
        //private JButton b1 = new JButton("1");
        b1.setToolTipText("This text appears when mouse hovers");
        b1.addActionListener(this); // needs implements ActionListener
        westPanel.add(b1, BorderLayout.SOUTH); // or you could just do add, it doesnt have to be in a panel

        /*
        public class Buttons{
        	private JButton housesButton = new JButton("Houses");

	        public void addActionListener(ActionListener listener) {
	        	housesButton.addActionListener(listener)
	        }

	        public void actionPerformed(ActionEvent e) {
	        	if (e.getSource() == buttons.getHouseButton()) {
	        		tifyUpDrawingArea();
	        		drawing.getVillage().setHouses();
	        	}
	        }
        }*/

        // ------------- Layout Tests ------------- //

		
        Fish funny = new Fish(400,260);
        funny.draw();
        
        ArrayList<Anglerfish> fishGroup = new ArrayList<Anglerfish>();
        for (int i=0; i < 5; i++) {
        	fishGroup.add(new Anglerfish(300+ 100*i, 260));
        }
        //lanternFish myLanternFish = new lanternFish(300, 260);
        for (Anglerfish f : fishGroup) {
        	f.draw();	
        }
        
	}
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionPerformed " + (((JButton)/*This is a cast*/(e.getSource())).getText()));
        if ( (((JButton)(e.getSource())).getText().equals("1")) ) {
            System.out.println("A button with he number 1 on it has been pushed");
        }
        //if (b1)
    }
}
