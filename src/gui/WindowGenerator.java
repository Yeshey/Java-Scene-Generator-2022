/**
 * Provides a test application window with a panel.
 *
 * @author Björn Gottfried
 * @version 1.0
 */
package gui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class WindowGenerator extends JFrame implements ActionListener {
    private DrawingArea drawing;
    private Button button = new Button();

    public WindowGenerator(String title) {
        super(title);

        setLayout(new BorderLayout());

        constructButtonMenu();
        constructDrawingArea();

        Dimension screenSize = getToolkit().getScreenSize();
        setBounds(0, 0, screenSize.width, screenSize.height);

        setVisible(true);

        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void constructButtonMenu() {
        button.addButtonsToAPanel(this);
        button.addActionListener(this);
    }

    private void constructDrawingArea() {
        drawing = new DrawingArea();
        add(drawing, BorderLayout.CENTER);
    }

    public void tidyUpDrawingArea() {
        drawing.removeAll();
        drawing.revalidate();
        drawing.repaint();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button.getFishesButton()) {
            drawing.getOcean().newFishToArray();
            tidyUpDrawingArea();
        } else if (e.getSource() == button.getTerrainButton()) {
            drawing.getOcean().resetTerrain();
            tidyUpDrawingArea();
        } else if (e.getSource() == button.getResetButton()) {
            drawing.newScene();
            tidyUpDrawingArea();
        } else if (e.getSource() == button.getRandomColorButton()) {
            drawing.getOcean().setRandomColor();
            repaint();
        }else if (e.getSource() == button.getDayStateButton()) {
            drawing.getOcean().day();
            repaint();
        }else if (e.getSource() == button.getEveningStateButton()) {
            drawing.getOcean().evening();
            repaint();
        }else if (e.getSource() == button.getNightStateButton()) {
            drawing.getOcean().night();
            repaint();
        }else if (e.getSource() == button.getSharkAttackStateButton()) {
            drawing.getOcean().sharkAttack();
            repaint();
        }

    }

    public static void main(String[] args) {
    	new WindowGenerator("Window Title"); // Create a window
     }
}