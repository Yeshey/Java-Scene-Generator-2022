/**
 * Provides a test application window with a panel.
 *
 * @author Björn Gottfried
 * @version 1.0
 */
package gui;

import java.awt.Dimension;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JButton;


public class WindowGenerator extends JFrame{
    private JFrame applicationFrame;

    public WindowGenerator(String title) {
        applicationFrame = new JFrame(title);

        setLayout(new BorderLayout());
        Dimension screenSize = applicationFrame.getToolkit().getScreenSize();
        applicationFrame.setBounds(0, 0, screenSize.width, screenSize.height);
        applicationFrame.setVisible(true);

        JButton but1 = new JButton("1"); // todo Problem, why does this work here, but not in the Button Class??
        add(but1);
        add(but1);
        add(but1);
        add(but1);
    }

    public void addACanvas(JPanel p) {
        applicationFrame.add(p);
    }

    public static void main(String[] args) {
    	WindowGenerator anApplication = new WindowGenerator("Window Title"); // Create a window
        anApplication.addACanvas(new DrawingArea()); // Incert a Drawing area into the window
    }
}

/*
package drawingTool;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class drawingArea {
	private static final long serialVersionUID = 1L;
	
	protected void paintComponent(Graphics pen) {
		super.paintComponent(pen);
		
		Drawing.set(pen);
		House myHouse = new House(200,200);
		myHouse.draw();
	}
}

*/