import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class App{

    public static final short QUADRO_WIDTH = 350, QUADRO_HEIGHT = 500;

    public static JFrame quadro = new JFrame("Calculadora"); //O quadro sendo gerado aqui
    public static ImageIcon icone;
    public static DecimalFormat formatoDecimal; //Usado para formartar os valores, neste caso será formatado os valores numéricos para o português brasileiro.
    public static byte QuantidadeCasas = 14;
    public static String textoInserido = ""; //A variavel que irá armazenar o texto, que sera mostrada na area de texto
    public static Barra barra; //Anexando a variavel da classe Barra
    public static Tela1 tela1; //Anexando a variavel da classe Tela1
    public static JTextArea areaTexto = new JTextArea(3,24); //A area do texto sendo gerado aqui

    private static int mouseX, mouseY;

    public static int totalParenteses = 0;

    public static void Erro(String informacao){
        textoInserido = "";
        Calcular.identicadoresArmazenados = "";
        areaTexto.setText(informacao);
    }

    private static void DefinindoQuadro(){ //Metodo criado com o intuito de organizar a criação do quadro/tela

        quadro.setSize(QUADRO_WIDTH,QUADRO_HEIGHT); //O tamanho, em pixels, do quadro/tela é definido aqui.
        quadro.setLocationRelativeTo(null); //O quadro/tela é centralizado no meio.
        quadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Serve para que quando o usuário fechar o programa, apertando o 'X', o programa irá parar de ser executado.
        quadro.setResizable(false); //Serve para impedir do usuário redimensionar o quadro/tela.
        quadro.setLayout(null);
        quadro.setBackground(new Color(0,0,0));
        quadro.setUndecorated(true);
        //ImageIcon icone = new ImageIcon("src/imagens/icone.png"); //Salvando a imagem do ícone em uma variável.
        //quadro.setIconImage(icone.getImage()); //Anexando a imagem do ícone ao quadro.
    }

    private static void ArrastarTela()
    {
        quadro.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                mouseX = e.getX(); //Guarda a posição atual do eixo x do mouse 
                mouseY = e.getY(); //Guarda a posição atual do eixo y do mouse 
            }
        });

        quadro.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                // Calcula a diferença entre a posição atual do mouse e a posição onde foi pressionado
                int deltaX = e.getX() - mouseX; //Faz a diferença entre a antiga posição do mouse onde foi pressionado e a sua nova posição, do eixo x
                int deltaY = e.getY() - mouseY; //Faz a diferença entre a antiga posição do mouse onde foi pressionado e a sua nova posição, do eixo y

                // Obtém a posição atual do Quadro
                Point currentLocation = quadro.getLocation();

                // Define a nova posição do JFrame com base no movimento do mouse
                quadro.setLocation(currentLocation.x + deltaX, currentLocation.y + deltaY);
            }
        });
    }

    private static void DefinindoAreaTexto(){
        //Border border = BorderFactory.createLineBorder(new Color(36, 100, 161), 5); //Definindo o molde da borda da area de texto.
        //areaTexto.setBorder(border); //Anexando a borda a area de texto.
        areaTexto.setEditable(false); //Impossibilitando da area de texto ser editada com o mouse.
        areaTexto.setLineWrap(true); //Configurando uma quebra de linha, sempre quando os forem passar o limite da linha.
        areaTexto.setBackground(new Color(255, 255, 255)); //Pinta a cor do fundo da area de texto.
        areaTexto.setForeground(new Color(109, 135, 159)); //Pinta a cor do texto.
        areaTexto.setFont(new Font("Segoe", Font.BOLD, 22)); //Define a fonte do texto.
        //areaTexto.setBounds(8,8,QUADROWIDTH-24,96);
    }

    public static  void CorCalculadora(){

        Border border;

        if (Gravador.dado == true) 
        {
            //MODO ESCURO
            icone = new ImageIcon("src/imagens/iconeDark.png"); //Salvando a imagem do ícone em uma variável.
            quadro.setIconImage(icone.getImage()); //Anexando a imagem do ícone ao quadro.
            barra.imagem.setIcon(icone);

            //areaTexto.setBorder(border); //Anexando a borda a area de texto.
            tela1.painel.setBackground(new Color(0, 0, 176)); // Adicionando uma cor de fundo
            tela1.botoesExtra.botaoModoEscuroELuz.setText("Claro");
            //botoesExtra.botaoModoEscuroELuz.setForeground(new Color(0, 0, 255));

            tela1.painelAreaTexto.setVisible(false);//Se você tem amor pela sua vida, não mexa nessa linha de código.
            tela1.painelAreaTexto.setVisible(true); //Se você tem amor pela sua vida, não mexa nessa linha de código.
            areaTexto.setBackground(DesignGeral.COR_AREA_TEXTO_BACKGROUND_ESCURO); //Pinta a cor do fundo da area de texto.
            areaTexto.setForeground(DesignGeral.COR_AREA_TEXTO_FONTE_ESCURO); //Pinta a cor do texto.
            border = BorderFactory.createLineBorder(new Color(0, 0, 161), 5); //Definindo o molde da borda da area de texto.
            tela1.barraRolamento.setBorder(border);

            border = BorderFactory.createLineBorder(DesignGeral.COR_BOTAO_BORDA_ESCURO, 3);
            CorDosBotoes(DesignGeral.COR_BOTAO_BACKGROUND_ESCURO,DesignGeral.COR_BOTAO_FONTE_ESCURO,border,DesignGeral.COR_BOTAO_BACKGROUND_FECHAR_ESCURO,DesignGeral.COR_BOTAO_FONTE_BARRA_ESCURO);

            border = BorderFactory.createLineBorder(DesignGeral.COR_BORDA_JANELA_ESCURO, 5); //Definindo o molde da borda da area de texto.
            tela1.painel.setBorder(border);
            border = BorderFactory.createLineBorder(DesignGeral.COR_BORDA_JANELA_ESCURO, 3);
            barra.painel.setBorder(border);

            barra.titulo.setForeground(DesignGeral.COR_BARRA_TITULO_ESCURO);

            barra.painel.setBackground(DesignGeral.COR_BARRA_BACKGROUND_ESCURO);
        }
        else
        {
            //MODO CLARO
            icone = new ImageIcon("src/imagens/icone.png"); //Salvando a imagem do ícone em uma variável.
            quadro.setIconImage(icone.getImage()); //Anexando a imagem do ícone ao quadro.
            barra.imagem.setIcon(icone);
            
            tela1.painel.setBackground(new Color(34, 107, 176)); // Adicionando uma cor de fundo
            tela1.botoesExtra.botaoModoEscuroELuz.setText("Escuro");
            //botoesExtra.botaoModoEscuroELuz.setForeground(new Color(255, 0, 0));

            tela1.painelAreaTexto.setVisible(false);//Se você tem amor pela sua vida, não mexa nessa linha de código.
            tela1.painelAreaTexto.setVisible(true); //Se você tem amor pela sua vida, não mexa nessa linha de código.
            areaTexto.setBackground(DesignGeral.COR_AREA_TEXTO_BACKGROUND); //Pinta a cor do fundo da area de texto.
            areaTexto.setForeground(DesignGeral.COR_AREA_TEXTO_FONTE); //Pinta a cor do texto
            border = BorderFactory.createLineBorder(new Color(36, 100, 161), 5); //Definindo o molde da borda da area de texto.
            tela1.barraRolamento.setBorder(border);

            border = BorderFactory.createLineBorder(DesignGeral.COR_BOTAO_BORDA, 3);
            CorDosBotoes(DesignGeral.COR_BOTAO_BACKGROUND,DesignGeral.COR_BOTAO_FONTE,border,DesignGeral.COR_BOTAO_BACKGROUND_FECHAR,DesignGeral.COR_BOTAO_FONTE_BARRA);

            border = BorderFactory.createLineBorder(DesignGeral.COR_BORDA_JANELA, 5); //Definindo o molde da borda da area de texto.
            tela1.painel.setBorder(border);
            border = BorderFactory.createLineBorder(DesignGeral.COR_BORDA_JANELA, 3);
            barra.painel.setBorder(border);

            barra.titulo.setForeground(DesignGeral.COR_BARRA_TITULO);

            barra.painel.setBackground(DesignGeral.COR_BARRA_BACKGROUND);
        }
    }

    public static void main(String[] args){

        try { Gravador.PegarGravacao(); } catch (Exception e) { } //Pega a informação da cor da calculadora.

        DefinindoQuadro(); //Definindo as condições iniciais do quadro aqui.
        ArrastarTela(); //Possibilitando o arrastar da tela.
        DefinindoAreaTexto(); //Definindo a area de texto.

        //Formatando a string
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(new Locale("pt", "BR")); //Definindo como português brasileiro.
        simbolos.setDecimalSeparator(',');
        formatoDecimal = new DecimalFormat("#.##############", simbolos);

        barra = new Barra(); //Instanciando a classe Barra, no qual irá desenhar todos os elementos da barra.
        tela1 = new Tela1(); //Instanciando a classe Tela1, no qual irá desenhar todos os outros elementos da tela e trazendo as sua outras funcionalidades.

        CorCalculadora(); //Chamado para definir a cor da calculadora, antes de ser visível para o usuário.

        UIManager.put("Button.select", new Color(0, 0, 0, 40)); //Definindo a cor do select ao pressionar os botoes

        quadro.setVisible(true); //Torna visível o quadro.     
    }

    private static void CorDosBotoes(Color fundo, Color fonte, Border borda, Color fundoFechar, Color fonteBarra){
        tela1.botoesPadrao.botao0.setBackground(fundo); tela1.botoesPadrao.botao0.setForeground(fonte); tela1.botoesPadrao.botao0.setBorder(borda);
        tela1.botoesPadrao.botao1.setBackground(fundo); tela1.botoesPadrao.botao1.setForeground(fonte); tela1.botoesPadrao.botao1.setBorder(borda);
        tela1.botoesPadrao.botao2.setBackground(fundo); tela1.botoesPadrao.botao2.setForeground(fonte); tela1.botoesPadrao.botao2.setBorder(borda);
        tela1.botoesPadrao.botao3.setBackground(fundo); tela1.botoesPadrao.botao3.setForeground(fonte); tela1.botoesPadrao.botao3.setBorder(borda);
        tela1.botoesPadrao.botao4.setBackground(fundo); tela1.botoesPadrao.botao4.setForeground(fonte); tela1.botoesPadrao.botao4.setBorder(borda);
        tela1.botoesPadrao.botao5.setBackground(fundo); tela1.botoesPadrao.botao5.setForeground(fonte); tela1.botoesPadrao.botao5.setBorder(borda);
        tela1.botoesPadrao.botao6.setBackground(fundo); tela1.botoesPadrao.botao6.setForeground(fonte); tela1.botoesPadrao.botao6.setBorder(borda);
        tela1.botoesPadrao.botao7.setBackground(fundo); tela1.botoesPadrao.botao7.setForeground(fonte); tela1.botoesPadrao.botao7.setBorder(borda);
        tela1.botoesPadrao.botao8.setBackground(fundo); tela1.botoesPadrao.botao8.setForeground(fonte); tela1.botoesPadrao.botao8.setBorder(borda);
        tela1.botoesPadrao.botao9.setBackground(fundo); tela1.botoesPadrao.botao9.setForeground(fonte); tela1.botoesPadrao.botao9.setBorder(borda);
        tela1.botoesPadrao.botaoIgual.setBackground(fundo); tela1.botoesPadrao.botaoIgual.setForeground(fonte); tela1.botoesPadrao.botaoIgual.setBorder(borda);
        tela1.botoesPadrao.botaoApagar.setBackground(fundo); tela1.botoesPadrao.botaoApagar.setForeground(fonte); tela1.botoesPadrao.botaoApagar.setBorder(borda);
        tela1.botoesPadrao.botaoApagarTudo.setBackground(fundo); tela1.botoesPadrao.botaoApagarTudo.setForeground(fonte); tela1.botoesPadrao.botaoApagarTudo.setBorder(borda);
        tela1.botoesPadrao.botaoSubtracao.setBackground(fundo); tela1.botoesPadrao.botaoSubtracao.setForeground(fonte); tela1.botoesPadrao.botaoSubtracao.setBorder(borda);
        tela1.botoesPadrao.botaoSoma.setBackground(fundo); tela1.botoesPadrao.botaoSoma.setForeground(fonte); tela1.botoesPadrao.botaoSoma.setBorder(borda);
        tela1.botoesPadrao.botaoDivisao.setBackground(fundo); tela1.botoesPadrao.botaoDivisao.setForeground(fonte); tela1.botoesPadrao.botaoDivisao.setBorder(borda);
        tela1.botoesPadrao.botaoMultiplicacao.setBackground(fundo); tela1.botoesPadrao.botaoMultiplicacao.setForeground(fonte); tela1.botoesPadrao.botaoMultiplicacao.setBorder(borda);
        tela1.botoesPadrao.botaoPorcentagem.setBackground(fundo); tela1.botoesPadrao.botaoPorcentagem.setForeground(fonte); tela1.botoesPadrao.botaoPorcentagem.setBorder(borda);
        tela1.botoesPadrao.botaoCasas.setBackground(fundo); tela1.botoesPadrao.botaoCasas.setForeground(fonte); tela1.botoesPadrao.botaoCasas.setBorder(borda);
        tela1.botoesPadrao.botaoRaizQuadrada.setBackground(fundo); tela1.botoesPadrao.botaoRaizQuadrada.setForeground(fonte); tela1.botoesPadrao.botaoRaizQuadrada.setBorder(borda);
        tela1.botoesPadrao.botaoElevadoPotenciaDois.setBackground(fundo); tela1.botoesPadrao.botaoElevadoPotenciaDois.setForeground(fonte); tela1.botoesPadrao.botaoElevadoPotenciaDois.setBorder(borda);
        tela1.botoesPadrao.botaoUmSobreX.setBackground(fundo); tela1.botoesPadrao.botaoUmSobreX.setForeground(fonte); tela1.botoesPadrao.botaoUmSobreX.setBorder(borda);
        tela1.botoesPadrao.botaoVirgula.setBackground(fundo); tela1.botoesPadrao.botaoVirgula.setForeground(fonte); tela1.botoesPadrao.botaoVirgula.setBorder(borda);
        tela1.botoesCientifico.botaoPi.setBackground(fundo); tela1.botoesCientifico.botaoPi.setForeground(fonte); tela1.botoesCientifico.botaoPi.setBorder(borda);
        tela1.botoesCientifico.botaoEuler.setBackground(fundo); tela1.botoesCientifico.botaoEuler.setForeground(fonte); tela1.botoesCientifico.botaoEuler.setBorder(borda);
        tela1.botoesCientifico.botaoFatorial.setBackground(fundo); tela1.botoesCientifico.botaoFatorial.setForeground(fonte); tela1.botoesCientifico.botaoFatorial.setBorder(borda);
        tela1.botoesCientifico.botaoAbrindoParenteses.setBackground(fundo); tela1.botoesCientifico.botaoAbrindoParenteses.setForeground(fonte); tela1.botoesCientifico.botaoAbrindoParenteses.setBorder(borda);
        tela1.botoesCientifico.botaoFechandoParenteses.setBackground(fundo); tela1.botoesCientifico.botaoFechandoParenteses.setForeground(fonte); tela1.botoesCientifico.botaoFechandoParenteses.setBorder(borda);
        tela1.botoesCientifico.botaoEXP.setBackground(fundo); tela1.botoesCientifico.botaoEXP.setForeground(fonte); tela1.botoesCientifico.botaoEXP.setBorder(borda);
        tela1.botoesCientifico.botaoModulo.setBackground(fundo); tela1.botoesCientifico.botaoModulo.setForeground(fonte); tela1.botoesCientifico.botaoModulo.setBorder(borda);
        tela1.botoesCientifico.botaoResto.setBackground(fundo); tela1.botoesCientifico.botaoResto.setForeground(fonte); tela1.botoesCientifico.botaoResto.setBorder(borda);
        tela1.botoesCientifico.botaoXElevadoPotenciaY.setBackground(fundo); tela1.botoesCientifico.botaoXElevadoPotenciaY.setForeground(fonte); tela1.botoesCientifico.botaoXElevadoPotenciaY.setBorder(borda);
        tela1.botoesCientifico.botaoDezElevadoPotenciaX.setBackground(fundo); tela1.botoesCientifico.botaoDezElevadoPotenciaX.setForeground(fonte); tela1.botoesCientifico.botaoDezElevadoPotenciaX.setBorder(borda);
        tela1.botoesCientifico.botaoLogaritmo.setBackground(fundo); tela1.botoesCientifico.botaoLogaritmo.setForeground(fonte); tela1.botoesCientifico.botaoLogaritmo.setBorder(borda);
        tela1.botoesCientifico.botaoLogaritmoNatural.setBackground(fundo); tela1.botoesCientifico.botaoLogaritmoNatural.setForeground(fonte); tela1.botoesCientifico.botaoLogaritmoNatural.setBorder(borda);
        tela1.botoesCientifico.botaoXElevadoPotencia3.setBackground(fundo); tela1.botoesCientifico.botaoXElevadoPotencia3.setForeground(fonte); tela1.botoesCientifico.botaoXElevadoPotencia3.setBorder(borda);
        tela1.botoesCientifico.botaoRaizCubicaX.setBackground(fundo); tela1.botoesCientifico.botaoRaizCubicaX.setForeground(fonte); tela1.botoesCientifico.botaoRaizCubicaX.setBorder(borda);
        tela1.botoesCientifico.botaoRaizYX.setBackground(fundo); tela1.botoesCientifico.botaoRaizYX.setForeground(fonte); tela1.botoesCientifico.botaoRaizYX.setBorder(borda);
        tela1.botoesCientifico.botaoDoisElevadoPotenciaX.setBackground(fundo); tela1.botoesCientifico.botaoDoisElevadoPotenciaX.setForeground(fonte); tela1.botoesCientifico.botaoDoisElevadoPotenciaX.setBorder(borda);
        tela1.botoesCientifico.botaoLogYBaseX.setBackground(fundo); tela1.botoesCientifico.botaoLogYBaseX.setForeground(fonte); tela1.botoesCientifico.botaoLogYBaseX.setBorder(borda);
        tela1.botoesCientifico.botaoEElevadoPotenciaX.setBackground(fundo); tela1.botoesCientifico.botaoEElevadoPotenciaX.setForeground(fonte); tela1.botoesCientifico.botaoEElevadoPotenciaX.setBorder(borda);
        tela1.botoesExtra.botaoEM.setBackground(fundo); tela1.botoesExtra.botaoEM.setForeground(fonte); tela1.botoesExtra.botaoEM.setBorder(borda);
        tela1.botoesExtra.botaoF.setBackground(fundo); tela1.botoesExtra.botaoF.setForeground(fonte); tela1.botoesExtra.botaoF.setBorder(borda);
        tela1.botoesExtra.botaoR.setBackground(fundo); tela1.botoesExtra.botaoR.setForeground(fonte); tela1.botoesExtra.botaoR.setBorder(borda);
        tela1.botoesExtra.botaoA.setBackground(fundo); tela1.botoesExtra.botaoA.setForeground(fonte); tela1.botoesExtra.botaoA.setBorder(borda);
        tela1.botoesExtra.botaoP.setBackground(fundo); tela1.botoesExtra.botaoP.setForeground(fonte); tela1.botoesExtra.botaoP.setBorder(borda);
        tela1.botoesExtra.botaoModoEscuroELuz.setBackground(fundo); tela1.botoesExtra.botaoModoEscuroELuz.setForeground(fonte); tela1.botoesExtra.botaoModoEscuroELuz.setBorder(borda);
        barra.botaoMinimizar.setBackground(fundo); barra.botaoMinimizar.setForeground(fonteBarra); barra.botaoMinimizar.setBorder(borda);
        barra.botaoFechar.setBackground(fundoFechar); barra.botaoFechar.setForeground(fonteBarra); barra.botaoFechar.setBorder(borda);
    }
}