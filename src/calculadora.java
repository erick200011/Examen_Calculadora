import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora {
    private JTextField num1TF;
    private JTextField num2TF;
    private JButton button_mas;
    private JButton button_menos;
    private JButton button_por;
    private JButton button_div;
    private JLabel resultadotxt;
    private JPanel mainPanel;

    public calculadora() {
        button_mas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //codigo suma
                Integer valor1,valor2,val3;
                valor1=Integer.parseInt(num1TF.getText());
                valor2=Integer.parseInt(num2TF.getText());
                val3=valor1+valor2;
                resultadotxt.setText(" "+val3);


            }
        });
        button_menos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //codigo resta
                Integer valor1,valor2,val3;
                valor1=Integer.parseInt(num1TF.getText());
                valor2=Integer.parseInt(num2TF.getText());
                val3=valor1-valor2;
                resultadotxt.setText(" "+val3);
            }
        });
        button_por.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //codigo multiplicacion
                Integer valor1,valor2,val3;
                valor1=Integer.parseInt(num1TF.getText());
                valor2=Integer.parseInt(num2TF.getText());
                val3=valor1*valor2;
                resultadotxt.setText(" "+val3);
            }
        });
        button_div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //codigo division
                Integer valor1,valor2,val3;
                valor1=Integer.parseInt(num1TF.getText());
                valor2=Integer.parseInt(num2TF.getText());
                val3=valor1/valor2;
                resultadotxt.setText(" "+val3);
            }
        });
    }

    public static void main(String[] args){
        JFrame frame= new JFrame("calculadora");
        frame.setContentPane(new calculadora().mainPanel);
        frame.setTitle("Welcome");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
