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
        drawing.setBackground(Color.decode("#0096FF"));

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
            //System.out.println("Get fish attempt");
        } else if (e.getSource() == button.getTerrainButton()) {
            drawing.getOcean().resetTerrain();
            tidyUpDrawingArea();
            //System.out.println("Get terrain attmept");
        } else if (e.getSource() == button.getResetButton()) {
            drawing.newScene();
            tidyUpDrawingArea();
            //System.out.println("Cleanup tried");
        } else if (e.getSource() == button.getRandomColorButton()) {
            drawing.getOcean().setRandomColor();
            repaint();
            //System.out.println("Color change tried");
        }else if (e.getSource() == button.getDayStateButton()) {
            drawing.getOcean().day();
            repaint();
            //System.out.println("Day state change tried");
        }else if (e.getSource() == button.getEveningStateButton()) {
            drawing.getOcean().evening();
            repaint();
            //System.out.println("Evening state change tried");
        }else if (e.getSource() == button.getNightStateButton()) {
            drawing.getOcean().night();
            repaint();
            //System.out.println("Night state change tried");
        }else if (e.getSource() == button.getSharkAttackStateButton()) {
            drawing.getOcean().sharkAttack();
            repaint();
            //System.out.println("Shark attack state change tried");

        }

    }

    public static void main(String[] args) {
    	WindowGenerator anApplication = new WindowGenerator("Window Title"); // Create a window
     }
}