import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class App {

    public static void main(String[] args) {

        Contador contador = new Contador();

        JFrame frame = new JFrame("Contador");
        frame.setSize(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel display = new JLabel("0000");
        display.setBounds(40,20,200,80);
        display.setHorizontalAlignment(SwingConstants.CENTER);

        display.setFont(new Font("Consolas", Font.BOLD, 50));
        display.setForeground(Color.GREEN);
        display.setBackground(Color.BLACK);
        display.setOpaque(true);

        frame.add(display);

        frame.addKeyListener(new KeyListener() {

            @Override
            public void keyPressed(KeyEvent e) {

                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    contador.incrementar();
                    display.setText(String.format("%04d", contador.getCount()));
                }

                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
                    contador.zerar();
                    display.setText(String.format("%04d", contador.getCount()));
                }

            }

            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyReleased(KeyEvent e) {}
        });

        frame.setVisible(true);
    }
}