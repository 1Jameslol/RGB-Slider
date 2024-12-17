package components;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import main.Panel;
public class KeyClass implements KeyListener {
    Panel panel2;
    int i;
    public KeyClass(Panel panel) {
        panel2=panel;
        i=0;
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_SPACE) {
            System.out.println("keyPressed " + i);
            i++;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
