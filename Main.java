import javax.swing.ImageIcon;
import javax.swing.JButton; //biblioteca responsavel por inserir o icone do programa
import javax.swing.JFrame; //biblioteca responsavel por inserir os botoes
import javax.swing.JPanel; //biblioteca responsavel por inserir o quadro

class Main{

    private static byte seletorPainel = 0; //Seletor do painel

    //--------------------------------------------------------------------
    //BOTOES
    private static JButton[] botaoPrimary = {new JButton("0"),new JButton("1"),new JButton("2"),new JButton("3"),new JButton("4"),new JButton("5"),
    new JButton("6"),new JButton("7"),new JButton("8"),new JButton("9"),new JButton("<="),new JButton("=")};
    //--------------------------------------------------------------------

    private static JFrame quadro; //Quadro
    private static JPanel painel; //Painel

    private static void DefinindoQuadro(){ //Metodo criado com o intuito de organizar a criação do quadro/tela

        quadro = new JFrame(); //O quadro/tela ele é intanciado/criado aqui.
        quadro.setSize(600,800); //O tamanho, em pixels, do quadro/tela é definido aqui.
        quadro.setLocationRelativeTo(null); //O quadro/tela é centralizado no meio.
        quadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Serve para que quando o usuário fechar o programa, apertando o 'X', o programa irá parar de ser executado.
        quadro.setResizable(false); //Serve para impedir do usuário redimensionar o quadro/tela.
        quadro.setTitle("Calculadora"); //Definindo o titulo do quadro.
        ImageIcon icone = new ImageIcon("imagens/icone.png"); //Salvando a imagem do ícone em uma variável.
        quadro.setIconImage(icone.getImage()); //Anexando a imagem do ícone ao quadro.
        quadro.setVisible(true); //Torna visível o quadro.

    }

    private static void DefinindoPanel(){

        painel = new JPanel(); //Instanciando o painel
        
        for(byte i = 0; i < botaoPrimary.length; i++){
            //botaoPrimary[0].setPreferredSize(new Dimension(10, 10));
            painel.add(botaoPrimary[i]);
        }
        
        switch(seletorPainel){
            case 0:

                break;
            case 1:

                break;
        }

        quadro.add(painel);
    }

    public static void main(String[] args){
        DefinindoQuadro(); //Definindo as condições iniciais do quadro aqui.
        DefinindoPanel(); //Definindo o painel
    }
}