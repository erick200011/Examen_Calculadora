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

    float primerNumero;
    float segundoNumero;
    String operador;


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
                //añadirNumero("-");
                primerNumero=Float.parseFloat(Operaciotxt.getText());
                operador="-";
                Operaciotxt.setText("");
            }
        });
        sumBT.addComponentListener(new ComponentAdapter() {
        });
        sumBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //añadirNumero("+");

                primerNumero=Float.parseFloat(Operaciotxt.getText());
                operador="+";
                Operaciotxt.setText("");


            }
        });
        mulBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //añadirNumero("*");
                primerNumero=Float.parseFloat(Operaciotxt.getText());
                operador="*";
                Operaciotxt.setText("");
            }
        });
        DivBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //añadirNumero("/");
                primerNumero=Float.parseFloat(Operaciotxt.getText());
                operador="/";
                Operaciotxt.setText("");
            }
        });
        porcenBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //añadirNumero("%");
                primerNumero=Float.parseFloat(Operaciotxt.getText());
                operador="%";
                Operaciotxt.setText("");
            }
        });
        sumResBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //añadirNumero("±");
                primerNumero=Float.parseFloat(Operaciotxt.getText());
                operador="±";
                Operaciotxt.setText("");
            }
        });
        senoBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //añadirNumero("Sen");

                operador="Sen";
                Operaciotxt.setText("");
            }
        });
        cosBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //añadirNumero("Cos");

                operador="Cos";
                Operaciotxt.setText("");
            }
        });
        tanBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //añadirNumero("Tan");
                operador="Tan";
                Operaciotxt.setText("");
            }
        });
        exponBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //añadirNumero("^");
                primerNumero=Float.parseFloat(Operaciotxt.getText());
                operador="^";
                Operaciotxt.setText("");
            }
        });

        igualBT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                segundoNumero=Float.parseFloat(Operaciotxt.getText());
                switch (operador){
                    case "+":
                        Resultadotxt.setText(Float.toString(primerNumero+segundoNumero));
                        Operaciotxt.setText("");
                        break;
                    case "-":
                        Resultadotxt.setText(Float.toString(primerNumero-segundoNumero));
                        Operaciotxt.setText("");
                        break;
                    case "*":
                        Resultadotxt.setText(Float.toString(primerNumero*segundoNumero));
                        Operaciotxt.setText("");
                        break;
                    case "/":
                        if(segundoNumero==0){
                            Operaciotxt.setText("");
                        }
                        else{
                            Resultadotxt.setText(Float.toString(primerNumero/segundoNumero));
                            Operaciotxt.setText("");
                        }
                        break;

                    case "%":
                        Resultadotxt.setText(Float.toString((primerNumero*segundoNumero)/100));
                        Operaciotxt.setText("");
                        break;
                    case "±":
                        Resultadotxt.setText(Float.toString(primerNumero+segundoNumero));
                        Resultadotxt.setText(Float.toString(primerNumero-segundoNumero));
                        Operaciotxt.setText("");
                        break;
                    case "Sen":
                        Resultadotxt.setText(Double.toString(Math.sin(segundoNumero)));
                        Operaciotxt.setText("");
                        break;
                    case "Cos":
                        Resultadotxt.setText(Double.toString(Math.cos(segundoNumero)));
                        Operaciotxt.setText("");
                        break;
                    case "Tan":
                        Resultadotxt.setText(Double.toString(Math.tan(segundoNumero)));
                        Operaciotxt.setText("");
                        break;
                    case "^":
                        Resultadotxt.setText(Double.toString(Math.pow(primerNumero,segundoNumero)));
                        Operaciotxt.setText("");
                        break;
                }

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
