import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tela1 extends JFrame{
    
    JPanel painel = new JPanel(); //Gerando um painel

    public Tela1(){

        //Area de Texto
        painel.add(App.areaTexto);
        
        //Adicionando os botoes
        painel.add(BotoesPadrao.Botao0());
        painel.add(BotoesPadrao.Botao1());
        painel.add(BotoesPadrao.Botao2());
        painel.add(BotoesPadrao.Botao3());
        painel.add(BotoesPadrao.Botao4());    
        painel.add(BotoesPadrao.Botao5());
        painel.add(BotoesPadrao.Botao6());
        painel.add(BotoesPadrao.Botao7());
        painel.add(BotoesPadrao.Botao8());
        painel.add(BotoesPadrao.Botao9());
        painel.add(BotoesPadrao.BotaoIgual());
        painel.add(BotoesPadrao.BotaoApagar());
        painel.add(BotoesPadrao.BotaoApagarTudo());
        painel.add(BotoesPadrao.BotaoSubtracao());
        painel.add(BotoesPadrao.BotaoSoma());
        painel.add(BotoesPadrao.BotaoDivisao());
        painel.add(BotoesPadrao.BotaoMultiplicacao());

        //Adicionando uma cor de fundo
        painel.setBackground(new Color(34, 107, 176));
        
        //Adicionando o painel ao quadro
        App.quadro.add(painel);
    }

}