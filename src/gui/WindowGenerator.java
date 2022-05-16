/**
 * Provides a test application window with a panel.
 *
 * @author Björn Gottfried
 * @version 1.0
 */
package gui;

import java.awt.Dimension;

import javax.swing.JFrame;

public class WindowGenerator extends JFrame{
/*
    private JFrame applicationFrame;

    public windowGenerator(String title) {
        applicationFrame = new JFrame(title);
        Dimension screenSize = applicationFrame.getToolkit().getScreenSize();
        applicationFrame.setBounds(0, 0, screenSize.width, screenSize.height);
        applicationFrame.setVisible(true);
    }
*/

    public WindowGenerator(String window) {
        super(window);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Dimension screenSize = getToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width, screenSize.height);
        setVisible(true);
    }

    public void addACanvas() {
        DrawingArea dA = new DrawingArea();
        add(dA);
    }

    public static void main(String[] args) {
    	WindowGenerator anApplication = new WindowGenerator("Window Title"); // Create a window
        anApplication.addACanvas();

        //anApplication.addACanvas(new DrawingArea()); // Insert a Drawing area into the window
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