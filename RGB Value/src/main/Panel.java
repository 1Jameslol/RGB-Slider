package main;

import components.KeyClass;
import components.PaintingClass;
import components.Sliders;
import components.ValuePanel;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Panel extends JPanel {
    KeyClass keyClass;
    Sliders sliders;
    PaintingClass painter;
    int rgb1;
    int rgb2;
    int rgb3;

    public Panel() {

        ValuePanel value = new ValuePanel(painter, this);
        sliders = new Sliders(this, value);
        keyClass = new KeyClass(this);
        painter = new PaintingClass(this);

        
        this.add(value);
        value.setBoundsVal(0, 681, 1000, 153);
        //setBackground(Color.BLACK);
        setLayout(null);
        this.setFocusable(true);
        this.addKeyListener(keyClass);
    }

    public void set1(int RGB1) {
        this.rgb1=RGB1;
    }

    public void set2(int RGB2) {
        this.rgb2=RGB2;
    }

    public void set3(int RGB3) {
        this.rgb3=RGB3;
    }

    public int get1() {
        return this.rgb1;
    }

    public int get2() {
        return this.rgb2;
    }

    public int get3() {
        return this.rgb3;
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        painter.paint(g, get1(), get2(), get3());
    }
}
