import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

public class Tela1 extends JFrame {

    // Gerando um painel
    JPanel painelAreaTexto = new JPanel(), painel = new JPanel(); 

    //Gerando a barra de rolamento
    JScrollPane barraRolamento = new JScrollPane(App.areaTexto, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

    //Instaciando a classe dos Botões
    BotoesPadrao botoesPadrao = new BotoesPadrao();
    BotoesCientifico botoesCientifico = new BotoesCientifico();
    BotoesExtra botoesExtra = new BotoesExtra();

    public Tela1() {
        InicializarPainel();
        AdicionarComponentesPainel();
    }

    private void InicializarPainel() {
        //Apagando o layout do painel
        painelAreaTexto.setLayout(null);
        painel.setLayout(null); 

        //Definindo o tamanho do painel
        painel.setBounds(0, 40, App.QUADRO_WIDTH, App.QUADRO_HEIGHT-40);
        painelAreaTexto.setBounds(DesignGeral.PAT_X,DesignGeral.PAT_Y,DesignGeral.PAT_WIDTH,DesignGeral.PAT_HEIGHT);

        // Adicionando o painel ao quadro
        App.quadro.add(painelAreaTexto);
        App.quadro.add(painel);
    }

    private void AdicionarComponentesPainel() {
        
        //Area de Texto
        barraRolamento.setBounds(0,0,DesignGeral.PAT_WIDTH,DesignGeral.PAT_HEIGHT);
        painelAreaTexto.add(barraRolamento);

        //Adicionando bordas
        Border border = BorderFactory.createLineBorder(new Color(36, 100, 161), 5); //Definindo o molde da borda da area de texto.
        barraRolamento.setBorder(border);
        painel.setBorder(border);
        
        // Adicionando os botoes ao painel
        painel.add(botoesPadrao.Botao0(                         (short)(App.QUADRO_WIDTH-172),(short)(App.QUADRO_HEIGHT-116),(short)50,(short)30                           ));//feito
        painel.add(botoesPadrao.Botao1(                         (short)(App.QUADRO_WIDTH-228),(short)(App.QUADRO_HEIGHT-152),(short)50,(short)30                           ));//feito
        painel.add(botoesPadrao.Botao2(                         (short)(App.QUADRO_WIDTH-172),(short)(App.QUADRO_HEIGHT-152),(short)50,(short)30                           ));//feito
        painel.add(botoesPadrao.Botao3(                         (short)(App.QUADRO_WIDTH-116),(short)(App.QUADRO_HEIGHT-152),(short)50,(short)30                           ));//feito
        painel.add(botoesPadrao.Botao4(                         (short)(App.QUADRO_WIDTH-228),(short)(App.QUADRO_HEIGHT-188),(short)50,(short)30                           ));//feito
        painel.add(botoesPadrao.Botao5(                         (short)(App.QUADRO_WIDTH-172),(short)(App.QUADRO_HEIGHT-188),(short)50,(short)30                           ));//feito
        painel.add(botoesPadrao.Botao6(                         (short)(App.QUADRO_WIDTH-116),(short)(App.QUADRO_HEIGHT-188),(short)50,(short)30                            ));//feito
        painel.add(botoesPadrao.Botao7(                         (short)(App.QUADRO_WIDTH-228),(short)(App.QUADRO_HEIGHT-224),(short)50,(short)30                           ));//feito
        painel.add(botoesPadrao.Botao8(                         (short)(App.QUADRO_WIDTH-172),(short)(App.QUADRO_HEIGHT-224),(short)50,(short)30                           ));//feito
        painel.add(botoesPadrao.Botao9(                         (short)(App.QUADRO_WIDTH-116),(short)(App.QUADRO_HEIGHT-224),(short)50,(short)30                           ));//feito
        painel.add(botoesPadrao.BotaoIgual(                     (short)(App.QUADRO_WIDTH-60),(short)(App.QUADRO_HEIGHT-116),(short)50,(short)30                            ));//feito
        painel.add(botoesPadrao.BotaoApagar(                    (short)(App.QUADRO_WIDTH-172),(short)(App.QUADRO_HEIGHT-384),(short)162,(short)30                            ));//feito
        painel.add(botoesPadrao.BotaoApagarTudo(                (short)(App.QUADRO_WIDTH-340),(short)(App.QUADRO_HEIGHT-384),(short)162,(short)30                           ));//feito
        painel.add(botoesPadrao.BotaoSubtracao(                 (short)(App.QUADRO_WIDTH-60),(short)(App.QUADRO_HEIGHT-188),(short)50,(short)30                            ));//feito
        painel.add(botoesPadrao.BotaoSoma(                      (short)(App.QUADRO_WIDTH-60),(short)(App.QUADRO_HEIGHT-152),(short)50,(short)30                           ));//feito
        painel.add(botoesPadrao.BotaoDivisao(                   (short)(App.QUADRO_WIDTH-60),(short)(App.QUADRO_HEIGHT-260),(short)50,(short)30                           ));//feito
        painel.add(botoesPadrao.BotaoMultiplicacao(             (short)(App.QUADRO_WIDTH-60),(short)(App.QUADRO_HEIGHT-224),(short)50,(short)30                          ));//feito
        painel.add(botoesPadrao.BotaoPorcentagem(               (short)(App.QUADRO_WIDTH-60),(short)(App.QUADRO_HEIGHT-332),(short)50,(short)30                           ));//feito
        painel.add(botoesPadrao.BotaoCasas(                     (short)(App.QUADRO_WIDTH-228),(short)(App.QUADRO_HEIGHT-116),(short)50,(short)30                         ));//feito
        painel.add(botoesPadrao.BotaoRaizQuadrada(              (short)(App.QUADRO_WIDTH-284),(short)(App.QUADRO_HEIGHT-260),(short)50,(short)30                          ));//feito
        painel.add(botoesPadrao.BotaoElevadoPotenciaDois(       (short)(App.QUADRO_WIDTH-284),(short)(App.QUADRO_HEIGHT-296),(short)50,(short)30                          ));//feito
        painel.add(botoesPadrao.BotaoUmSobreX(                  (short)(App.QUADRO_WIDTH-228),(short)(App.QUADRO_HEIGHT-296),(short)50,(short)30                          ));//feito
        painel.add(botoesPadrao.BotaoVirgula(                   (short)(App.QUADRO_WIDTH-116),(short)(App.QUADRO_HEIGHT-116),(short)50,(short)30                         ));//feito
        painel.add(botoesCientifico.BotaoPi(                    (short)(App.QUADRO_WIDTH-284),(short)(App.QUADRO_HEIGHT-80),(short)50,(short)30                          ));//feito
        painel.add(botoesCientifico.BotaoEuler(                 (short)(App.QUADRO_WIDTH-340),(short)(App.QUADRO_HEIGHT-80),(short)50,(short)30                         ));//feito
        painel.add(botoesCientifico.BotaoFatorial(              (short)(App.QUADRO_WIDTH-116),(short)(App.QUADRO_HEIGHT-260),(short)50,(short)30                        ));//feito
        painel.add(botoesCientifico.BotaoAbrindoParenteses(     (short)(App.QUADRO_WIDTH-228),(short)(App.QUADRO_HEIGHT-260),(short)50,(short)30                        ));//feito
        painel.add(botoesCientifico.BotaoFechandoParenteses(    (short)(App.QUADRO_WIDTH-172),(short)(App.QUADRO_HEIGHT-260),(short)50,(short)30                        ));//feito
        painel.add(botoesCientifico.BotaoEXP(                   (short)(App.QUADRO_WIDTH-116),(short)(App.QUADRO_HEIGHT-296),(short)50,(short)30                        ));//feito
        painel.add(botoesCientifico.BotaoModulo(                (short)(App.QUADRO_WIDTH-172),(short)(App.QUADRO_HEIGHT-296),(short)50,(short)30                         ));//feito
        painel.add(botoesCientifico.BotaoResto(                 (short)(App.QUADRO_WIDTH-60),(short)(App.QUADRO_HEIGHT-296),(short)50,(short)30                           ));//feito
        painel.add(botoesCientifico.BotaoXElevadoPotenciaY(     (short)(App.QUADRO_WIDTH-284),(short)(App.QUADRO_HEIGHT-224),(short)50,(short)30                            ));//feito
        painel.add(botoesCientifico.BotaoDezElevadoPotenciaX(   (short)(App.QUADRO_WIDTH-284),(short)(App.QUADRO_HEIGHT-188),(short)50,(short)30                            ));//feito
        painel.add(botoesCientifico.BotaoLogaritmo(             (short)(App.QUADRO_WIDTH-284),(short)(App.QUADRO_HEIGHT-152),(short)50,(short)30                          ));//feito
        painel.add(botoesCientifico.BotaoLogaritmoNatural(      (short)(App.QUADRO_WIDTH-284),(short)(App.QUADRO_HEIGHT-116),(short)50,(short)30                        ));//feito
        painel.add(botoesCientifico.BotaoXElevadoPotencia3(     (short)(App.QUADRO_WIDTH-340),(short)(App.QUADRO_HEIGHT-296),(short)50,(short)30                         ));//feito
        painel.add(botoesCientifico.BotaoRaizCubicaX(           (short)(App.QUADRO_WIDTH-340),(short)(App.QUADRO_HEIGHT-260),(short)50,(short)30                        ));//feito
        painel.add(botoesCientifico.BotaoRaizYX(                (short)(App.QUADRO_WIDTH-340),(short)(App.QUADRO_HEIGHT-224),(short)50,(short)30                         ));//feito
        painel.add(botoesCientifico.BotaoDoisElevadoPotenciaX(  (short)(App.QUADRO_WIDTH-340),(short)(App.QUADRO_HEIGHT-188),(short)50,(short)30                        ));//feito
        painel.add(botoesCientifico.BotaoLogYBaseX(             (short)(App.QUADRO_WIDTH-340),(short)(App.QUADRO_HEIGHT-152),(short)50,(short)30                       ));//feito
        painel.add(botoesCientifico.BotaoEElevadoPotenciaX(     (short)(App.QUADRO_WIDTH-340),(short)(App.QUADRO_HEIGHT-116),(short)50,(short)30                       ));//feito
        painel.add(botoesExtra.BotaoEM(                  (short)(App.QUADRO_WIDTH-340),(short)(App.QUADRO_HEIGHT-332),(short)50,(short)30                       ));//feito
        painel.add(botoesExtra.BotaoF(                      (short)(App.QUADRO_WIDTH-172),(short)(App.QUADRO_HEIGHT-332),(short)50,(short)30                       ));//feito
        painel.add(botoesExtra.BotaoR(                       (short)(App.QUADRO_WIDTH-228),(short)(App.QUADRO_HEIGHT-332),(short)50,(short)30                       ));//feito
        painel.add(botoesExtra.BotaoA(                      (short)(App.QUADRO_WIDTH-116),(short)(App.QUADRO_HEIGHT-332),(short)50,(short)30                       ));//feito
        painel.add(botoesExtra.BotaoP(                       (short)(App.QUADRO_WIDTH-284),(short)(App.QUADRO_HEIGHT-332),(short)50,(short)30                       ));//feito
        painel.add(botoesExtra.BotaoModoEscuroELuz(             (short)(122), (short)(App.QUADRO_HEIGHT-80),(short)(App.QUADRO_WIDTH-132), (short)30             ));//feito
    }
}