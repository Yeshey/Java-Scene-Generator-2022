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
    private ButtonPanel bp;

    public WindowGenerator(String title) {
        applicationFrame = new JFrame(title);
		
		setLayout(new BorderLayout());
		Dimension screenSize = applicationFrame.getToolkit().getScreenSize();
		applicationFrame.setBounds(0,0,screenSize.width, screenSize.height);
        applicationFrame.setBounds(0, 0, screenSize.width, screenSize.height);
        applicationFrame.setVisible(true);

        applicationFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void setStructure(){
		bp = new ButtonPanel();
		applicationFrame.add(bp, BorderLayout.WEST);
    }

    public void addACanvas(JPanel p) {
        applicationFrame.add(p, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
    	WindowGenerator anApplication = new WindowGenerator("Window Title"); // Create a window
        anApplication.setStructure();
        anApplication.addACanvas(new DrawingArea()); // Incert a Drawing area into the window
    }
}