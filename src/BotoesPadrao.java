import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.*;

public class BotoesPadrao {

    public JButton botao0,botao1,botao2,botao3,botao4,botao5,botao6,botao7,botao8,botao9,botaoIgual,botaoApagar,botaoApagarTudo,botaoSubtracao,botaoSoma,botaoDivisao,
    botaoMultiplicacao,botaoPorcentagem,botaoCasas,botaoRaizQuadrada,botaoElevadoPotenciaDois,botaoUmSobreX,botaoVirgula; //botoes que serao aplicados.

    public JButton Botao0(short x, short y, short width, short height){
        botao0 = new JButton();
        botao0.setFont(new Font("Look and Feel", 1, 24));
        botao0.setForeground(new Color(0, 0, 102));
        botao0.setText("0");
        botao0.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botao0.setRequestFocusEnabled(false);
        botao0.setFocusable(false);
        //botao0.setRolloverEnabled(true);
        //botao0.setMargin(new Insets(2, 1000, 2, 14));
        botao0.setBackground(new Color(59, 125, 187));
        botao0.setBounds(x, y,width, height);

        botao0.addActionListener((ActionEvent e) -> {
                Calcular.identicadoresArmazenados += "0$";
                App.textoInserido += "0";
                App.areaTexto.setText(App.textoInserido);
        });

        return botao0;
    }

    public JButton Botao1(short x, short y, short width, short height){
        botao1 = new JButton();
        botao1.setFont(new Font("Look and Feel", 1, 24));
        botao1.setForeground(new Color(0, 0, 102));
        botao1.setText("1");
        botao1.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botao1.setRequestFocusEnabled(false);
        botao1.setFocusable(false);
        //botao1.setRolloverEnabled(true);
        //botao1.setMargin(new Insets(2, 1000, 2, 14));
        botao1.setBackground(new Color(59, 125, 187));
        botao1.setBounds(x, y,width, height);

        botao1.addActionListener((ActionEvent e) -> {
            Calcular.identicadoresArmazenados += "1$";
            App.textoInserido += "1";
            App.areaTexto.setText(App.textoInserido);
        });

        return botao1;
    }

    public JButton Botao2(short x, short y, short width, short height){
        botao2 = new JButton();
        botao2.setFont(new Font("Look and Feel", 1, 24));
        botao2.setForeground(new Color(0, 0, 102));
        botao2.setText("2");
        botao2.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botao2.setRequestFocusEnabled(false);
        botao2.setFocusable(false);
        //botao2.setRolloverEnabled(true);
        //botao2.setMargin(new Insets(2, 1000, 2, 14));
        botao2.setBackground(new Color(59, 125, 187));
        botao2.setBounds(x, y,width, height);

        botao2.addActionListener((ActionEvent e) -> {
            Calcular.identicadoresArmazenados += "2$";
            App.textoInserido += "2";
            App.areaTexto.setText(App.textoInserido);
        });
        return botao2;
    }

    public JButton Botao3(short x, short y, short width, short height){
        botao3 = new JButton();
        botao3.setFont(new Font("Look and Feel", 1, 24));
        botao3.setForeground(new Color(0, 0, 102));
        botao3.setText("3");
        botao3.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botao3.setRequestFocusEnabled(false);
        botao3.setFocusable(false);
        //botao3.setRolloverEnabled(true);
        //botao3.setMargin(new Insets(2, 1000, 2, 14));
        botao3.setBackground(new Color(59, 125, 187));
        botao3.setBounds(x, y,width, height);

        botao3.addActionListener((ActionEvent e) -> {
            Calcular.identicadoresArmazenados += "3$";
            App.textoInserido += "3";
            App.areaTexto.setText(App.textoInserido);
        });
        return botao3;
    }

    public JButton Botao4(short x, short y, short width, short height){
        botao4 = new JButton();
        botao4.setFont(new Font("Look and Feel", 1, 24));
        botao4.setForeground(new Color(0, 0, 102));
        botao4.setText("4");
        botao4.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botao4.setRequestFocusEnabled(false);
        botao4.setFocusable(false);
        //botao4.setRolloverEnabled(true);
        //botao4.setMargin(new Insets(2, 1000, 2, 14));
        botao4.setBackground(new Color(59, 125, 187));
        botao4.setBounds(x, y,width, height);

        botao4.addActionListener((ActionEvent e) -> {
            Calcular.identicadoresArmazenados += "4$";
            App.textoInserido += "4";
            App.areaTexto.setText(App.textoInserido);
        });
        return botao4;
    }

