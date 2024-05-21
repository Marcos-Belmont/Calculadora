import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class App{

    public static JFrame quadro = new JFrame("Calculadora"); //O quadro sendo gerado aqui
    public static JTextArea areaTexto = new JTextArea(3,24); //A area do texto sendo gerado aqui
    public static DecimalFormat formatoDecimal; //Usado para formartar os valores, neste caso será formatado os valores numéricos para o português brasileiro.
    public static String textoInserido = ""; //A variavel que irá armazenar o texto, que sera mostrada na area de texto
    public static Tela1 tela1; //Anexando a variavel da classe Tela1

    private static void DefinindoQuadro(){ //Metodo criado com o intuito de organizar a criação do quadro/tela

        quadro.setSize(500,680); //O tamanho, em pixels, do quadro/tela é definido aqui.
        quadro.setLocationRelativeTo(null); //O quadro/tela é centralizado no meio.
        quadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Serve para que quando o usuário fechar o programa, apertando o 'X', o programa irá parar de ser executado.
        quadro.setResizable(false); //Serve para impedir do usuário redimensionar o quadro/tela.
        ImageIcon icone = new ImageIcon("src/imagens/icone.png"); //Salvando a imagem do ícone em uma variável.
        quadro.setIconImage(icone.getImage()); //Anexando a imagem do ícone ao quadro.

    }

    private static void DefinindoAreaTexto(){
        Border border = BorderFactory.createLineBorder(new Color(36, 100, 161), 5); //Definindo o molde da borda da area de texto.
        areaTexto.setBorder(border); //Anexando a borda a area de texto.
        areaTexto.setEditable(false); //Impossibilitando da area de texto ser editada com o mouse.
        areaTexto.setLineWrap(true); //Configurando uma quebra de linha, sempre quando os forem passar o limite da linha.
        areaTexto.setForeground(new Color(109, 135, 159)); //Pinta a cor do texto.
        areaTexto.setFont(new Font("Segoe", Font.BOLD, 22)); //Define a fonte do texto.
    }

    public static void main(String[] args){

        DefinindoQuadro(); //Definindo as condições iniciais do quadro aqui.
        DefinindoAreaTexto(); //Definindo a area de texto.

        //Formatando a string
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(new Locale("pt", "BR")); //Definindo como português brasileiro.
        simbolos.setDecimalSeparator(',');
        formatoDecimal = new DecimalFormat("#.######################################################################", simbolos);
        
        tela1 = new Tela1(); //Instanciando a classe Tela1, no qual irá desenhar todos os outros elementos da tela e trazendo as sua outras funcionalidades.

        quadro.setVisible(true); //Torna visível o quadro.

    }
}