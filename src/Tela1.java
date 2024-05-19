import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Tela1 extends JFrame{
    
    JPanel painel = new JPanel();

    public Tela1(){

        Border border = BorderFactory.createLineBorder(Color.BLACK, 5);
        App.areaTexto.setBorder(border);
        painel.add(App.areaTexto);
        
        painel.add(Botoes.Botao0());
        painel.add(Botoes.Botao1());
        painel.add(Botoes.Botao2());
        painel.add(Botoes.Botao3());
        painel.add(Botoes.Botao4());
        painel.add(Botoes.Botao5());
        painel.add(Botoes.Botao6());
        painel.add(Botoes.Botao7());
        painel.add(Botoes.Botao8());
        painel.add(Botoes.Botao9());
        painel.add(Botoes.BotaoIgual());
        painel.add(Botoes.BotaoApagar());

        painel.setBackground(new Color(34, 107, 176));
        
        App.quadro.add(painel);
    }

}