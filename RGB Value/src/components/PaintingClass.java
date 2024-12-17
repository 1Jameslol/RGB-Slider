package components;

import java.awt.Color;
import java.awt.Graphics;
import main.Panel;
public class PaintingClass {
    Panel panel2;
    public PaintingClass(Panel panel) {
        panel2=panel;
    }
    public void paint(Graphics g, int r1, int r2, int r3) {
        
        g.setColor(new Color(r1, r2, r3));
        g.fillRect(0, 0, 1000, 1000);
        System.out.println("(" + panel2.get1()+", " + panel2.get2() + ", " + panel2.get3() + ")");
    }

    public void paintRGB(Graphics g) {
        
    }
}
