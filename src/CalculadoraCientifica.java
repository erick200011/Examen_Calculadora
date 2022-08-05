import javax.swing.*;

public class CalculadoraCientifica {
    private JPanel mainPanel;
    private JPanel PantallaJP;
    private JPanel BotonesJP;
    private JLabel operaciontxt;
    private JLabel resultadotxt;
    private JButton button1;

    public static void main(String[] args) {
        JFrame frame=new JFrame("Calculadora");
        frame.setContentPane(new CalculadoraCientifica().mainPanel);
        frame.setTitle("Welcome");
        frame.setSize(350,250);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
