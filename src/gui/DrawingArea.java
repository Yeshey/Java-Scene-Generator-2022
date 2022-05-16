/**
 * Provides a panel which can be used for drawing.
 *
 * @author Björn Gottfried
 * @version 1.0
 */

package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Dimension;

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