    public JButton Botao5(short x, short y, short width, short height){
        botao5 = new JButton();
        botao5.setFont(new Font("Look and Feel", 1, 24));
        botao5.setForeground(new Color(0, 0, 102));
        botao5.setText("5");
        botao5.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botao5.setRequestFocusEnabled(false);
        botao5.setFocusable(false);
        //botao5.setRolloverEnabled(true);
        //botao5.setMargin(new Insets(2, 1000, 2, 14));
        botao5.setBackground(new Color(59, 125, 187));
        botao5.setBounds(x, y,width, height);

        botao5.addActionListener((ActionEvent e) -> {
            Calcular.identicadoresArmazenados += "5$";
            App.textoInserido += "5";
            App.areaTexto.setText(App.textoInserido);
        });
        return botao5;
    }

    public JButton Botao6(short x, short y, short width, short height){
        botao6 = new JButton();
        botao6.setFont(new Font("Look and Feel", 1, 24));
        botao6.setForeground(new Color(0, 0, 102));
        botao6.setText("6");
        botao6.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botao6.setRequestFocusEnabled(false);
        botao6.setFocusable(false);
        //botao6.setRolloverEnabled(true);
        //botao6.setMargin(new Insets(2, 1000, 2, 14));
        botao6.setBackground(new Color(59, 125, 187));
        botao6.setBounds(x, y,width, height);

        botao6.addActionListener((ActionEvent e) -> {
            Calcular.identicadoresArmazenados += "6$";
            App.textoInserido += "6";
            App.areaTexto.setText(App.textoInserido);
        });
        return botao6;
    }

    public JButton Botao7(short x, short y, short width, short height){
        botao7 = new JButton();
        botao7.setFont(new Font("Look and Feel", 1, 24));
        botao7.setForeground(new Color(0, 0, 102));
        botao7.setText("7");
        botao7.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botao7.setRequestFocusEnabled(false);
        botao7.setFocusable(false);
        //botao7.setRolloverEnabled(true);
        //botao7.setMargin(new Insets(2, 1000, 2, 14));
        botao7.setBackground(new Color(59, 125, 187));
        botao7.setBounds(x, y,width, height);

        botao7.addActionListener((ActionEvent e) -> {
            Calcular.identicadoresArmazenados += "7$";
            App.textoInserido += "7";
            App.areaTexto.setText(App.textoInserido);
        });
        return botao7;
    }

    public JButton Botao8(short x, short y, short width, short height){
        botao8 = new JButton();
        botao8.setFont(new Font("Look and Feel", 1, 24));
        botao8.setForeground(new Color(0, 0, 102));
        botao8.setText("8");
        botao8.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botao8.setRequestFocusEnabled(false);
        botao8.setFocusable(false);
        //botao8.setRolloverEnabled(true);
        //botao8.setMargin(new Insets(2, 1000, 2, 14));
        botao8.setBackground(new Color(59, 125, 187));
        botao8.setBounds(x, y,width, height);

        botao8.addActionListener((ActionEvent e) -> {
            Calcular.identicadoresArmazenados += "8$";
            App.textoInserido += "8";
            App.areaTexto.setText(App.textoInserido);
        });
        return botao8;
    }

    public JButton Botao9(short x, short y, short width, short height){
        botao9 = new JButton();
        botao9.setFont(new Font("Look and Feel", 1, 24));
        botao9.setForeground(new Color(0, 0, 102));
        botao9.setText("9");
        botao9.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botao9.setRequestFocusEnabled(false);
        botao9.setFocusable(false);
        //botao9.setRolloverEnabled(true);
        //botao9.setMargin(new Insets(2, 1000, 2, 14));
        botao9.setBackground(new Color(59, 125, 187));
        botao9.setBounds(x, y,width, height);

        botao9.addActionListener((ActionEvent e) -> {
            Calcular.identicadoresArmazenados += "9$";
            App.textoInserido += "9";
            App.areaTexto.setText(App.textoInserido);
        });
        return botao9;
    }

