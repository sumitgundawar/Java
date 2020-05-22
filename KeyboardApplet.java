import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class KeyPanel extends JPanel implements KeyListener{
    private String msg="";

    public void paint(Graphics g){
        super.paint(g);
        FontMetrics fm = g.getFontMetrics();
        int w = fm.stringWidth(msg);
        int h = fm.getHeight();
        int x = (getWidth()-w)/2;
        int y = (getHeight()-h)/2;
        g.drawString(msg,x, y);
    }

    public void keyPressed(KeyEvent ke){
        msg = "Key Pressed";
        repaint();
    }

    public void keyReleased(KeyEvent ke){
        msg = "Key Released";
        repaint();
    }

    public void keyTyped(KeyEvent ke){
        msg = "Key Typed";
        repaint();
    }

    public KeyPanel(){
        addKeyListener(this);
    }
}

public class KeyboardApplet extends JApplet{
    private KeyPanel pan;

    public void init(){
        //addKeyListener(this);
        pan = new KeyPanel();
        setLayout(new BorderLayout());
        add(pan,"Center");
    }
}

/*
<applet code=KeyboardApplet width=400 height=400></applet>
*/


