
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class practical5 extends Applet implements ItemListener {

    List country, city, state;
    String s, c, msg;

    public void init() {
        country = new List();
        city = new List(3, true);
        state = new List();

        country.add("INDIA");
        country.add("PAKISTAN");
        country.add("USA");
        country.add("JAPAN");
        country.add("SOUTH KOREA");
        country.add("CHINA");

        state.add("GUJARAT");
        state.add("MADHPRADESH");
        state.add("RAJASTHAN");
        state.add("MAHARASHTRA");
        state.add("KERLA");
        state.add("AASAM");

        city.add("AHEMEDABAD");
        city.add("MUMBAI");
        city.add("BANGOLURE");
        city.add("DELHI");
        city.add("KOLKATA");

        country.addItemListener(this);
        city.addItemListener(this);
        state.addItemListener(this);

        add(country);
        add(state);
        add(city);

    }

    public void itemStateChanged(ItemEvent e) {
        s = state.getSelectedItem();
        c = country.getSelectedItem();

        String ct[] = city.getSelectedItems();
        msg = "  ";
        for (int i = 0; i < ct.length; i++) {
            msg = msg + "  " + ct[i];
        }
        repaint();
    }

    public void paint(Graphics g) {
        g.drawString("Country  : " + c, 50, 100);
        g.drawString("State    : " + s, 50, 120);
        g.drawString("city     : " + msg, 50, 140);

    }
}
