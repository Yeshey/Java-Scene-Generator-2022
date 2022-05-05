/**
 * Provides a panel which can be used for drawing.
 *
 * @author Björn Gottfried
 * @version 1.0
 */

package drawingTool;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class DrawingArea extends JPanel implements ActionListener{
    private static final long serialVersionUID = 1L;

    private JPanel westPanel = new JPanel();
    private JButton b1 = new JButton("1");
    
    protected void paintComponent(Graphics pen) {
        super.paintComponent(pen);
        
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
        
        Drawing.set(pen); // We need this before being able to draw anything
        Scene Ocean = new Scene();
        Ocean.draw();
        
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