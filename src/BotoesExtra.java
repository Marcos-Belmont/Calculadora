import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class BotoesExtra {

    public JButton botaoGradiente, botaoArco, botaoDelta, botaoSigma, botaoModoEscuroELuz; //botoes que serao aplicados.

    public JButton BotaoGradiente(short x, short y, short width, short height){
        botaoGradiente = new JButton();
        botaoGradiente.setFont(new Font("Look and Feel", 1, 24));
        botaoGradiente.setForeground(new Color(0, 0, 102));
        botaoGradiente.setText("∇");
        botaoGradiente.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoGradiente.setRequestFocusEnabled(false);
        botaoGradiente.setFocusable(false);
        //botaoGradiente.setRolloverEnabled(true);
        //botaoGradiente.setMargin(new Insets(2, 1000, 2, 14));
        botaoGradiente.setBackground(new Color(59, 125, 187));
        botaoGradiente.setBounds(x, y,width, height);

        botaoGradiente.addActionListener((ActionEvent e) -> {
                App.textoInserido += "∇";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoGradiente;
    }

    public JButton BotaoDelta(short x, short y, short width, short height){
        botaoDelta = new JButton();
        botaoDelta.setFont(new Font("Look and Feel", 1, 24));
        botaoDelta.setForeground(new Color(0, 0, 102));
        botaoDelta.setText("∆");
        botaoDelta.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoDelta.setRequestFocusEnabled(false);
        botaoDelta.setFocusable(false);
        //botaoDelta.setRolloverEnabled(true);
        //botaoDelta.setMargin(new Insets(2, 1000, 2, 14));
        botaoDelta.setBackground(new Color(59, 125, 187));
        botaoDelta.setBounds(x, y,width, height);

        botaoDelta.addActionListener((ActionEvent e) -> {
                App.textoInserido += "∆";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoDelta;
    }

    public JButton BotaoArco(short x, short y, short width, short height){
        botaoArco = new JButton();
        botaoArco.setFont(new Font("Look and Feel", 1, 24));
        botaoArco.setForeground(new Color(0, 0, 102));
        botaoArco.setText("Arco");
        botaoArco.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoArco.setRequestFocusEnabled(false);
        botaoArco.setFocusable(false);
        //botaoArco.setRolloverEnabled(true);
        //botaoArco.setMargin(new Insets(2, 1000, 2, 14));
        botaoArco.setBackground(new Color(59, 125, 187));
        botaoArco.setBounds(x, y,width, height);

        botaoArco.addActionListener((ActionEvent e) -> {
                App.textoInserido += "Arco";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoArco;
    }

    public JButton BotaoSigma(short x, short y, short width, short height){
        botaoSigma = new JButton();
        botaoSigma.setFont(new Font("Look and Feel", 1, 24));
        botaoSigma.setForeground(new Color(0, 0, 102));
        botaoSigma.setText("Σ");
        botaoSigma.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoSigma.setRequestFocusEnabled(false);
        botaoSigma.setFocusable(false);
        //botaoSigma.setRolloverEnabled(true);
        //botaoSigma.setMargin(new Insets(2, 1000, 2, 14));
        botaoSigma.setBackground(new Color(59, 125, 187));
        botaoSigma.setBounds(x, y,width, height);

        botaoSigma.addActionListener((ActionEvent e) -> {
                App.textoInserido += "Σ";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoSigma;
    }

    public JButton BotaoModoEscuroELuz(short x, short y, short width, short height){
        botaoModoEscuroELuz = new JButton();
        botaoModoEscuroELuz.setFont(new Font("Look and Feel", 1, 24));
        botaoModoEscuroELuz.setForeground(new Color(0, 0, 102));
        botaoModoEscuroELuz.setText("Escuro");
        botaoModoEscuroELuz.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoModoEscuroELuz.setRequestFocusEnabled(false);
        botaoModoEscuroELuz.setFocusable(false);
        //botaoModoEscuroELuz.setRolloverEnabled(true);
        //botaoModoEscuroELuz.setMargin(new Insets(2, 1000, 2, 14));
        botaoModoEscuroELuz.setBackground(new Color(59, 125, 187));
        botaoModoEscuroELuz.setBounds(x, y,width, height);

        botaoModoEscuroELuz.addActionListener((ActionEvent e) -> {
            Gravador.Gravar();
        });

        return botaoModoEscuroELuz;
    }
}
