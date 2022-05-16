/**
 * Provides a panel which can be used for drawing.
 *
 * @author Björn Gottfried
 * @version 1.0
 */

package gui;

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

    private Scene Ocean; //composite

    public void DrawingArea(){
        Ocean = new Scene();
  
        JButton but1 = new JButton("1"); // todo Problem, why does this work here, but not in the Button Class??
        add(but1);
    }
    
    protected void paintComponent(Graphics pen) {
        super.paintComponent(pen);

        JButton but1 = new JButton("4"); // todo Problem, why does this work here, but not in the Button Class??
        add(but1);
        
        Drawing.set(pen); // We need this before being able to draw anything
        if (Ocean == null) {
            Ocean = new Scene();
        }
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