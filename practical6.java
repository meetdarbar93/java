import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class practical6 extends Applet implements ActionListener {

    Label l1, l2, l3;
    Button b1;
    TextField t1, t2;

    public void init() {
        l1 = new Label("Username : ");
        l2 = new Label("PassWord");
        b1 = new Button("Log In");
        t1 = new TextField(20);
        t2 = new TextField(20);
        t2.setEchoChar('*');
        add(l1);
        add(l2);
        add(b1);
        add(t1);
        add(t2);
        t1.addActionListener(this);
        t2.addActionListener(this);
        b1.addActionListener(this);

        setLayout(null);

        l1.setBounds(40, 40, 80, 20);
        l2.setBounds(40, 70, 80, 20);
        t1.setBounds(150, 40, 80, 20);
        t2.setBounds(150, 70, 80, 20);
        b1.setBounds(150, 100, 40, 20);
    }

    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Username : " + t1.getText(), 50, 130);
        g.drawString("Password : " + t2.getText(), 50, 160);
    }
}
