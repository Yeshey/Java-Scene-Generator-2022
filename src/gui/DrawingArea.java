/**
 * Provides a panel which can be used for drawing.
 *
 * @author Björn Gottfried
 * @version 1.0
 */

package gui;

import java.awt.*;
import javax.swing.JPanel;

public class DrawingArea extends JPanel {
    private static final long serialVersionUID = 1L;

    private Scene ocean; //composite

    public DrawingArea() {
        ocean = null;
    }

    public void setSceneBackground(String colour){
        setBackground(Color.decode(colour));
    }

    public void newScene(){
        ocean = null;
    }

    protected void paintComponent(Graphics pen) {
        super.paintComponent(pen);

        Drawing.set(pen); // We need this before being able to draw anything

        if (ocean == null) {
            ocean = new Scene(this);
        }

        ocean.draw();
    }

    public Scene getOcean() {
        return ocean;
    }
}