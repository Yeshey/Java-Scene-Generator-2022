package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel implements ActionListener {
    private JTextField text;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton nextButton;


    public ButtonPanel() {
        super();
        defineStructure();
		/*
		setLayout(new BorderLayout());
		add(new JTextField("north"), BorderLayout.NORTH);
		
		//setLayout(new FlowLayout(FlowLayout.LEFT));
		setLayout(new GridLayout(2,2,10,8));
		
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		
		add(new JTextField("north"), BorderLayout.NORTH);
		add(button1, BorderLayout.CENTER);
		add(button2, BorderLayout.CENTER);
		add(button3, BorderLayout.CENTER);
		add(button4, BorderLayout.CENTER);
		*/
    }

    private void defineStructure() {
        setLayout(new BorderLayout());
        text = new JTextField("blabla");
        add(text, BorderLayout.NORTH);

        JPanel jp = new JPanel();
        add(jp);
        jp.setLayout(new GridLayout(2, 2, 12, 12));
		
		/*
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		
		//add(new JTextField("north"), BorderLayout.NORTH);
		jp.add(button1, BorderLayout.CENTER);
		jp.add(button2, BorderLayout.CENTER);
		jp.add(button3, BorderLayout.CENTER);
		jp.add(button4, BorderLayout.CENTER);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		*/

        button1 = defineButton("1", jp);
        button2 = defineButton("2", jp);
        button3 = defineButton("3", jp);
        button4 = defineButton("4", jp);
        nextInstructionToUser();
    }

    private JButton defineButton(String text, JPanel jp) {
        JButton b = new JButton(text);
        b.addActionListener(this);
        jp.add(b, BorderLayout.CENTER);
        return b;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            System.out.println("button 1 has been pushed");
            text.setText("button 1 has been pushed");
            reactToBushedButton(button1);
			/*
			if (nextButton == button1) {
				nextInstructionToUser();
			} else {
				text.setText("GAME OVER");
			}
			*/
        } else if (e.getSource() == button2) {
            System.out.println("nutton 2 has been pushed");
            text.setText("button 2 has been pushed");
            reactToBushedButton(button2);
			/*
			if (nextButton == button2) {
				nextInstructionToUser();
			} else {
				text.setText("GAME OVER");
			}
			*/
        } else if (e.getSource() == button3) {
            System.out.println("nutton 3 has been pushed");
            text.setText("button 3 has been pushed");
            reactToBushedButton(button3);
			/*
			if (nextButton == button3) {
				nextInstructionToUser();
			} else {
				text.setText("GAME OVER");
			}
			*/
        } else if (e.getSource() == button4) {
            System.out.println("nutton 4 has been pushed");
            text.setText("button 4 has been pushed");
            reactToBushedButton(button4);
			/*
			if (nextButton == button4) {
				nextInstructionToUser();
			} else {
				text.setText("GAME OVER");
			}
			*/
        }
    }

    private void reactToBushedButton(JButton b) {
        if (nextButton.equals(b)) {
            nextInstructionToUser();
        } else {
            text.setText("GAME OVER");
        }
    }

    private int randNumberBetween(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1) + min);
    }

    private void nextInstructionToUser() {
        int i = randNumberBetween(1, 4);
        switch (i) {
            case 1:
                nextButton = button1;
                text.setText("push button 1");
                break;
            case 2:
                nextButton = button2;
                text.setText("push button 2");
                break;
            case 3:
                nextButton = button3;
                text.setText("push button 3");
                break;
            case 4:
                nextButton = button4;
                text.setText("push button 4");
                break;
        }
    }

}
