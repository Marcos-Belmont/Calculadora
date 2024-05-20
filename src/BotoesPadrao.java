import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BotoesPadrao {

    private static JButton botao; //botao que será aplicado.

    public static JButton Botao0(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" 0 ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                App.textoInserido += "0";
                App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton Botao1(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" 1 ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
            App.textoInserido += "1";
            App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton Botao2(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" 2 ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
            App.textoInserido += "2";
            App.areaTexto.setText(App.textoInserido);
        });
        return botao;
    }

    public static JButton Botao3(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" 3 ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
            App.textoInserido += "3";
            App.areaTexto.setText(App.textoInserido);
        });
        return botao;
    }

    public static JButton Botao4(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" 4 ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
            App.textoInserido += "4";
            App.areaTexto.setText(App.textoInserido);
        });
        return botao;
    }

    public static JButton Botao5(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" 5 ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
            App.textoInserido += "5";
            App.areaTexto.setText(App.textoInserido);
        });
        return botao;
    }

    public static JButton Botao6(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" 6 ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
            App.textoInserido += "6";
            App.areaTexto.setText(App.textoInserido);
        });
        return botao;
    }

    public static JButton Botao7(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" 7 ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
            App.textoInserido += "7";
            App.areaTexto.setText(App.textoInserido);
        });
        return botao;
    }

    public static JButton Botao8(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" 8 ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
            App.textoInserido += "8";
            App.areaTexto.setText(App.textoInserido);
        });
        return botao;
    }

    public static JButton Botao9(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" 9 ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
            App.textoInserido += "9";
            App.areaTexto.setText(App.textoInserido);
        });
        return botao;
    }

    public static JButton BotaoIgual(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" = ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
            Calcular.Resultado();
        });

        return botao;
    }

    public static JButton BotaoApagar(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" <= ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
            if (App.textoInserido.length() != 0) {
                App.textoInserido = App.textoInserido.substring(0, App.textoInserido.length() - 1);
                App.areaTexto.setText(App.textoInserido);
            }
        });

        return botao;
    }

    public static JButton BotaoApagarTudo(){
        botao = new JButton();
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" DEL ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
            App.textoInserido = "";
            App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoSubtracao(){
        botao = new JButton();
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" - ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
            App.textoInserido += "-";
            App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoSoma(){
        botao = new JButton();
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" + ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
            App.textoInserido += "+";
            App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoDivisao(){
        botao = new JButton();
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" ÷ ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
            App.textoInserido += "÷";
            App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoMultiplicacao(){
        botao = new JButton();
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" X ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
            App.textoInserido += "X";
            App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

}