    public JButton BotaoIgual(short x, short y, short width, short height){
        botaoIgual = new JButton();
        botaoIgual.setFont(new Font("Look and Feel", 1, 24));
        botaoIgual.setForeground(new Color(0, 0, 102));
        botaoIgual.setText("=");
        botaoIgual.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoIgual.setRequestFocusEnabled(false);
        botaoIgual.setFocusable(false);
        //botaoIgual.setRolloverEnabled(true);
        //botaoIgual.setMargin(new Insets(2, 1000, 2, 14));
        botaoIgual.setBackground(new Color(59, 125, 187));
        botaoIgual.setBounds(x, y,width, height);

        botaoIgual.addActionListener((ActionEvent e) -> {
            Calcular.Resultado();
        });

        return botaoIgual;
    }

    public JButton BotaoApagar(short x, short y, short width, short height){
        botaoApagar = new JButton();
        botaoApagar.setFont(new Font("Look and Feel", 1, 24));
        botaoApagar.setForeground(new Color(0, 0, 102));
        botaoApagar.setText("<=");
        botaoApagar.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoApagar.setRequestFocusEnabled(false);
        botaoApagar.setFocusable(false);
        //botaoApagar.setRolloverEnabled(true);
        //botaoApagar.setMargin(new Insets(2, 1000, 2, 14));
        botaoApagar.setBackground(new Color(59, 125, 187));
        botaoApagar.setBounds(x, y,width, height);

        botaoApagar.addActionListener((ActionEvent e) -> {
            if (App.textoInserido.length() != 0) {
                Calcular.identicadoresArmazenados = Calcular.identicadoresArmazenados.substring(0, Calcular.identicadoresArmazenados.length()-2);
                App.textoInserido = App.textoInserido.substring(0, App.textoInserido.length() - 1);
                App.areaTexto.setText(App.textoInserido);
            }
        });

        return botaoApagar;
    }

    public JButton BotaoApagarTudo(short x, short y, short width, short height){
        botaoApagarTudo = new JButton();
        botaoApagarTudo.setFont(new Font("Look and Feel", 1, 24));
        botaoApagarTudo.setForeground(new Color(0, 0, 102));
        botaoApagarTudo.setText("DELETAR");
        botaoApagarTudo.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoApagarTudo.setRequestFocusEnabled(false);
        botaoApagarTudo.setFocusable(false);
        //botaoApagarTudo.setRolloverEnabled(true);
        //botaoApagarTudo.setMargin(new Insets(2, 1000, 2, 14));
        botaoApagarTudo.setBackground(new Color(59, 125, 187));
        botaoApagarTudo.setBounds(x, y,width, height);

        botaoApagarTudo.addActionListener((ActionEvent e) -> {
            Calcular.identicadoresArmazenados = "";
            App.textoInserido = "";
            App.areaTexto.setText(App.textoInserido);
        });

        return botaoApagarTudo;
    }

    public JButton BotaoSubtracao(short x, short y, short width, short height){
        botaoSubtracao = new JButton();
        botaoSubtracao.setFont(new Font("Look and Feel", 1, 24));
        botaoSubtracao.setForeground(new Color(0, 0, 102));
        botaoSubtracao.setText("-");
        botaoSubtracao.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoSubtracao.setRequestFocusEnabled(false);
        botaoSubtracao.setFocusable(false);
        //botaoSubtracao.setRolloverEnabled(true);
        //botaoSubtracao.setMargin(new Insets(2, 1000, 2, 14));
        botaoSubtracao.setBackground(new Color(59, 125, 187));
        botaoSubtracao.setBounds(x, y,width, height);

        botaoSubtracao.addActionListener((ActionEvent e) -> {
            Calcular.identicadoresArmazenados += "-$";
            App.textoInserido += "-";
            App.areaTexto.setText(App.textoInserido);
        });

        return botaoSubtracao;
    }

    public JButton BotaoSoma(short x, short y, short width, short height){
        botaoSoma = new JButton();
        botaoSoma.setFont(new Font("Look and Feel", 1, 24));
        botaoSoma.setForeground(new Color(0, 0, 102));
        botaoSoma.setText("+");
        botaoSoma.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoSoma.setRequestFocusEnabled(false);
        botaoSoma.setFocusable(false);
        //botaoSoma.setRolloverEnabled(true);
        //botaoSoma.setMargin(new Insets(2, 1000, 2, 14));
        botaoSoma.setBackground(new Color(59, 125, 187));
        botaoSoma.setBounds(x, y,width, height);

        botaoSoma.addActionListener((ActionEvent e) -> {
            Calcular.identicadoresArmazenados += "+$";
            App.textoInserido += "+";
            App.areaTexto.setText(App.textoInserido);
        });

        return botaoSoma;
    }

