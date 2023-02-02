package test.itemevent;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CalcExample extends JFrame {
    JTextField result;
    JButton[] buttons;
    JButton button_result;
    double first;
    double second;
    String alpha = "";

    public CalcExample() {
        first = 0;
        second = 0;

        JPanel p = new JPanel(new GridLayout(4, 4));
        result = new JTextField(15);
        result.setBackground(Color.WHITE);
        result.setEditable(false);

        buttons = new JButton[16];
        String[] b = { ".", "C", "+", "-", "*", "/" };
        button_result = new JButton("=");

        for (int i = 0; i < buttons.length; i++)
        {
            if (i > 10)
            {
                buttons[i] = new JButton(b[i - 10]);
            }
            else
            {
                buttons[i] = new JButton(i + "");
            }

            buttons[i].addActionListener(buttonListener);
            p.add(buttons[i]);
        }
        button_result.addActionListener(buttonListener);

        add("North", result);
        add("Center", p);
        add("South", button_result);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBounds(800, 200, 300, 300);
        setVisible(true);
    }

    ActionListener buttonListener = new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            for (int i = 0; i < 11; i++) {
                if (e.getSource() == buttons[i]) {
                    result.setText(result.getText() + buttons[i].getText());
                }
            }

            if (e.getSource() == buttons[11]) {
                result.setText("");
            }

            if (e.getSource() == buttons[12]) {
                first = Double.parseDouble(result.getText());
                result.setText("");
                System.out.println(first);
                alpha = "+";
            } else if(e.getSource() == buttons[13]) {
                first = Double.parseDouble(result.getText());
                result.setText("");
                System.out.println(first);
                alpha = "-";
            } else if(e.getSource() == buttons[14]) {
                first = Double.parseDouble(result.getText());
                result.setText("");
                System.out.println(first);
                alpha = "*";
            } else if(e.getSource() == buttons[15]) {
                first = Double.parseDouble(result.getText());
                result.setText("");
                System.out.println(first);
                alpha = "/";
            }

            if (e.getSource() == button_result)
            {
                if (first != 0)
                {
                    double res = 0;
                    second = Double.parseDouble(result.getText());
                    switch (alpha) {
					case "+":
						res = first + second;
						break;
					case "-":
						res = first - second;
						break;
					case "*":
						res = first * second;
						break;
					case "/":
						res = first / second;
						break;
					}
                    System.out.println(second);
                    result.setText(res + "");
                }
            }
        }
    };

    public static void main(String[] args) {
        new CalcExample();
    }

}
