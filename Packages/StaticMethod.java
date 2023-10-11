package Packages;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class StaticMethod {

    String num1, num2;

    public void ButtonSetup(JButton b1, JPanel F2) {
        b1.setBackground(Color.decode("#1E1E1E"));
        b1.setForeground(Color.white);
        b1.setBorder(new LineBorder(Color.decode("#242424"), 2, true));
        b1.setFont(new Font("", Font.BOLD, 20));
        F2.add(b1);
    }

    public void SetTxtTwoEditTxt(JButton b, JLabel txt) {

        b.addActionListener(e -> {
            String s = b.getText().toString();
            txt.setText(txt.getText() + s);
        });

    }

    public void SetTxtTwoEditTxt1(JButton b, JLabel txt0, JLabel txt1) {

        b.addActionListener(e -> {
            String s = b.getText().toString();
            txt1.setText(s);
            num1 = txt0.getText().toString();
            txt0.setText("");
        });

    }

    public char[] AnsArry(JLabel txt) {
        String val = new String(txt.getText());
        char[] charArray = val.toCharArray();
        return charArray;
    }

    public void clickFunc(JLabel txt, JLabel txt1) {
        try {

            num2 = txt.getText().toString();
            String operation = txt1.getText().toString();

            if (num1.contains(".") || num2.contains(".")) {

                if (operation == "+") {
                    float sum = Float.parseFloat(num1) + Float.parseFloat(num2);
                    txt.setText(String.valueOf(sum));
                } else if (operation == "-") {
                    float sum = Float.parseFloat(num1) - Float.parseFloat(num2);
                    txt.setText(String.valueOf(sum));
                } else if (operation == "/") {
                    float sum = Float.parseFloat(num1) / Float.parseFloat(num2);
                    txt.setText(String.valueOf(sum));
                } else if (operation == "x") {
                    float sum = Float.parseFloat(num1) * Float.parseFloat(num2);
                    txt.setText(String.valueOf(sum));
                }
            } else {
                if (operation == "+") {
                    float sum = Float.parseFloat(num1) + Float.parseFloat(num2);
                    txt.setText(String.valueOf(sum));
                } else if (operation == "-") {
                    float sum = Float.parseFloat(num1) - Float.parseFloat(num2);
                    txt.setText(String.valueOf(sum));
                } else if (operation == "/") {
                    float sum = Float.parseFloat(num1) / Float.parseFloat(num2);
                    txt.setText(String.valueOf(sum));
                } else if (operation == "x") {
                    float sum = Float.parseFloat(num1) * Float.parseFloat(num2);
                    txt.setText(String.valueOf(sum));
                }
            }

        } catch (Exception e) {
            txt1.setText("Err");
        }

    }
}
