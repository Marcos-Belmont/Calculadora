import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class BotoesCientifico {

    public JButton botaoPi,botaoEuler,botaoFatorial,botaoAbrindoParenteses,botaoFechandoParenteses,botaoEXP,botaoModulo,botaoResto,botaoXElevadoPotenciaY,botaoDezElevadoPotenciaX,
    botaoLogaritmo,botaoLogaritmoNatural,botaoXElevadoPotencia3,botaoRaizCubicaX,botaoRaizYX,botaoDoisElevadoPotenciaX,botaoLogYBaseX,botaoEElevadoPotenciaX; //botoes que serao aplicados.

    public JButton BotaoPi(short x, short y, short width, short height){
        botaoPi = new JButton();
        botaoPi.setFont(new Font("Look and Feel", 1, 24));
        botaoPi.setForeground(new Color(0, 0, 102));
        botaoPi.setText("π");
        botaoPi.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoPi.setRequestFocusEnabled(false);
        botaoPi.setFocusable(false);
        //botaoPi.setRolloverEnabled(true);
        //botaoPi.setMargin(new Insets(2, 1000, 2, 14));
        botaoPi.setBackground(new Color(59, 125, 187));
        botaoPi.setBounds(x, y,width, height);

        botaoPi.addActionListener((ActionEvent e) -> {
                App.textoInserido += App.formatoDecimal.format(Math.PI);
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoPi;
    }

    public JButton BotaoEuler(short x, short y, short width, short height){
        botaoEuler = new JButton();
        botaoEuler.setFont(new Font("Look and Feel", 1, 24));
        botaoEuler.setForeground(new Color(0, 0, 102));
        botaoEuler.setText("e");
        botaoEuler.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoEuler.setRequestFocusEnabled(false);
        botaoEuler.setFocusable(false);
        //botaoEuler.setRolloverEnabled(true);
        //botaoEuler.setMargin(new Insets(2, 1000, 2, 14));
        botaoEuler.setBackground(new Color(59, 125, 187));
        botaoEuler.setBounds(x, y,width, height);

        botaoEuler.addActionListener((ActionEvent e) -> {
                App.textoInserido += App.formatoDecimal.format(Math.E);
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoEuler;
    }

    public JButton BotaoFatorial(short x, short y, short width, short height){
        botaoFatorial = new JButton();
        botaoFatorial.setFont(new Font("Look and Feel", 1, 24));
        botaoFatorial.setForeground(new Color(0, 0, 102));
        botaoFatorial.setText("n!");
        botaoFatorial.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoFatorial.setRequestFocusEnabled(false);
        botaoFatorial.setFocusable(false);
        //botaoFatorial.setRolloverEnabled(true);
        //botaoFatorial.setMargin(new Insets(2, 1000, 2, 14));
        botaoFatorial.setBackground(new Color(59, 125, 187));
        botaoFatorial.setBounds(x, y,width, height);

        botaoFatorial.addActionListener((ActionEvent e) -> {
                App.textoInserido += "n!";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoFatorial;
    }

    public JButton BotaoAbrindoParenteses(short x, short y, short width, short height){
        botaoAbrindoParenteses = new JButton();
        botaoAbrindoParenteses.setFont(new Font("Look and Feel", 1, 24));
        botaoAbrindoParenteses.setForeground(new Color(0, 0, 102));
        botaoAbrindoParenteses.setText("(");
        botaoAbrindoParenteses.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoAbrindoParenteses.setRequestFocusEnabled(false);
        botaoAbrindoParenteses.setFocusable(false);
        //botaoAbrindoParenteses.setRolloverEnabled(true);
        //botaoAbrindoParenteses.setMargin(new Insets(2, 1000, 2, 14));
        botaoAbrindoParenteses.setBackground(new Color(59, 125, 187));
        botaoAbrindoParenteses.setBounds(x, y,width, height);

        botaoAbrindoParenteses.addActionListener((ActionEvent e) -> {
                App.textoInserido += "(";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoAbrindoParenteses;
    }

    public JButton BotaoFechandoParenteses(short x, short y, short width, short height){
        botaoFechandoParenteses = new JButton();
        botaoFechandoParenteses.setFont(new Font("Look and Feel", 1, 24));
        botaoFechandoParenteses.setForeground(new Color(0, 0, 102));
        botaoFechandoParenteses.setText(")");
        botaoFechandoParenteses.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoFechandoParenteses.setRequestFocusEnabled(false);
        botaoFechandoParenteses.setFocusable(false);
        //botaoFechandoParenteses.setRolloverEnabled(true);
        //botaoFechandoParenteses.setMargin(new Insets(2, 1000, 2, 14));
        botaoFechandoParenteses.setBackground(new Color(59, 125, 187));
        botaoFechandoParenteses.setBounds(x, y,width, height);

        botaoFechandoParenteses.addActionListener((ActionEvent e) -> {
                App.textoInserido += ")";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoFechandoParenteses;
    }

    public JButton BotaoEXP(short x, short y, short width, short height){
        botaoEXP = new JButton();
        botaoEXP.setFont(new Font("Look and Feel", 1, 18));
        botaoEXP.setForeground(new Color(0, 0, 102));
        botaoEXP.setText("exp");
        botaoEXP.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoEXP.setRequestFocusEnabled(false);
        botaoEXP.setFocusable(false);
        //botaoEXP.setRolloverEnabled(true);
        //botaoEXP.setMargin(new Insets(2, 1000, 2, 14));
        botaoEXP.setBackground(new Color(59, 125, 187));
        botaoEXP.setBounds(x, y,width, height);

        botaoEXP.addActionListener((ActionEvent e) -> {
                App.textoInserido += "exp";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoEXP;
    }

    public JButton BotaoModulo(short x, short y, short width, short height){
        botaoModulo = new JButton();
        botaoModulo.setFont(new Font("Look and Feel", 1, 24));
        botaoModulo.setForeground(new Color(0, 0, 102));
        botaoModulo.setText("|x|");
        botaoModulo.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoModulo.setRequestFocusEnabled(false);
        botaoModulo.setFocusable(false);
        //botaoModulo.setRolloverEnabled(true);
        //botaoModulo.setMargin(new Insets(2, 1000, 2, 14));
        botaoModulo.setBackground(new Color(59, 125, 187));
        botaoModulo.setBounds(x, y,width, height);

        botaoModulo.addActionListener((ActionEvent e) -> {
                App.textoInserido += "|x|";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoModulo;
    }

    public JButton BotaoResto(short x, short y, short width, short height){
        botaoResto = new JButton();
        botaoResto.setFont(new Font("Look and Feel", 1, 17));
        botaoResto.setForeground(new Color(0, 0, 102));
        botaoResto.setText("mod");
        botaoResto.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoResto.setRequestFocusEnabled(false);
        botaoResto.setFocusable(false);
        //botaoResto.setRolloverEnabled(true);
        //botaoResto.setMargin(new Insets(2, 1000, 2, 14));
        botaoResto.setBackground(new Color(59, 125, 187));
        botaoResto.setBounds(x, y,width, height);

        botaoResto.addActionListener((ActionEvent e) -> {
                App.textoInserido += "mod";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoResto;
    }

    public JButton BotaoXElevadoPotenciaY(short x, short y, short width, short height){
        botaoXElevadoPotenciaY = new JButton();
        botaoXElevadoPotenciaY.setFont(new Font("Look and Feel", 1, 24));
        botaoXElevadoPotenciaY.setForeground(new Color(0, 0, 102));
        botaoXElevadoPotenciaY.setText("x\u02B8");
        botaoXElevadoPotenciaY.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoXElevadoPotenciaY.setRequestFocusEnabled(false);
        botaoXElevadoPotenciaY.setFocusable(false);
        //botaoXElevadoPotenciaY.setRolloverEnabled(true);
        //botaoXElevadoPotenciaY.setMargin(new Insets(2, 1000, 2, 14));
        botaoXElevadoPotenciaY.setBackground(new Color(59, 125, 187));
        botaoXElevadoPotenciaY.setBounds(x, y,width, height);

        botaoXElevadoPotenciaY.addActionListener((ActionEvent e) -> {
                App.textoInserido += "x^y";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoXElevadoPotenciaY;
    }

    public JButton BotaoDezElevadoPotenciaX(short x, short y, short width, short height){
        botaoDezElevadoPotenciaX = new JButton();
        botaoDezElevadoPotenciaX.setFont(new Font("Look and Feel", 1, 24));
        botaoDezElevadoPotenciaX.setForeground(new Color(0, 0, 102));
        botaoDezElevadoPotenciaX.setText("10\u02E3");
        botaoDezElevadoPotenciaX.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoDezElevadoPotenciaX.setRequestFocusEnabled(false);
        botaoDezElevadoPotenciaX.setFocusable(false);
        //botaoDezElevadoPotenciaX.setRolloverEnabled(true);
        //botaoDezElevadoPotenciaX.setMargin(new Insets(2, 1000, 2, 14));
        botaoDezElevadoPotenciaX.setBackground(new Color(59, 125, 187));
        botaoDezElevadoPotenciaX.setBounds(x, y,width, height);

        botaoDezElevadoPotenciaX.addActionListener((ActionEvent e) -> {
                App.textoInserido += "10^x";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoDezElevadoPotenciaX;
    }

    public JButton BotaoLogaritmo(short x, short y, short width, short height){
        botaoLogaritmo = new JButton();
        botaoLogaritmo.setFont(new Font("Look and Feel", 1, 17));
        botaoLogaritmo.setForeground(new Color(0, 0, 102));
        botaoLogaritmo.setText("log");
        botaoLogaritmo.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoLogaritmo.setRequestFocusEnabled(false);
        botaoLogaritmo.setFocusable(false);
        //botaoLogaritmo.setRolloverEnabled(true);
        //botaoLogaritmo.setMargin(new Insets(2, 1000, 2, 14));
        botaoLogaritmo.setBackground(new Color(59, 125, 187));
        botaoLogaritmo.setBounds(x, y,width, height);

        botaoLogaritmo.addActionListener((ActionEvent e) -> {
                App.textoInserido += "log";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoLogaritmo;
    }

    public JButton BotaoLogaritmoNatural(short x, short y, short width, short height){
        botaoLogaritmoNatural = new JButton();
        botaoLogaritmoNatural.setFont(new Font("Look and Feel", 1, 24));
        botaoLogaritmoNatural.setForeground(new Color(0, 0, 102));
        botaoLogaritmoNatural.setText("ln");
        botaoLogaritmoNatural.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoLogaritmoNatural.setRequestFocusEnabled(false);
        botaoLogaritmoNatural.setFocusable(false);
        //botaoLogaritmoNatural.setRolloverEnabled(true);
        //botaoLogaritmoNatural.setMargin(new Insets(2, 1000, 2, 14));
        botaoLogaritmoNatural.setBackground(new Color(59, 125, 187));
        botaoLogaritmoNatural.setBounds(x, y,width, height);

        botaoLogaritmoNatural.addActionListener((ActionEvent e) -> {
                App.textoInserido += "ln";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoLogaritmoNatural;
    }

    public JButton BotaoXElevadoPotencia3(short x, short y, short width, short height){
        botaoXElevadoPotencia3 = new JButton();
        botaoXElevadoPotencia3.setFont(new Font("Look and Feel", 1, 24));
        botaoXElevadoPotencia3.setForeground(new Color(0, 0, 102));
        botaoXElevadoPotencia3.setText("x³");
        botaoXElevadoPotencia3.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoXElevadoPotencia3.setRequestFocusEnabled(false);
        botaoXElevadoPotencia3.setFocusable(false);
        //botaoXElevadoPotencia3.setRolloverEnabled(true);
        //botaoXElevadoPotencia3.setMargin(new Insets(2, 1000, 2, 14));
        botaoXElevadoPotencia3.setBackground(new Color(59, 125, 187));
        botaoXElevadoPotencia3.setBounds(x, y,width, height);

        botaoXElevadoPotencia3.addActionListener((ActionEvent e) -> {
                App.textoInserido += "x³";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoXElevadoPotencia3;
    }

    public JButton BotaoRaizCubicaX(short x, short y, short width, short height){
        botaoRaizCubicaX = new JButton();
        botaoRaizCubicaX.setFont(new Font("Look and Feel", 1, 24));
        botaoRaizCubicaX.setForeground(new Color(0, 0, 102));
        botaoRaizCubicaX.setText("³√x");
        botaoRaizCubicaX.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoRaizCubicaX.setRequestFocusEnabled(false);
        botaoRaizCubicaX.setFocusable(false);
        //botaoRaizCubicaX.setRolloverEnabled(true);
        //botaoRaizCubicaX.setMargin(new Insets(2, 1000, 2, 14));
        botaoRaizCubicaX.setBackground(new Color(59, 125, 187));
        botaoRaizCubicaX.setBounds(x, y,width, height);

        botaoRaizCubicaX.addActionListener((ActionEvent e) -> {
                App.textoInserido += "³√x";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoRaizCubicaX;
    }

    public JButton BotaoRaizYX(short x, short y, short width, short height){
        botaoRaizYX = new JButton();
        botaoRaizYX.setFont(new Font("Look and Feel", 1, 24));
        botaoRaizYX.setForeground(new Color(0, 0, 102));
        botaoRaizYX.setText("\u02B8√x");
        botaoRaizYX.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoRaizYX.setRequestFocusEnabled(false);
        botaoRaizYX.setFocusable(false);
        //botaoRaizYX.setRolloverEnabled(true);
        //botaoRaizYX.setMargin(new Insets(2, 1000, 2, 14));
        botaoRaizYX.setBackground(new Color(59, 125, 187));
        botaoRaizYX.setBounds(x, y,width, height);

        botaoRaizYX.addActionListener((ActionEvent e) -> {
                App.textoInserido += "y√x";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoRaizYX;
    }

    public JButton BotaoDoisElevadoPotenciaX(short x, short y, short width, short height){
        botaoDoisElevadoPotenciaX = new JButton();
        botaoDoisElevadoPotenciaX.setFont(new Font("Look and Feel", 1, 24));
        botaoDoisElevadoPotenciaX.setForeground(new Color(0, 0, 102));
        botaoDoisElevadoPotenciaX.setText("2\u02E3");
        botaoDoisElevadoPotenciaX.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoDoisElevadoPotenciaX.setRequestFocusEnabled(false);
        botaoDoisElevadoPotenciaX.setFocusable(false);
        //botaoDoisElevadoPotenciaX.setRolloverEnabled(true);
        //botaoDoisElevadoPotenciaX.setMargin(new Insets(2, 1000, 2, 14));
        botaoDoisElevadoPotenciaX.setBackground(new Color(59, 125, 187));
        botaoDoisElevadoPotenciaX.setBounds(x, y,width, height);

        botaoDoisElevadoPotenciaX.addActionListener((ActionEvent e) -> {
                App.textoInserido += "2^x";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoDoisElevadoPotenciaX;
    }

    public JButton BotaoLogYBaseX(short x, short y, short width, short height){
        botaoLogYBaseX = new JButton();
        botaoLogYBaseX.setFont(new Font("Look and Feel", 1, 17));
        botaoLogYBaseX.setForeground(new Color(0, 0, 102));
        botaoLogYBaseX.setText("log\u1D67x");
        botaoLogYBaseX.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoLogYBaseX.setRequestFocusEnabled(false);
        botaoLogYBaseX.setFocusable(false);
        //botaoLogYBaseX.setRolloverEnabled(true);
        //botaoLogYBaseX.setMargin(new Insets(2, 1000, 2, 14));
        botaoLogYBaseX.setBackground(new Color(59, 125, 187));
        botaoLogYBaseX.setBounds(x, y,width, height);

        botaoLogYBaseX.addActionListener((ActionEvent e) -> {
                App.textoInserido += "logyx";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoLogYBaseX;
    }

    public JButton BotaoEElevadoPotenciaX(short x, short y, short width, short height){
        botaoEElevadoPotenciaX = new JButton();
        botaoEElevadoPotenciaX.setFont(new Font("Look and Feel", 1, 24));
        botaoEElevadoPotenciaX.setForeground(new Color(0, 0, 102));
        botaoEElevadoPotenciaX.setText("e\u02E3");
        botaoEElevadoPotenciaX.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoEElevadoPotenciaX.setRequestFocusEnabled(false);
        botaoEElevadoPotenciaX.setFocusable(false);
        //botaoEElevadoPotenciaX.setRolloverEnabled(true);
        //botaoEElevadoPotenciaX.setMargin(new Insets(2, 1000, 2, 14));
        botaoEElevadoPotenciaX.setBackground(new Color(59, 125, 187));
        botaoEElevadoPotenciaX.setBounds(x, y,width, height);

        botaoEElevadoPotenciaX.addActionListener((ActionEvent e) -> {
                App.textoInserido += "e^x";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoEElevadoPotenciaX;
    }

}