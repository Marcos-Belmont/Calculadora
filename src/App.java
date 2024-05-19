import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class App{

    public static JFrame quadro = new JFrame("Calculadora");
    public static JTextArea areaTexto = new JTextArea(2,42);
    public static Tela1 tela1;

    private static void DefinindoQuadro(){ //Metodo criado com o intuito de organizar a criação do quadro/tela

        //quadro  //O quadro/tela ele é intanciado/criado aqui.
        quadro.setSize(500,700); //O tamanho, em pixels, do quadro/tela é definido aqui.
        quadro.setLocationRelativeTo(null); //O quadro/tela é centralizado no meio.
        quadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Serve para que quando o usuário fechar o programa, apertando o 'X', o programa irá parar de ser executado.
        quadro.setResizable(false); //Serve para impedir do usuário redimensionar o quadro/tela.
        ImageIcon icone = new ImageIcon("src/imagens/icone.png"); //Salvando a imagem do ícone em uma variável.
        quadro.setIconImage(icone.getImage()); //Anexando a imagem do ícone ao quadro.

    }

    private static void DefinindoAreaTexto(){
        areaTexto.setLineWrap(true);
    }

    public static void main(String[] args){

        DefinindoQuadro(); //Definindo as condições iniciais do quadro aqui.
        DefinindoAreaTexto(); //Definindo as limitações da area de texto

        tela1 = new Tela1();

        quadro.setVisible(true); //Torna visível o quadro.
    }
}