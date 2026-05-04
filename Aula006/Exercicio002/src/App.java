import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        // Criar um painel que contém  nosso desenho
        DrawPanel panel = new DrawPanel();

        // Criar um novo quadro para armazenar o painel
        JFrame application = new JFrame();

        // Configurar o frame para ser encerrado quando ele for fechado
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Adiciona o painel ao frame
        application.add(panel);
        // Configura o tamanho do frame
        application.setSize(300, 300);
        // Torna o frame visível
        application.setVisible(true);
    }
}
