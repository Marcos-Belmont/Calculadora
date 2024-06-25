import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class BotoesPadrao {

    public JButton botao0,botao1,botao2,botao3,botao4,botao5,botao6,botao7,botao8,botao9,botaoIgual,botaoApagar,botaoApagarTudo,botaoSubtracao,botaoSoma,botaoDivisao,
    botaoMultiplicacao,botaoPorcentagem,botaoRaizQuadrada,botaoElevadoPotenciaDois,botaoUmSobreX,botaoVirgula; //botoes que serao aplicados.

    public JButton Botao0(short x, short y, short width, short height){
        botao0 = new JButton();
        botao0.setFont(new Font("Look and Feel", 1, 24));
        botao0.setText("0");
        botao0.setRequestFocusEnabled(false);
        botao0.setFocusable(false);
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
        botao1.setText("1");
        botao1.setRequestFocusEnabled(false);
        botao1.setFocusable(false);
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
        botao2.setText("2");
        botao2.setRequestFocusEnabled(false);
        botao2.setFocusable(false);
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
        botao3.setText("3");
        botao3.setRequestFocusEnabled(false);
        botao3.setFocusable(false);
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
        botao4.setText("4");
        botao4.setRequestFocusEnabled(false);
        botao4.setFocusable(false);
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
        botao5.setText("5");
        botao5.setRequestFocusEnabled(false);
        botao5.setFocusable(false);
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
        botao6.setText("6");
        botao6.setRequestFocusEnabled(false);
        botao6.setFocusable(false);
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
        botao7.setText("7");
        botao7.setRequestFocusEnabled(false);
        botao7.setFocusable(false);
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
        botao8.setText("8");
        botao8.setRequestFocusEnabled(false);
        botao8.setFocusable(false);
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
        botao9.setText("9");
        botao9.setRequestFocusEnabled(false);
        botao9.setFocusable(false);
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
        botaoIgual.setText("=");
        botaoIgual.setRequestFocusEnabled(false);
        botaoIgual.setFocusable(false);
        botaoIgual.setBounds(x, y,width, height);

        botaoIgual.addActionListener((ActionEvent e) -> {
            try {
                if (App.totalParenteses > 0) {
                    App.Erro("ERRO: PARENTESES NÃO  FECHADO");
                }
                else if (App.totalParenteses < 0) {
                    App.Erro("ERRO: PARENTESES NÃO  ABERTO");
                }
                else{
                    Calcular.Resultado();
                }
            } catch (Exception exception) {
                App.Erro("ERRO!");
            }
            App.totalParenteses = 0;
        });

        return botaoIgual;
    }

    public JButton BotaoApagar(short x, short y, short width, short height){
        botaoApagar = new JButton();
        botaoApagar.setFont(new Font("Look and Feel", 1, 24));
        botaoApagar.setText("<=");
        botaoApagar.setRequestFocusEnabled(false);
        botaoApagar.setFocusable(false);
        botaoApagar.setBounds(x, y,width, height);

        botaoApagar.addActionListener((ActionEvent e) -> {
            if (App.textoInserido.length() != 0) {
                Calcular.identicadoresArmazenados = Calcular.identicadoresArmazenados.substring(0, Calcular.identicadoresArmazenados.length()-2);
                switch (App.textoInserido.substring(App.textoInserido.length() - 1, App.textoInserido.length())) {
                    case "(":
                        App.totalParenteses--;
                        break;
                    case ")":
                        App.totalParenteses++;
                        break;
                }
                if (App.textoInserido.substring(App.textoInserido.length()-1, App.textoInserido.length()).equals("l")||
                App.textoInserido.substring(App.textoInserido.length()-1, App.textoInserido.length()).equals("o")||
                App.textoInserido.substring(App.textoInserido.length()-1, App.textoInserido.length()).equals("g")) {
                    try {
                        while (App.textoInserido.substring(App.textoInserido.length()-1, App.textoInserido.length()).equals("l")||
                            App.textoInserido.substring(App.textoInserido.length()-1, App.textoInserido.length()).equals("o")||
                            App.textoInserido.substring(App.textoInserido.length()-1, App.textoInserido.length()).equals("g")) { 
                        App.textoInserido = App.textoInserido.substring(0, App.textoInserido.length() - 1);
                    }
                    } catch (Exception exception) {
                        App.textoInserido = "";
                    }
                }
                else{
                    App.textoInserido = App.textoInserido.substring(0, App.textoInserido.length() - 1);
                }
                App.areaTexto.setText(App.textoInserido);
            }
        });

        return botaoApagar;
    }

    public JButton BotaoApagarTudo(short x, short y, short width, short height){
        botaoApagarTudo = new JButton();
        botaoApagarTudo.setFont(new Font("Look and Feel", 1, 24));
        botaoApagarTudo.setText("DELETAR");
        botaoApagarTudo.setRequestFocusEnabled(false);
        botaoApagarTudo.setFocusable(false);
        botaoApagarTudo.setBounds(x, y,width, height);

        botaoApagarTudo.addActionListener((ActionEvent e) -> {
            Calcular.identicadoresArmazenados = "";
            App.textoInserido = "";
            App.areaTexto.setText(App.textoInserido);
            App.totalParenteses = 0;
        });

        return botaoApagarTudo;
    }

    public JButton BotaoSubtracao(short x, short y, short width, short height){
        botaoSubtracao = new JButton();
        botaoSubtracao.setFont(new Font("Look and Feel", 1, 24));
        botaoSubtracao.setText("-");
        botaoSubtracao.setRequestFocusEnabled(false);
        botaoSubtracao.setFocusable(false);
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
        botaoSoma.setText("+");
        botaoSoma.setRequestFocusEnabled(false);
        botaoSoma.setFocusable(false);
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
        botaoDivisao.setText("÷");
        botaoDivisao.setRequestFocusEnabled(false);
        botaoDivisao.setFocusable(false);
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
        botaoMultiplicacao.setText("x");
        botaoMultiplicacao.setRequestFocusEnabled(false);
        botaoMultiplicacao.setFocusable(false);
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
        botaoPorcentagem.setText("%");
        botaoPorcentagem.setRequestFocusEnabled(false);
        botaoPorcentagem.setFocusable(false);
        botaoPorcentagem.setBounds(x, y,width, height);

        botaoPorcentagem.addActionListener((ActionEvent e) -> {
            Calcular.identicadoresArmazenados += "%$";
            App.textoInserido += "%";
            App.areaTexto.setText(App.textoInserido);
        });

        return botaoPorcentagem;
    }

    public JButton BotaoRaizQuadrada(short x, short y, short width, short height){
        botaoRaizQuadrada = new JButton();
        botaoRaizQuadrada.setFont(new Font("Look and Feel", 1, 24));
        botaoRaizQuadrada.setText("²√x");
        botaoRaizQuadrada.setRequestFocusEnabled(false);
        botaoRaizQuadrada.setFocusable(false);
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
        botaoElevadoPotenciaDois.setText("x²");
        botaoElevadoPotenciaDois.setRequestFocusEnabled(false);
        botaoElevadoPotenciaDois.setFocusable(false);
        botaoElevadoPotenciaDois.setBounds(x, y,width, height);

        botaoElevadoPotenciaDois.addActionListener((ActionEvent e) -> {
            Calcular.identicadoresArmazenados += "^$2$";
            App.textoInserido += "^2";
            App.areaTexto.setText(App.textoInserido);
        });

        return botaoElevadoPotenciaDois;
    }

    public JButton BotaoUmSobreX(short x, short y, short width, short height){
        botaoUmSobreX = new JButton();
        botaoUmSobreX.setFont(new Font("Look and Feel", 1, 24));
        botaoUmSobreX.setText("1/x");
        botaoUmSobreX.setRequestFocusEnabled(false);
        botaoUmSobreX.setFocusable(false);
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
        botaoVirgula.setText(",");
        botaoVirgula.setRequestFocusEnabled(false);
        botaoVirgula.setFocusable(false);
        botaoVirgula.setBounds(x, y,width, height);

        botaoVirgula.addActionListener((ActionEvent e) -> {
            Calcular.identicadoresArmazenados += ",$";
            App.textoInserido += ",";
            App.areaTexto.setText(App.textoInserido);
        });

        return botaoVirgula;
    }

}