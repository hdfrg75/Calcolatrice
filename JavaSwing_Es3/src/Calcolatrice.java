import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calcolatrice extends JFrame {

    private JPanel panel;
    private JButton buttonUguale;
    private JButton buttonMeno;
    private JButton buttonPiù;
    private JButton buttonPer;
    private JButton buttonDiviso;
    private JButton buttonPunto;
    private JButton button0;
    private JButton button9;
    private JButton button6;
    private JButton button3;
    private JButton button8;
    private JButton button5;
    private JButton button2;
    private JButton button1;
    private JLabel labelNumeri;
    private JButton button4;
    private JButton button7;
    private JButton buttonPi;
    private JButton buttonXalla2;
    private JButton buttonRad;
    private JButton buttonAc;
    int operazione = 10;
    //+ = 0, - = 1, x = 2, ÷ = 3;
    float parte1somma;
    float parte1meno;
    float parte1per;
    float parte1diviso;


    public Calcolatrice() {
        setTitle("Calcolatrice");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 400);

        setLocationRelativeTo(null);
        setVisible(true);
        setContentPane(panel);
        panel.setBackground(new Color(28,28,28));
        labelNumeri.setForeground(new Color(255, 255, 255));
        buttonAc.setBackground(new Color(212,212,210));
        button0.setBackground(new Color(80,80,80));
        button0.setForeground(new Color(255,255,255));
        buttonPunto.setBackground(new Color(80,80,80));
        buttonPunto.setForeground(new Color(255,255,255));
        button1.setBackground(new Color(80,80,80));
        button1.setForeground(new Color(255,255,255));
        button2.setBackground(new Color(80,80,80));
        button2.setForeground(new Color(255,255,255));
        button3.setBackground(new Color(80,80,80));
        button3.setForeground(new Color(255,255,255));
        button4.setBackground(new Color(80,80,80));
        button4.setForeground(new Color(255,255,255));
        button5.setBackground(new Color(80,80,80));
        button5.setForeground(new Color(255,255,255));
        button6.setBackground(new Color(80,80,80));
        button6.setForeground(new Color(255,255,255));
        button7.setBackground(new Color(80,80,80));
        button7.setForeground(new Color(255,255,255));
        button8.setBackground(new Color(80,80,80));
        button8.setForeground(new Color(255,255,255));
        button9.setBackground(new Color(80,80,80));
        button9.setForeground(new Color(255,255,255));
        buttonUguale.setBackground(new Color(255, 149, 0));
        buttonUguale.setForeground(new Color(255,255,255));
        buttonPiù.setBackground(new Color(255, 149, 0));
        buttonPiù.setForeground(new Color(255,255,255));
        buttonMeno.setBackground(new Color(255, 149, 0));
        buttonMeno.setForeground(new Color(255,255,255));
        buttonPer.setBackground(new Color(255, 149, 0));
        buttonPer.setForeground(new Color(255,255,255));
        buttonDiviso.setBackground(new Color(255, 149, 0));
        buttonDiviso.setForeground(new Color(255,255,255));
        buttonRad.setBackground(new Color(212,212,210));
        buttonXalla2.setBackground(new Color(212,212,210));
        buttonPi.setBackground(new Color(212,212,210));







        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                labelNumeri.setText(labelNumeri.getText() + "0");

            }
        });


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                labelNumeri.setText(labelNumeri.getText() + "1");
            }
        });


        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                labelNumeri.setText(labelNumeri.getText() + "2");
            }
        });


        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                labelNumeri.setText(labelNumeri.getText() + "3");
            }
        });


        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                labelNumeri.setText(labelNumeri.getText() + "4");
            }
        });


        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                labelNumeri.setText(labelNumeri.getText() + "5");
            }
        });


        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                labelNumeri.setText(labelNumeri.getText() + "6");
            }
        });


        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                labelNumeri.setText(labelNumeri.getText() + "7");
            }
        });


        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                labelNumeri.setText(labelNumeri.getText() + "8");
            }
        });


        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                labelNumeri.setText(labelNumeri.getText() + "9");
            }
        });


        buttonPunto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                labelNumeri.setText(labelNumeri.getText() + ".");
            }
        });


        buttonAc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                labelNumeri.setText("");
                operazione = 10;
            }
        });


        buttonPiù.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                float label = Float.valueOf(labelNumeri.getText());
                parte1somma = label;
                labelNumeri.setText(labelNumeri.getText() + "+");
                operazione = 0;
                labelNumeri.setText("");
            }
        });


        buttonMeno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                float label = Float.valueOf(labelNumeri.getText());
                parte1meno = label;
                labelNumeri.setText(labelNumeri.getText() + "-");
                operazione = 1;
                labelNumeri.setText("");

            }
        });


        buttonPer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                float label = Float.valueOf(labelNumeri.getText());
                parte1per = label;
                labelNumeri.setText(labelNumeri.getText() + "*");
                operazione = 2;
                labelNumeri.setText("");
            }
        });


        buttonDiviso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                float label = Float.valueOf(labelNumeri.getText());
                parte1diviso = label;
                labelNumeri.setText(labelNumeri.getText() + "/");
                operazione = 3;
                labelNumeri.setText("");
            }
        });


        buttonRad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(operazione==0 || operazione == 1 || operazione== 2 || operazione ==3) {
                    JOptionPane.showMessageDialog(Calcolatrice.this, "Questa azione non si può verificare : " + "Errore");

                }else{
                    float label = Float.valueOf(labelNumeri.getText());
                    double radQuad = Math.sqrt(label);
                    labelNumeri.setText(String.valueOf(radQuad));
                }
            }
        });

        buttonPi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(operazione==0 || operazione == 1 || operazione== 2 || operazione ==3) {
                    JOptionPane.showMessageDialog(Calcolatrice.this, "Questa azione non si può verificare : " + "Errore");
                }else{
                    double label = Double.valueOf(labelNumeri.getText());
                    double calcoloPi = (label * 3.14);
                    labelNumeri.setText(String.valueOf(calcoloPi));
                }
            }
        });


        buttonXalla2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(operazione==0 || operazione == 1 || operazione== 2 || operazione ==3) {
                    JOptionPane.showMessageDialog(Calcolatrice.this, "Questa azione non si può verificare : " + "Errore");

                }else{
                    float label = Float.valueOf(labelNumeri.getText());
                    float xAlla2 = label * label;
                    labelNumeri.setText(String.valueOf(xAlla2));
                }
            }
        });

        buttonUguale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(operazione == 0){
                    float label = Float.valueOf(labelNumeri.getText());
                    float parte2somma = label;
                    float risultato = parte1somma + parte2somma;
                    labelNumeri.setText(String.valueOf(risultato));
                    operazione = 10;
                }
                if(operazione == 1){
                    float label = Float.valueOf(labelNumeri.getText());
                    float parte2meno = label;
                    float risultato = parte1meno - parte2meno;
                    labelNumeri.setText(String.valueOf(risultato));
                    operazione = 10;

                }
                if(operazione == 2){
                    float label = Float.valueOf(labelNumeri.getText());
                    float parte2per = label;
                    float risultato = parte1per * parte2per;
                    labelNumeri.setText(String.valueOf(risultato));
                    operazione = 10;

                }
                if(operazione == 3){
                    float label = Float.valueOf(labelNumeri.getText());
                    float parte2diviso = label;
                    float risultato = parte1diviso / parte2diviso;
                    labelNumeri.setText(String.valueOf(risultato));
                    operazione = 10;
                }
            }
        });
    }
    public static void main(String[] args) {
        Calcolatrice gui = new Calcolatrice();

    }
}