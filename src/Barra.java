import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.border.Border;

public class Barra {

    JPanel painel = new JPanel(); //Gerando um painel.
    JLabel titulo = new JLabel(), imagem = new JLabel(); //Gerando os letreiros.

    public JButton botaoMinimizar,botaoFechar; //Botoes que serao aplicados.

    public Barra()
    {
        //Definindo o Layout como nulo
        painel.setLayout(null);

        //Personalizando o painel
        painel.setBackground(DesignGeral.COR_BARRA_BACKGROUND);
        painel.setBounds(0, 0, App.QUADRO_WIDTH, 40);
        Border border = BorderFactory.createLineBorder(new Color(36, 100, 161), 3); //Definindo o molde da borda da area de texto.
        painel.setBorder(border); //Anexando a borda a area de texto.

        //Adicionando o titulo ao painel
        titulo.setText("Calculadora");
        titulo.setFont(new Font("Look and Feel", 1, 24));
        titulo.setBounds(34, 8, 200, 24);
        titulo.setForeground(DesignGeral.COR_BARRA_TITULO);
        painel.add(titulo);

        //Adicionando a imagem ao painel
        imagem.setBounds(2, 4, 32, 32);
        painel.add(imagem);

        //Adicionando os botoes ao painel
        painel.add(BotaoMinimizar((short)(App.QUADRO_WIDTH-105), (short)5,(short)50, (short)30));
        painel.add(BotaoFechar((short)(App.QUADRO_WIDTH-55), (short)5,(short)50, (short)30));

        //Adicionando o painel ao quadro
        App.quadro.add(painel);
    }

    private JButton BotaoMinimizar(short x, short y, short width, short height){
        botaoMinimizar = new JButton();
        botaoMinimizar.setFont(new Font("Look and Feel", 1, 24));
        botaoMinimizar.setForeground(new Color(255, 255, 255));
        botaoMinimizar.setText("-");
        botaoMinimizar.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoMinimizar.setRequestFocusEnabled(false);
        botaoMinimizar.setFocusable(false);
        //botaoMinimizar.setRolloverEnabled(true);
        //botaoMinimizar.setMargin(new Insets(2, 1000, 2, 14));
        botaoMinimizar.setBackground(new Color(59, 125, 187));
        botaoMinimizar.setBounds(x, y,width, height);

        botaoMinimizar.addActionListener((ActionEvent e) -> {
                App.quadro.setExtendedState(JFrame.ICONIFIED);
        });

        return botaoMinimizar;
    }
    
    private JButton BotaoFechar(short x, short y, short width, short height){
        botaoFechar = new JButton();
        botaoFechar.setFont(new Font("Look and Feel", 1, 24));
        botaoFechar.setForeground(new Color(255, 255, 255));
        botaoFechar.setText("X");
        botaoFechar.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoFechar.setRequestFocusEnabled(false);
        botaoFechar.setFocusable(false);
        //botaoMinimizar.setRolloverEnabled(true);
        //botaoMinimizar.setMargin(new Insets(2, 1000, 2, 14));
        botaoFechar.setBackground(new Color(200, 0, 0));
        botaoFechar.setBounds(x, y, width, height);

        botaoFechar.addActionListener((ActionEvent e) -> {
                System.exit(1);
        });

        return botaoFechar;
    }
}