    public JButton BotaoDivisao(short x, short y, short width, short height){
        botaoDivisao = new JButton();
        botaoDivisao.setFont(new Font("Look and Feel", 1, 24));
        botaoDivisao.setForeground(new Color(0, 0, 102));
        botaoDivisao.setText("÷");
        botaoDivisao.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoDivisao.setRequestFocusEnabled(false);
        botaoDivisao.setFocusable(false);
        //botaoDivisao.setRolloverEnabled(true);
        //botaoDivisao.setMargin(new Insets(2, 1000, 2, 14));
        botaoDivisao.setBackground(new Color(59, 125, 187));
        botaoDivisao.setBounds(x, y,width, height);

        botaoDivisao.addActionListener((ActionEvent e) -> {
            Calcular.identicadoresArmazenados += "/$";
            App.textoInserido += "÷";
            App.areaTexto.setText(App.textoInserido);
        });

        return botaoDivisao;
    }

    public JButton BotaoMultiplicacao(short x, short y, short width, short height){
        botaoMultiplicacao = new JButton();
        botaoMultiplicacao.setFont(new Font("Look and Feel", 1, 24));
        botaoMultiplicacao.setForeground(new Color(0, 0, 102));
        botaoMultiplicacao.setText("x");
        botaoMultiplicacao.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoMultiplicacao.setRequestFocusEnabled(false);
        botaoMultiplicacao.setFocusable(false);
        //botaoMultiplicacao.setRolloverEnabled(true);
        //botaoMultiplicacao.setMargin(new Insets(2, 1000, 2, 14));
        botaoMultiplicacao.setBackground(new Color(59, 125, 187));
        botaoMultiplicacao.setBounds(x, y,width, height);

        botaoMultiplicacao.addActionListener((ActionEvent e) -> {
            Calcular.identicadoresArmazenados += "*$";
            App.textoInserido += "x";
            App.areaTexto.setText(App.textoInserido);
        });

        return botaoMultiplicacao;
    }

    public JButton BotaoPorcentagem(short x, short y, short width, short height){
        botaoPorcentagem = new JButton();
        botaoPorcentagem.setFont(new Font("Look and Feel", 1, 24));
        botaoPorcentagem.setForeground(new Color(0, 0, 102));
        botaoPorcentagem.setText("%");
        botaoPorcentagem.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoPorcentagem.setRequestFocusEnabled(false);
        botaoPorcentagem.setFocusable(false);
        //botaoPorcentagem.setRolloverEnabled(true);
        //botaoPorcentagem.setMargin(new Insets(2, 1000, 2, 14));
        botaoPorcentagem.setBackground(new Color(59, 125, 187));
        botaoPorcentagem.setBounds(x, y,width, height);

        botaoPorcentagem.addActionListener((ActionEvent e) -> {
            Calcular.identicadoresArmazenados += "%$";
            App.textoInserido += "%";
            App.areaTexto.setText(App.textoInserido);
        });

        return botaoPorcentagem;
    }

