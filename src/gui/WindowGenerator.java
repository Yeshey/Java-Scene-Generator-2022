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
    private Scene scene = new Scene();

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
            //tidyUpDrawingArea();
            System.out.println("Get fish attempt");
        } else if (e.getSource() == button.getTerrainButton()) {
            //tidyUpDrawingArea();
            System.out.println("Get terrain attmept");
        } else if (e.getSource() == button.getResetButton()) {
            drawing.newScene();
            tidyUpDrawingArea();
            System.out.println("Cleanup tried");
        } else if (e.getSource() == button.getRandomColorButton()) {
            scene.setRandomColor();
            tidyUpDrawingArea();
            System.out.println("Color change tried");
        }
    }

    public static void main(String[] args) {
    	WindowGenerator anApplication = new WindowGenerator("Window Title"); // Create a window
     }
}