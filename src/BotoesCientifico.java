import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BotoesCientifico {

    private static JButton botao; //botao que será aplicado.

    public static JButton BotaoPi(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" π ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                App.textoInserido += App.formatoDecimal.format(Math.PI);
                App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoEuler(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" e ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                App.textoInserido += App.formatoDecimal.format(Math.E);
                App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoFatorial(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" n! ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                App.textoInserido += "n!";
                App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoAbrindoParenteses(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" ( ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                App.textoInserido += "(";
                App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoFechandoParenteses(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" ) ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                App.textoInserido += ")";
                App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoEXP(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" exp ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                App.textoInserido += "exp";
                App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoModulo(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" |x| ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                App.textoInserido += "|x|";
                App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoResto(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" mod ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                App.textoInserido += "mod";
                App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoXElevadoPotenciaY(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" x^y ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                App.textoInserido += "x^y";
                App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoDezElevadoPotenciaX(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" 10^x ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                App.textoInserido += "10^x";
                App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoLogaritmo(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" log ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                App.textoInserido += "log";
                App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoLogaritmoNatural(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" ln ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                App.textoInserido += "ln";
                App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoXElevadoPotencia3(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" x³ ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                App.textoInserido += "x³";
                App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoRaizCubicaX(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" ³√x ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                App.textoInserido += "³√x";
                App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoRaizYX(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" y√x ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                App.textoInserido += "y√x";
                App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoDoisElevadoPotenciaX(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" 2^x ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                App.textoInserido += "2^x";
                App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoLogYBaseX(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" logyx ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                App.textoInserido += "logyx";
                App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoEElevadoPotenciaX(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" e^x ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                App.textoInserido += "e^x";
                App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

}