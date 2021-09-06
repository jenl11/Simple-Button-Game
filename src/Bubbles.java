import javax.swing.*;
import java.awt.*;

public class Bubbles extends JButton {

    private boolean it;
    private int w, h;

    public Bubbles(int width, int height) {
        setActionCommand("" + width + ":" + height + "");
        setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        setBackground(Color.WHITE);
        setContentAreaFilled(false);
        w = width;
        h = height;
        it = false;
        setIcon(new ImageIcon("Icons/Light-1.png"));
    }

    public boolean isIt() {
        return it;
    }

    public void press() {
        if (it) {
            setIcon(new ImageIcon("Icons/Light-3.png"));
        } else {
            setIcon(new ImageIcon("Icons/Light-0.png"));
        }

    }

    public void setIt() {
        it = true;
    }

    public int getWidthPos() {
        return w;
    }

    public int getHeightPos() {
        return h;
    }

    public String toString() {
        return w + "," + h;
    }
}
