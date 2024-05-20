
package notepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class About extends JFrame implements ActionListener {
    JButton b1;

    About() {
        setBounds(600, 400, 700, 600);
        setLayout(null);

        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("notepad/icons/notepad.png"));
        Image i5 = i4.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(150, 170, 70, 70);
        add(l2);

        JLabel l3 = new JLabel(
                "<html>Notepad Clone<br>Notepad clone Version v.1.0.<br>All rights reserved<br><br>A Notepad clone typically refers to a software application designed to replicate the basic functionality of Microsoft's Notepad text editor, which is a simple and lightweight program for creating and editing plain text files. </html>");
        l3.setFont(new Font("SAN_SERIF", Font.PLAIN, 18));
        l3.setBounds(250, 130, 500, 250);
        add(l3);

        b1 = new JButton("Exit");
        b1.setBounds(580, 500, 80, 25);
        b1.addActionListener(this);
        add(b1);

    }

    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
    }

    public static void main(String[] args) {
        new About().setVisible(true);
    }
}
