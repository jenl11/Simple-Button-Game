import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game extends JFrame {

    private static final int WIDTH = 7;
    private static final int HEIGHT = 7;
    private Bubbles[][] bubbles;

    public Game() {
        super("Bubble Game");

        bubbles = new Bubbles[WIDTH][HEIGHT];

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel buttons = new JPanel();
        for (int i = 0; i < WIDTH; i++) {
            for (int j = 0; j < HEIGHT; j++) {
                bubbles[i][j] = new Bubbles(i, j);
                bubbles[i][j].addActionListener(new Click());
                buttons.add(bubbles[i][j]);
            }
        }
        Random rand = new Random();
        int randi = rand.nextInt(WIDTH);
        int randj = rand.nextInt(HEIGHT);
        bubbles[randi][randj].setIt();

        add(buttons);
        setSize(300,330);
        setVisible(true);
    }

    private class Click implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            bubbles[Integer.parseInt(String.valueOf(e.getActionCommand().charAt(0)))][Integer.parseInt(String.valueOf(e.getActionCommand().charAt(2)))].press();
            validate();
            repaint();
        }

    }




}
