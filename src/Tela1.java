import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tela1 extends JFrame {
    
    // Gerando um painel
    JPanel painel = new JPanel(); 

    public Tela1() {
        initializePanel();
        addComponentsToPanel();
    }

    private void initializePanel() {
        // Adicionando uma cor de fundo
        painel.setBackground(new Color(34, 107, 176));

        // Adicionando o painel ao quadro
        App.quadro.add(painel);
    }

    private void addComponentsToPanel() {
        // Area de Texto
        painel.add(App.areaTexto);

        // Adicionando os botoes ao painel
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
        painel.add(BotoesPadrao.BotaoPorcentagem());
        painel.add(BotoesPadrao.BotaoSinal());
        painel.add(BotoesPadrao.BotaoRaizQuadrada());
        painel.add(BotoesPadrao.BotaoElevadoPotenciaDois());
        painel.add(BotoesPadrao.BotaoUmSobreX());
        painel.add(BotoesPadrao.BotaoVirgula());
        painel.add(BotoesCientifico.BotaoPi());
        painel.add(BotoesCientifico.BotaoEuler());
        painel.add(BotoesCientifico.BotaoFatorial());
        painel.add(BotoesCientifico.BotaoAbrindoParenteses());
        painel.add(BotoesCientifico.BotaoFechandoParenteses());
        painel.add(BotoesCientifico.BotaoEXP());
        painel.add(BotoesCientifico.BotaoModulo());
        painel.add(BotoesCientifico.BotaoResto());
        painel.add(BotoesCientifico.BotaoXElevadoPotenciaY());
        painel.add(BotoesCientifico.BotaoDezElevadoPotenciaX());
        painel.add(BotoesCientifico.BotaoLogaritmo());
        painel.add(BotoesCientifico.BotaoLogaritmoNatural());
        painel.add(BotoesCientifico.BotaoXElevadoPotencia3());
        painel.add(BotoesCientifico.BotaoRaizCubicaX());
        painel.add(BotoesCientifico.BotaoRaizYX());
        painel.add(BotoesCientifico.BotaoDoisElevadoPotenciaX());
        painel.add(BotoesCientifico.BotaoLogYBaseX());
        painel.add(BotoesCientifico.BotaoEElevadoPotenciaX());
        painel.add(BotoesExtra.BotaoGradiente());
        painel.add(BotoesExtra.BotaoArco());
        painel.add(BotoesExtra.BotaoDelta());
        painel.add(BotoesExtra.BotaoSigma());
        painel.add(BotoesExtra.BotaoModoEscuroELuz());
    }
}