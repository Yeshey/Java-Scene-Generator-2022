/**
 * Provides a panel which can be used for drawing.
 *
 * @author Björn Gottfried
 * @version 1.0
 */

package drawingTool;

import java.awt.Color;
import java.util.ArrayList;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingArea extends JPanel {
    private static final long serialVersionUID = 1L;

    protected void paintComponent(Graphics pen) {
        super.paintComponent(pen);

        /*
        pen.drawLine(100, 100, 800, 800);

        pen.setColor(Color.blue); // a color constant
        pen.drawRect(10, 10, 200, 300);

        pen.setColor(Color.decode("#7a5230")); // HEX representation
        pen.fillOval(300, 234, 800, 100);

        pen.setColor(new Color(255,100,100)); // RGB representation
        pen.drawString("Hello World", 666, 280);
        
        // Draw the triangle
        int[] polygonX = {10, 60, 30};
        int[] polygonY = {10, 10, 60};
        int polygonN = 3;
        pen.drawPolygon(polygonX, polygonY, polygonN);
        */
        
        Drawing.set(pen);
        ArrayList<lanternFish> fishGroup = new ArrayList<lanternFish>(); 
        for (int i=0; i < 5; i++) {
        	fishGroup.add(new lanternFish(300+ 100*i, 260));
        }
        
        //lanternFish myLanternFish = new lanternFish(300, 260);
        for (lanternFish f : fishGroup) {
        	f.draw();	
        }
    }
}