
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;


public class practical5 extends Applet implements ItemListener {

    List city, country, state;

    public void init() {
        country = new List();
        city = new List(4, true);
        state = new List();

        city.add("khambhat");
        city.add("Anand");
        city.add("surat");
        city.add("jaipur");
        city.add("LA");
        city.add("Patna");

        state.add("Gujarat");
        state.add("MP");
        state.add("UP");
        state.add("AP");
        state.add("J&K");

        country.add("Newzland");
        country.add("Australia");
        country.add("Pakistan");
        country.add("USA");
        country.add("Swterzerland");

        add(country);
        add(state);
        add(city);

        country.addItemListener(this);
        city.addItemListener(this);
        state.addItemListener(this);

    }

    public void paint(Graphics g) {
        String s1, c1;
        c1 = country.getSelectedItem();
        s1 = state.getSelectedItem();
        String city1[] = city.getSelectedItems();
        String msg = " ";
        for (int i = 0; i <= city1.length - 1; i++) {
            msg = city1[i] + " " + msg;
        }
        g.drawString("country : " + c1, 50, 140);
        g.drawString("State : " + s1, 50, 160);
        g.drawString("city : " + msg, 50, 180);
    }
    public void itemStateChanged(ItemEvent e) {
        repaint();
    }

}
