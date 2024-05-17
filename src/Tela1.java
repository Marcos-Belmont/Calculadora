import javax.swing.*;

public class Tela1 extends JFrame{
    
    JPanel painel = new JPanel();
    

    public Tela1(){
        
        painel.add(Botoes.Botao0());
        
        App.quadro.add(painel);
    }

}