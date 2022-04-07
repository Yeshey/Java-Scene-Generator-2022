/**
 * Provides a test application window with a panel.
 *
 * @author Björn Gottfried
 * @version 1.0
 */
package drawingTool;

import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class windowGenerator {
    private JFrame applicationFrame;

    public windowGenerator(String title) {
        applicationFrame = new JFrame(title);
        Dimension screenSize = applicationFrame.getToolkit().getScreenSize();
        applicationFrame.setBounds(0, 0, screenSize.width, screenSize.height);
        applicationFrame.setVisible(true);
    }

    public void addACanvas(JPanel p) {
        applicationFrame.add(p);
    }

    public static void main(String[] args) {
    	windowGenerator anApplication = new windowGenerator("Window Title"); // Create a window
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