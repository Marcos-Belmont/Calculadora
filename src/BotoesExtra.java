import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class BotoesExtra {

 private static JButton botao; //botao que será aplicado.

    public static JButton BotaoGradiente(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" ∇ ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                App.textoInserido += "∇";
                App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoArco(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" Arco ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                App.textoInserido += "Arco";
                App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoDelta(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" ∆ ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                App.textoInserido += "∆";
                App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoSigma(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" Σ ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                App.textoInserido += "Σ";
                App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

    public static JButton BotaoModoEscuroELuz(){
        botao = new JButton();
        //botao.setFont(new Font("Ravie", 1, 18));
        botao.setForeground(new Color(0, 0, 102));
        botao.setText(" Escuro ");
        botao.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0), 3));
        botao.setRequestFocusEnabled(false);
        botao.setRolloverEnabled(true);
        botao.setMargin(new Insets(2, 1000, 2, 14));

        botao.addActionListener((ActionEvent e) -> {
                //App.textoInserido += "Escuro";
                //App.areaTexto.setText(App.textoInserido);
        });

        return botao;
    }

}
