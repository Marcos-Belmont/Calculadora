import java.awt.Font;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.JButton;

public class BotoesExtra {

    public JButton botaoEM, botaoR, botaoF, botaoA, botaoP, botaoCasas, botaoModoEscuroELuz; //botoes que serao aplicados.

    //Euler-Mascheroni (γ) 0.57721566490153
    //Constante de Feigenbaum (δ) 4.66920160910299
    //Constante de Ramanujan-Soldner (μ) 0.37250741078136
    //constante de phi (φ) 1.61803398874989
    //Constante de Apéry (G) 0.91596559417721

    public JButton BotaoEM(short x, short y, short width, short height){
        botaoEM = new JButton();
        botaoEM.setFont(new Font("Look and Feel", 1, 18));
        botaoEM.setText("γ");
        botaoEM.setRequestFocusEnabled(false);
        botaoEM.setFocusable(false);
        botaoEM.setBounds(x, y,width, height);

        botaoEM.addActionListener((ActionEvent e) -> {
                for (byte i = 0; i < App.formatoDecimal.format(0.57721566490153).length(); i++) {
                    Calcular.identicadoresArmazenados += App.formatoDecimal.format(0.57721566490153).substring(i,i+1)+"$";
                }
                App.textoInserido += App.formatoDecimal.format(0.57721566490153);
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoEM;
    }

    public JButton BotaoF(short x, short y, short width, short height){
        botaoF = new JButton();
        botaoF.setFont(new Font("Look and Feel", 1, 24));
        botaoF.setText("δ");
        botaoF.setRequestFocusEnabled(false);
        botaoF.setFocusable(false);
        botaoF.setBounds(x, y,width, height);

        botaoF.addActionListener((ActionEvent e) -> {
                for (byte i = 0; i < App.formatoDecimal.format(4.66920160910299).length(); i++) {
                    Calcular.identicadoresArmazenados += App.formatoDecimal.format(4.66920160910299).substring(i,i+1)+"$";
                }
                App.textoInserido += App.formatoDecimal.format(4.66920160910299);
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoF;
    }

    public JButton BotaoR(short x, short y, short width, short height){
        botaoR = new JButton();
        botaoR.setFont(new Font("Look and Feel", 1, 20));
        botaoR.setText("μ");
        botaoR.setRequestFocusEnabled(false);
        botaoR.setFocusable(false);
        botaoR.setBounds(x, y,width, height);

        botaoR.addActionListener((ActionEvent e) -> {
                for (byte i = 0; i < App.formatoDecimal.format(0.37250741078136).length(); i++) {
                    Calcular.identicadoresArmazenados += App.formatoDecimal.format(0.37250741078136).substring(i,i+1)+"$";
                }
                App.textoInserido += App.formatoDecimal.format(0.37250741078136);
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoR;
    }

    public JButton BotaoA(short x, short y, short width, short height){
        botaoA = new JButton();
        botaoA.setFont(new Font("Look and Feel", 1, 24));
        botaoA.setText("G");
        botaoA.setRequestFocusEnabled(false);
        botaoA.setFocusable(false);
        botaoA.setBounds(x, y,width, height);

        botaoA.addActionListener((ActionEvent e) -> {
                for (byte i = 0; i < App.formatoDecimal.format(0.91596559417721).length(); i++) {
                    Calcular.identicadoresArmazenados += App.formatoDecimal.format(0.91596559417721).substring(i,i+1)+"$";
                }
                App.textoInserido += App.formatoDecimal.format(0.91596559417721);
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoA;
    }

    public JButton BotaoP(short x, short y, short width, short height){
        botaoP = new JButton();
        botaoP.setFont(new Font("Look and Feel", 1, 20));
        botaoP.setText("φ");
        botaoP.setRequestFocusEnabled(false);
        botaoP.setFocusable(false);
        botaoP.setBounds(x, y,width, height);

        botaoP.addActionListener((ActionEvent e) -> {
                for (byte i = 0; i < App.formatoDecimal.format(1.61803398874989).length(); i++) {
                    Calcular.identicadoresArmazenados += App.formatoDecimal.format(1.61803398874989).substring(i,i+1)+"$";
                }
                App.textoInserido += App.formatoDecimal.format(1.61803398874989);
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoP;
    }

    public JButton BotaoCasas(short x, short y, short width, short height){
        botaoCasas = new JButton();
        botaoCasas.setFont(new Font("Look and Feel", 1, 16));
        botaoCasas.setText("14I14");
        botaoCasas.setRequestFocusEnabled(false);
        botaoCasas.setFocusable(false);
        botaoCasas.setBounds(x, y,width, height);

        botaoCasas.addActionListener((ActionEvent e) -> {

            DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.FRANCE);
            simbolos.setDecimalSeparator(',');

            App.QuantidadeCasas++;
            if (App.QuantidadeCasas > 14) {
                App.QuantidadeCasas = 0;
                App.formatoDecimal = new DecimalFormat("#", simbolos);
            }
            else{

                String casas = "";

                for (int i = 0; i < App.QuantidadeCasas; i++) {
                    casas += "#";
                }

                App.formatoDecimal = new DecimalFormat("#."+casas, simbolos);
            }

            if (App.QuantidadeCasas < 10) {
                botaoCasas.setText("0"+App.QuantidadeCasas+"I14");
            }else{
                botaoCasas.setText(App.QuantidadeCasas+"I14");
            }

        });

        return botaoCasas;
    }
    

    public JButton BotaoModoEscuroELuz(short x, short y, short width, short height){
        botaoModoEscuroELuz = new JButton();
        botaoModoEscuroELuz.setFont(new Font("Look and Feel", 1, 24));
        botaoModoEscuroELuz.setText("Escuro");
        botaoModoEscuroELuz.setRequestFocusEnabled(false);
        botaoModoEscuroELuz.setFocusable(false);
        botaoModoEscuroELuz.setBounds(x, y,width, height);

        botaoModoEscuroELuz.addActionListener((ActionEvent e) -> {
            Gravador.Gravar();
        });

        return botaoModoEscuroELuz;
    }
}
