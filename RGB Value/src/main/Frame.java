package main;

import java.awt.Dimension;
import javax.swing.JFrame;
public class Frame extends JFrame {
    public Frame() {
        Panel panel = new Panel();
        this.add(panel);
        this.setTitle("RGB Value Program");
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(1000, 1000));
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        
        
    }
}
