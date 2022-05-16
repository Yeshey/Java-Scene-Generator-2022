/**
 * Provides a panel which can be used for drawing.
 *
 * @author Björn Gottfried
 * @version 1.0
 */

package gui;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawingArea extends JPanel {
    private static final long serialVersionUID = 1L;

    private Scene Ocean; //composite

    public void DrawingArea() {
        Ocean = new Scene();
    }

    protected void paintComponent(Graphics pen) {
        super.paintComponent(pen);

        Drawing.set(pen); // We need this before being able to draw anything

        if (Ocean == null) {
            Ocean = new Scene();
        }
        Ocean.draw();
    }
}