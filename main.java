import javax.swing.*;
import java.awt.*;
import Packages.*;

class main {

    public static JFrame f;
    public static int width = 450;
    public static int hight = 650;
    StaticMethod St;

    public void run() {
        St = new StaticMethod();
        f = new JFrame("Calculater");
        f.setSize(width, hight);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
        f.getContentPane().setBackground(Color.decode("#242424"));
        f.setResizable(false);

        JPanel Container = new JPanel(null);
        Container.setBounds(0, 0, width - 17, 100);
        Container.setOpaque(true);
        Container.setBackground(Color.decode("#353535"));
        f.getContentPane().add(Container);

        JLabel txt = new JLabel();
        JLabel txt1 = new JLabel("");
        txt1.setForeground(Color.gray);
        txt1.setFont(new Font("", Font.BOLD, 20));
        txt.setBounds(25, 25, width - 169, 50);
        txt1.setBounds(380, 25, width - 69, 50);
        txt.setBackground(Color.decode("#353535"));
        txt.setForeground(Color.decode("#FFFFFF"));
        txt.setBorder(null);
        St.AnsArry(txt);
        // txt.setText("");
        txt.setFont(new Font("", Font.PLAIN, 30));
        Container.add(txt);
        Container.add(txt1);

        JPanel F2 = new JPanel();
        f.add(F2);
        F2.setLayout(null);

        JButton b1 = new JButton("1");
        b1.setBounds(0, 0, 100, 100);
        St.SetTxtTwoEditTxt(b1, txt);
        St.ButtonSetup(b1, F2);
        JButton b2 = new JButton("2");
        b2.setBounds(100, 0, 100, 100);
        St.SetTxtTwoEditTxt(b2, txt);
        St.ButtonSetup(b2, F2);
        JButton b3 = new JButton("3");
        b3.setBounds(200, 0, 100, 100);
        St.SetTxtTwoEditTxt(b3, txt);
        St.ButtonSetup(b3, F2);
        JButton add = new JButton("+");
        add.setBounds(300, 0, 100, 100);
        St.SetTxtTwoEditTxt1(add,txt,txt1);
        St.ButtonSetup(add, F2);

        JButton b4 = new JButton("4");
        b4.setBounds(0, 100, 100, 100);
        St.SetTxtTwoEditTxt(b4, txt);
        St.ButtonSetup(b4, F2);
        JButton b5 = new JButton("5");
        b5.setBounds(100, 100, 100, 100);
        St.SetTxtTwoEditTxt(b5, txt);
        St.ButtonSetup(b5, F2);
        JButton b6 = new JButton("6");
        b6.setBounds(200, 100, 100, 100);
        St.SetTxtTwoEditTxt(b6, txt);
        St.ButtonSetup(b6, F2);
        JButton sub = new JButton("-");
        sub.setBounds(300, 100, 100, 100);
        St.SetTxtTwoEditTxt1(sub,txt,txt1);
        St.ButtonSetup(sub, F2);

        JButton b7 = new JButton("7");
        b7.setBounds(0, 200, 100, 100);
        St.SetTxtTwoEditTxt(b7, txt);
        St.ButtonSetup(b7, F2);
        JButton b8 = new JButton("8");
        b8.setBounds(100, 200, 100, 100);
        St.SetTxtTwoEditTxt(b8, txt);
        St.ButtonSetup(b8, F2);
        JButton b9 = new JButton("9");
        b9.setBounds(200, 200, 100, 100);
        St.SetTxtTwoEditTxt(b9, txt);
        St.ButtonSetup(b9, F2);
        JButton DIV = new JButton("/");
        DIV.setBounds(300, 200, 100, 100);
        St.SetTxtTwoEditTxt1(DIV, txt,txt1);
        St.ButtonSetup(DIV, F2);

        JButton dot = new JButton(".");
        dot.setBounds(0, 300, 100, 100);
        St.SetTxtTwoEditTxt(dot, txt);
        St.ButtonSetup(dot, F2);
        JButton b0 = new JButton("0");
        b0.setBounds(100, 300, 100, 100);
        St.SetTxtTwoEditTxt(b0, txt);
        St.ButtonSetup(b0, F2);
        JButton ans = new JButton("=");
        ans.setBounds(200, 300, 100, 100);
        ans.addActionListener((e) -> St.clickFunc(txt,txt1));
        St.ButtonSetup(ans, F2);

        JButton mul = new JButton("x");
        mul.setBounds(300, 300, 100, 100);
        St.SetTxtTwoEditTxt1(mul,txt, txt1);
        St.ButtonSetup(mul, F2);

        JButton Clr = new JButton("Clear");
        Clr.setBounds(0, 400, width - 50, 70);
        Clr.addActionListener((e) -> {
            txt.setText("");
                txt1.setText("");
        });
        St.ButtonSetup(Clr, F2);

        F2.setBackground(Color.decode("#242424"));
        F2.setBounds(17, 120, width - 50, hight);

    }

    public static void main(String[] args) {
        new main().run();
    }
}