    public JButton BotaoCasas(short x, short y, short width, short height){
        botaoCasas = new JButton();
        botaoCasas.setFont(new Font("Look and Feel", 1, 16));
        botaoCasas.setForeground(new Color(0, 0, 102));
        botaoCasas.setText("14I14");
        botaoCasas.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoCasas.setRequestFocusEnabled(false);
        botaoCasas.setFocusable(false);
        //botaoCasas.setRolloverEnabled(true);
        //botaoCasas.setMargin(new Insets(2, 1000, 2, 14));
        botaoCasas.setBackground(new Color(59, 125, 187));
        botaoCasas.setBounds(x, y,width, height);

        botaoCasas.addActionListener((ActionEvent e) -> {

            DecimalFormatSymbols simbolos = new DecimalFormatSymbols(new Locale("pt", "BR"));
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
    
    public JButton BotaoRaizQuadrada(short x, short y, short width, short height){
        botaoRaizQuadrada = new JButton();
        botaoRaizQuadrada.setFont(new Font("Look and Feel", 1, 24));
        botaoRaizQuadrada.setForeground(new Color(0, 0, 102));
        botaoRaizQuadrada.setText("²√x");
        botaoRaizQuadrada.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoRaizQuadrada.setRequestFocusEnabled(false);
        botaoRaizQuadrada.setFocusable(false);
        //botaoRaizQuadrada.setRolloverEnabled(true);
        //botaoRaizQuadrada.setMargin(new Insets(2, 1000, 2, 14));
        botaoRaizQuadrada.setBackground(new Color(59, 125, 187));
        botaoRaizQuadrada.setBounds(x, y,width, height);

        botaoRaizQuadrada.addActionListener((ActionEvent e) -> {
            Calcular.identicadoresArmazenados += "2$√$";
            App.textoInserido += "2√";
            App.areaTexto.setText(App.textoInserido);
        });

        return botaoRaizQuadrada;
    }

    public JButton BotaoElevadoPotenciaDois(short x, short y, short width, short height){
        botaoElevadoPotenciaDois = new JButton();
        botaoElevadoPotenciaDois.setFont(new Font("Look and Feel", 1, 24));
        botaoElevadoPotenciaDois.setForeground(new Color(0, 0, 102));
        botaoElevadoPotenciaDois.setText("x²");
        botaoElevadoPotenciaDois.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoElevadoPotenciaDois.setRequestFocusEnabled(false);
        botaoElevadoPotenciaDois.setFocusable(false);
        //botaoElevadoPotenciaDois.setRolloverEnabled(true);
        //botaoElevadoPotenciaDois.setMargin(new Insets(2, 1000, 2, 14));
        botaoElevadoPotenciaDois.setBackground(new Color(59, 125, 187));
        botaoElevadoPotenciaDois.setBounds(x, y,width, height);

        botaoElevadoPotenciaDois.addActionListener((ActionEvent e) -> {
            Calcular.identicadoresArmazenados += "^$($2$)$";
            App.textoInserido += "^(2)";
            App.areaTexto.setText(App.textoInserido);
        });

        return botaoElevadoPotenciaDois;
    }

    public JButton BotaoUmSobreX(short x, short y, short width, short height){
        botaoUmSobreX = new JButton();
        botaoUmSobreX.setFont(new Font("Look and Feel", 1, 24));
        botaoUmSobreX.setForeground(new Color(0, 0, 102));
        botaoUmSobreX.setText("1/x");
        botaoUmSobreX.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoUmSobreX.setRequestFocusEnabled(false);
        botaoUmSobreX.setFocusable(false);
        //botaoUmSobreX.setRolloverEnabled(true);
        //botaoUmSobreX.setMargin(new Insets(2, 1000, 2, 14));
        botaoUmSobreX.setBackground(new Color(59, 125, 187));
        botaoUmSobreX.setBounds(x, y,width, height);

        botaoUmSobreX.addActionListener((ActionEvent e) -> {
            Calcular.identicadoresArmazenados += "1$/$";
            App.textoInserido += "1÷";
            App.areaTexto.setText(App.textoInserido);
        });

        return botaoUmSobreX;
    }

    public JButton BotaoVirgula(short x, short y, short width, short height){
        botaoVirgula = new JButton();
        botaoVirgula.setFont(new Font("Look and Feel", 1, 24));
        botaoVirgula.setForeground(new Color(0, 0, 102));
        botaoVirgula.setText(",");
        botaoVirgula.setBorder(BorderFactory.createLineBorder(new Color(24, 96, 163), 3));
        botaoVirgula.setRequestFocusEnabled(false);
        botaoVirgula.setFocusable(false);
        //botaoVirgula.setRolloverEnabled(true);
        //botaoVirgula.setMargin(new Insets(2, 1000, 2, 14));
        botaoVirgula.setBackground(new Color(59, 125, 187));
        botaoVirgula.setBounds(x, y,width, height);

        botaoVirgula.addActionListener((ActionEvent e) -> {
            Calcular.identicadoresArmazenados += ",$";
            App.textoInserido += ",";
            App.areaTexto.setText(App.textoInserido);
        });

        return botaoVirgula;
    }

}