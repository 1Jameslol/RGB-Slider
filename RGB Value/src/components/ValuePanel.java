package components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
import main.Panel;
public class ValuePanel extends JPanel {
    PaintingClass paint;
    Panel panel2;
    public ValuePanel(PaintingClass painter, Panel panel) {
        panel2=panel;
        paint=painter;
        setBackground(Color.BLACK);
        this.setLayout(null);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 377;
        int xShifter = 15;
        g.setFont(new Font("Calibri", Font.PLAIN, 24));
        g.setColor(Color.BLACK);
        
        g.setColor(new Color(panel2.get1(),0, 0));
        g.fillRect(350, 0, 100, 100);
        g.setColor(new Color(0,panel2.get2(), 0));
        g.fillRect(450, 0, 100, 100);
        g.setColor(new Color(0,0, panel2.get3()));
        g.fillRect(550, 0, 100, 100);
        g.setColor(Color.WHITE);
        g.drawString("R:" + panel2.get1(), x-xShifter, 85);
        g.drawString("G:" + panel2.get2(), x+100-xShifter, 85);
        g.drawString("B:" + panel2.get3(), x+200-xShifter, 85);
        g.setColor(Color.GREEN);
        g.fillRect(300, 0, 50, 100);
        g.fillRect(300, 100, 350, 50);
        g.fillRect(650, 0, 50, 150);
    }

    public void setBoundsVal(int x, int y, int width, int height) {
        this.setBounds(x, y, width, height);
        
    }
}
