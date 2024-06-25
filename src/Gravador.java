import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Gravador {

    private static final String NOMEDOARQUIVO = "src/armazenamento/calculadora_cor.txt"; //constante do diretório do arquivo.
    public static boolean dado = false;

    public static void PegarGravacao(){
        BufferedReader leitor;
        boolean conteudo;
        try {
            // Lendo o conteúdo do arquivo
            leitor = new BufferedReader(new FileReader(NOMEDOARQUIVO));
            conteudo = leitor.readLine().equals("1");
            leitor.close();
        } catch (IOException e) {
            conteudo = false;
        }
        dado = conteudo;
    }

    public static void Gravar()
    {
        BufferedWriter escritor;

        try {
            // Cria um BufferedWriter para escrever texto de forma mais eficiente
            escritor = new BufferedWriter(new FileWriter(NOMEDOARQUIVO,false));

            // Escreve o texto no arquivo
            escritor.write(dado ? '0' : '1');
            dado = !dado;

            // Fecha o BufferedWriter (isso também fecha o FileWriter)
            escritor.close();

            //Aplica a cor gravada
            App.CorCalculadora();

        } catch (IOException e) { }

    }
}
