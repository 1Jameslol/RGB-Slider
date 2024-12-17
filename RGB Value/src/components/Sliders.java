package components;


import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import main.Panel;
public class Sliders implements ChangeListener {
    JSlider slider1;
    JSlider slider2;
    JSlider slider3;
    JSlider slider4;
    Panel panel2;
    ValuePanel panel3;
    public Sliders(Panel panel, ValuePanel panelVal) {
        panel3=panelVal;
        panel2 = panel;
        slider1 = new JSlider(0, 255);
        slider2 = new JSlider(0, 255);
        slider3 = new JSlider(0, 255);
        slider4 = new JSlider(0, 255);

        slider1.addChangeListener(this);
        slider2.addChangeListener(this);
        slider3.addChangeListener(this);
        slider4.addChangeListener(this);
        
        initSlider(slider1, 0, 0);
        initSlider(slider2, 100, 0);
        initSlider(slider3, 200, 0);
        //initSlider(slider4, 300, 0);
    }

    public void initSlider(JSlider slider, int x, int y) {
        panel3.add(slider);
        slider.setBounds(350+x, y, 100, 100);
        slider.setVisible(true);
        //slider.setValue(0);
        //slider.setOpaque(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        panel2.set1(slider1.getValue());
        panel2.set2(slider2.getValue());
        panel2.set3(slider3.getValue());

        System.out.println(slider1.getValue()+ " " + slider2.getValue() + " " + slider3.getValue() + " " + slider4.getValue());
        panel2.repaint();
    }
}
