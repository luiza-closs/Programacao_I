import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel{
    public void paintComponent(Graphics g) {
        // Chama o método paintComponent da superclasse para garantir que o painel seja desenhado corretamente
        super.paintComponent(g);

        int width = getWidth();
        int height = getHeight();

        g.drawLine(0,0, width, height);

        g.drawLine(0, height, width, 0);
    }
}
