
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class practical7 extends Applet implements ActionListener, ItemListener {

    String str;
    Choice c;
    Label l1;

    public void init() {
        l1 = new Label("Select the color : ");
        c = new Choice();
        c.add("red");
        c.add("blue");
        c.add("green");
        c.add("pink");
        c.addItemListener(this);
        setLayout(null);
        l1.setBounds(120, 20, 120, 20);
        c.setBounds(250, 20, 100, 30);
        add(l1);
        add(c);
    }

    public void actionPerformed(ActionEvent e) {

    }
    public void itemStateChanged(ItemEvent e){
      str = c.getSelectedItem();
      repaint();
    }
    public void paint(Graphics g){
        if(str.equals("red")) setBackground(Color.orange);        
        if(str.equals("blue")) setBackground(Color.blue);
        if(str.equals("green")) setBackground(Color.green);
        if(str.equals("pink")) setBackground(Color.pink);

    }
}
