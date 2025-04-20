/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author LENOVO
 */
public class practical4 extends Applet implements ActionListener, ItemListener {

    Label l1, l2, l3, l4;
    TextField t1, t2, t3;
    String s1, s2, s3;
    Choice c;
    int n1, n2, n3;
    Button b;

    public void paint(Graphics g) {
        if (s3.equals("+")) {
            n3 = n1 + n2;
        } else if (s3.equals("-")) {
            n3 = n1 - n2;
        } else if (s3.equals("*")) {
            n3 = n1 * n2;
        } else if (s3.equals("/")) {
            n3 = n1 / n2;
        }
        s4 = Integer.toString(n3);
        t3.setText(s4);
    }

    public void init() {
        l1 = new Label("First No ");
        l2 = new Label("Second No ");
        l3 = new Label("Answer");
        l4 = new Label("Choice");

        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();

        c = new Choice();
        c.add(" ");
        c.add("+");
        c.add("-");
        c.add("*");
        c.add("/");
        
        b = new Button("Ok");
        
        b.addActionListener(this);
        c.addItemListener(this);
        setLayout(null);
        l1.setBounds(120, 40, 80, 20);
        l2.setBounds(120, 65, 80, 20);
        l3.setBounds(120, 90, 80, 20);
        l4.setBounds(120, 115, 80, 20);

        t1.setBounds(210, 40, 80, 20);
        t2.setBounds(210, 65, 80, 20);
        t3.setBounds(210, 90, 80, 20);

        c.setBounds(210, 115, 80, 20);
        b.setBounds(120, 140, 150, 20);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(t1);
        add(t2);
        add(t3);
        add(c);
        add(b);

    }

    public void itemStateChanged(ItemEvent e) {
        s3 = c.getSelectedItem();
        repaint();
    }

    public void actionPerformed(ActionEvent e) {
        s1 = t1.getText();
        s2 = t2.getText();

        n1 = Integer.parseInt(s1);
        n2 = Integer.parseInt(s2);
        repaint();
    }
}
