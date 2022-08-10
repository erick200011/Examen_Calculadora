import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;//IMPORTACION DE LIBRERIAS
import java.awt.event.ComponentAdapter;

public class calculadora1 extends JFrame{
    //creacion de objetos
    private JButton cButton;
    private JPanel mainPanel;
    private JLabel Operaciotxt;
    private JLabel Resultadotxt;
    private JButton senoBT;
    private JButton sumResBT;
    private JButton porcenBT;
    private JButton DivBT;
    private JButton cosBT;
    private JButton sieteBT;
    private JButton ochoBT;
    private JButton nueveBT;
    private JButton cuatroBT;
    private JButton cincoBT;
    private JButton seisBT;
    private JButton unoBT;
    private JButton dosBT;
    private JButton tresBT;
    private JButton tanBT;
    private JButton exponBT;
    private JButton ceroBT;
    private JButton puntoBT;
    private JButton mulBT;
    private JButton sumBT;
    private JButton resBT;
    private JButton igualBT;
    private JButton CeBT;

    //creacion de funcionalidades de los botones
    public calculadora1() {
        cButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Operaciotxt.setText("");
                Resultadotxt.setText("");
            }
        });
        unoBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añadirNumero("1");
            }
        });
        dosBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añadirNumero("2");
            }
        });
        tresBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añadirNumero("3");
            }
        });
        cuatroBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añadirNumero("4");
            }
        });
        cincoBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añadirNumero("5");
            }
        });
        seisBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añadirNumero("6");
            }
        });
        sieteBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añadirNumero("7");
            }
        });
        ochoBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añadirNumero("8");
            }
        });
        nueveBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añadirNumero("9");
            }
        });
        ceroBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añadirNumero("0");
            }
        });
        puntoBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añadirNumero(".");
            }
        });
        resBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añadirNumero("-");
            }
        });
        sumBT.addComponentListener(new ComponentAdapter() {
        });
        sumBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añadirNumero("+");
            }
        });
        mulBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añadirNumero("*");
            }
        });
        DivBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añadirNumero("/");
            }
        });
        porcenBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añadirNumero("%");
            }
        });
        sumResBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añadirNumero("±");
            }
        });
        senoBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añadirNumero("Sen");
            }
        });
        cosBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añadirNumero("Cos");
            }
        });
        tanBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añadirNumero("Tan");
            }
        });
        exponBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                añadirNumero("^");
            }
        });

        igualBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        CeBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto=Operaciotxt.getText().substring(0,Operaciotxt.getText().length()-1);
                Operaciotxt.setText(texto);
            }
        });
    }

    //Creacion de metodo para la imprecion de la calculadora
    public static void main(String[] args) {
        JFrame frame=new JFrame("Calculadora");
        frame.setContentPane(new calculadora1().mainPanel);
        frame.setTitle("Welcome");
        frame.setSize(475,780);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    //metodo para añadir los numeros en el jpanel
    public void añadirNumero(String digito){
        Operaciotxt.setText(Operaciotxt.getText()+digito);
    }

    ScriptEngineManager sem=new ScriptEngineManager();
    ScriptEngine se=sem.getEngineByName("JavaScript");

}
