import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class BotoesExtra {

    public JButton botaoEM, botaoR, botaoF, botaoA, botaoP, botaoModoEscuroELuz; //botoes que serao aplicados.

    //Euler-Mascheroni (γ) 0.57721566490153
    //Constante de Feigenbaum (δ) 4.66920160910299
    //Constante de Ramanujan-Soldner (μ) 0.37250741078136
    //constante de phi (φ) 1.61803398874989
    //Constante de Apéry (G) 0.91596559417721

    public JButton BotaoEM(short x, short y, short width, short height){
        botaoEM = new JButton();
        botaoEM.setFont(new Font("Look and Feel", 1, 18));
        botaoEM.setForeground(new Color(0, 0, 102));
        botaoEM.setText("γ");
        botaoEM.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoEM.setRequestFocusEnabled(false);
        botaoEM.setFocusable(false);
        //botaoEM.setRolloverEnabled(true);
        //botaoEM.setMargin(new Insets(2, 1000, 2, 14));
        botaoEM.setBackground(new Color(59, 125, 187));
        botaoEM.setBounds(x, y,width, height);

        botaoEM.addActionListener((ActionEvent e) -> {
                for (byte i = 0; i < App.formatoDecimal.format(0.57721566490153).length(); i++) {
                    Calcular.identicadoresArmazenados += App.formatoDecimal.format(0.57721566490153).substring(i,i+1)+"$";
                }
                App.textoInserido += App.formatoDecimal.format(0.57721566490153);
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoEM;
    }

    public JButton BotaoF(short x, short y, short width, short height){
        botaoF = new JButton();
        botaoF.setFont(new Font("Look and Feel", 1, 24));
        botaoF.setForeground(new Color(0, 0, 102));
        botaoF.setText("δ");
        botaoF.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoF.setRequestFocusEnabled(false);
        botaoF.setFocusable(false);
        //botaoF.setRolloverEnabled(true);
        //botaoF.setMargin(new Insets(2, 1000, 2, 14));
        botaoF.setBackground(new Color(59, 125, 187));
        botaoF.setBounds(x, y,width, height);

        botaoF.addActionListener((ActionEvent e) -> {
                for (byte i = 0; i < App.formatoDecimal.format(4.66920160910299).length(); i++) {
                    Calcular.identicadoresArmazenados += App.formatoDecimal.format(4.66920160910299).substring(i,i+1)+"$";
                }
                App.textoInserido += App.formatoDecimal.format(4.66920160910299);
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoF;
    }

    public JButton BotaoR(short x, short y, short width, short height){
        botaoR = new JButton();
        botaoR.setFont(new Font("Look and Feel", 1, 20));
        botaoR.setForeground(new Color(0, 0, 102));
        botaoR.setText("μ");
        botaoR.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoR.setRequestFocusEnabled(false);
        botaoR.setFocusable(false);
        //botaoR.setRolloverEnabled(true);
        //botaoR.setMargin(new Insets(2, 1000, 2, 14));
        botaoR.setBackground(new Color(59, 125, 187));
        botaoR.setBounds(x, y,width, height);

        botaoR.addActionListener((ActionEvent e) -> {
                for (byte i = 0; i < App.formatoDecimal.format(0.37250741078136).length(); i++) {
                    Calcular.identicadoresArmazenados += App.formatoDecimal.format(0.37250741078136).substring(i,i+1)+"$";
                }
                App.textoInserido += App.formatoDecimal.format(0.37250741078136);
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoR;
    }

    public JButton BotaoA(short x, short y, short width, short height){
        botaoA = new JButton();
        botaoA.setFont(new Font("Look and Feel", 1, 24));
        botaoA.setForeground(new Color(0, 0, 102));
        botaoA.setText("G");
        botaoA.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoA.setRequestFocusEnabled(false);
        botaoA.setFocusable(false);
        //botaoA.setRolloverEnabled(true);
        //botaoA.setMargin(new Insets(2, 1000, 2, 14));
        botaoA.setBackground(new Color(59, 125, 187));
        botaoA.setBounds(x, y,width, height);

        botaoA.addActionListener((ActionEvent e) -> {
                for (byte i = 0; i < App.formatoDecimal.format(0.91596559417721).length(); i++) {
                    Calcular.identicadoresArmazenados += App.formatoDecimal.format(0.91596559417721).substring(i,i+1)+"$";
                }
                App.textoInserido += App.formatoDecimal.format(0.91596559417721);
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoA;
    }

    public JButton BotaoP(short x, short y, short width, short height){
        botaoP = new JButton();
        botaoP.setFont(new Font("Look and Feel", 1, 20));
        botaoP.setForeground(new Color(0, 0, 102));
        botaoP.setText("φ");
        botaoP.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoP.setRequestFocusEnabled(false);
        botaoP.setFocusable(false);
        //botaoP.setRolloverEnabled(true);
        //botaoP.setMargin(new Insets(2, 1000, 2, 14));
        botaoP.setBackground(new Color(59, 125, 187));
        botaoP.setBounds(x, y,width, height);

        botaoP.addActionListener((ActionEvent e) -> {
                for (byte i = 0; i < App.formatoDecimal.format(1.61803398874989).length(); i++) {
                    Calcular.identicadoresArmazenados += App.formatoDecimal.format(1.61803398874989).substring(i,i+1)+"$";
                }
                App.textoInserido += App.formatoDecimal.format(1.61803398874989);
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoP;
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
