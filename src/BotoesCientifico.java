import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class BotoesCientifico {

    public JButton botaoPi,botaoEuler,botaoFatorial,botaoAbrindoParenteses,botaoFechandoParenteses,botaoEXP,botaoModulo,botaoResto,botaoXElevadoPotenciaY,botaoDezElevadoPotenciaX,
    botaoLogaritmo,botaoLogaritmoNatural,botaoXElevadoPotencia3,botaoRaizCubicaX,botaoRaizYX,botaoDoisElevadoPotenciaX,botaoLogYBaseX,botaoEElevadoPotenciaX; //botoes que serao aplicados.

    public JButton BotaoPi(short x, short y, short width, short height){
        botaoPi = new JButton();
        botaoPi.setFont(new Font("Look and Feel", 1, 24));
        botaoPi.setText("π");
        botaoPi.setRequestFocusEnabled(false);
        botaoPi.setFocusable(false);
        botaoPi.setBounds(x, y,width, height);

        botaoPi.addActionListener((ActionEvent e) -> {
                for (byte i = 0; i < App.formatoDecimal.format(Math.PI).length(); i++) {
                    Calcular.identicadoresArmazenados += App.formatoDecimal.format(Math.PI).substring(i,i+1)+"$";
                }
                App.textoInserido += App.formatoDecimal.format(Math.PI);
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoPi;
    }

    public JButton BotaoEuler(short x, short y, short width, short height){
        botaoEuler = new JButton();
        botaoEuler.setFont(new Font("Look and Feel", 1, 24));
        botaoEuler.setText("e");
        botaoEuler.setRequestFocusEnabled(false);
        botaoEuler.setFocusable(false);
        botaoEuler.setBounds(x, y,width, height);

        botaoEuler.addActionListener((ActionEvent e) -> {
                for (byte i = 0; i < App.formatoDecimal.format(Math.PI).length(); i++) {
                    Calcular.identicadoresArmazenados += App.formatoDecimal.format(Math.E).substring(i,i+1)+"$";
                }
                App.textoInserido += App.formatoDecimal.format(Math.E);
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoEuler;
    }

    public JButton BotaoFatorial(short x, short y, short width, short height){
        botaoFatorial = new JButton();
        botaoFatorial.setFont(new Font("Look and Feel", 1, 24));
        botaoFatorial.setText("n!");
        botaoFatorial.setRequestFocusEnabled(false);
        botaoFatorial.setFocusable(false);
        botaoFatorial.setBounds(x, y,width, height);

        botaoFatorial.addActionListener((ActionEvent e) -> {
                App.totalParenteses++;
                Calcular.identicadoresArmazenados += "N$($";
                App.textoInserido += "N(";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoFatorial;
    }

    public JButton BotaoAbrindoParenteses(short x, short y, short width, short height){
        botaoAbrindoParenteses = new JButton();
        botaoAbrindoParenteses.setFont(new Font("Look and Feel", 1, 24));
        botaoAbrindoParenteses.setText("(");
        botaoAbrindoParenteses.setRequestFocusEnabled(false);
        botaoAbrindoParenteses.setFocusable(false);
        botaoAbrindoParenteses.setBounds(x, y,width, height);

        botaoAbrindoParenteses.addActionListener((ActionEvent e) -> {
                App.totalParenteses++;
                Calcular.identicadoresArmazenados += "($";
                App.textoInserido += "(";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoAbrindoParenteses;
    }

    public JButton BotaoFechandoParenteses(short x, short y, short width, short height){
        botaoFechandoParenteses = new JButton();
        botaoFechandoParenteses.setFont(new Font("Look and Feel", 1, 24));
        botaoFechandoParenteses.setText(")");
        botaoFechandoParenteses.setRequestFocusEnabled(false);
        botaoFechandoParenteses.setFocusable(false);
        botaoFechandoParenteses.setBounds(x, y,width, height);

        botaoFechandoParenteses.addActionListener((ActionEvent e) -> {
                App.totalParenteses--;
                Calcular.identicadoresArmazenados += ")$";
                App.textoInserido += ")";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoFechandoParenteses;
    }

    public JButton BotaoEXP(short x, short y, short width, short height){
        botaoEXP = new JButton();
        botaoEXP.setFont(new Font("Look and Feel", 1, 18));
        botaoEXP.setText("NC");
        botaoEXP.setRequestFocusEnabled(false);
        botaoEXP.setFocusable(false);
        botaoEXP.setBounds(x, y,width, height);

        botaoEXP.addActionListener((ActionEvent e) -> {
                App.totalParenteses++;
                Calcular.identicadoresArmazenados += "*$($1$0$^$";
                App.textoInserido += "x(10^";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoEXP;
    }

    public JButton BotaoModulo(short x, short y, short width, short height){
        botaoModulo = new JButton();
        botaoModulo.setFont(new Font("Look and Feel", 1, 24));
        botaoModulo.setText("|x|");
        botaoModulo.setRequestFocusEnabled(false);
        botaoModulo.setFocusable(false);
        botaoModulo.setBounds(x, y,width, height);

        botaoModulo.addActionListener((ActionEvent e) -> {
                App.totalParenteses++;
                Calcular.identicadoresArmazenados += "M$($";
                App.textoInserido += "M(";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoModulo;
    }

    public JButton BotaoResto(short x, short y, short width, short height){
        botaoResto = new JButton();
        botaoResto.setFont(new Font("Look and Feel", 1, 18));
        botaoResto.setText("RST");
        botaoResto.setRequestFocusEnabled(false);
        botaoResto.setFocusable(false);
        botaoResto.setBounds(x, y,width, height);

        botaoResto.addActionListener((ActionEvent e) -> {
                Calcular.identicadoresArmazenados += "\\$";
                App.textoInserido += "\\";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoResto;
    }

    public JButton BotaoXElevadoPotenciaY(short x, short y, short width, short height){
        botaoXElevadoPotenciaY = new JButton();
        botaoXElevadoPotenciaY.setFont(new Font("Look and Feel", 1, 24));
        botaoXElevadoPotenciaY.setText("x\u02B8");
        botaoXElevadoPotenciaY.setRequestFocusEnabled(false);
        botaoXElevadoPotenciaY.setFocusable(false);
        botaoXElevadoPotenciaY.setBounds(x, y,width, height);

        botaoXElevadoPotenciaY.addActionListener((ActionEvent e) -> {
                Calcular.identicadoresArmazenados += "^$";
                App.textoInserido += "^";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoXElevadoPotenciaY;
    }

    public JButton BotaoDezElevadoPotenciaX(short x, short y, short width, short height){
        botaoDezElevadoPotenciaX = new JButton();
        botaoDezElevadoPotenciaX.setFont(new Font("Look and Feel", 1, 24));
        botaoDezElevadoPotenciaX.setText("10\u02E3");
        botaoDezElevadoPotenciaX.setRequestFocusEnabled(false);
        botaoDezElevadoPotenciaX.setFocusable(false);
        botaoDezElevadoPotenciaX.setBounds(x, y,width, height);

        botaoDezElevadoPotenciaX.addActionListener((ActionEvent e) -> {
                Calcular.identicadoresArmazenados += "1$0$^$";
                App.textoInserido += "10^";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoDezElevadoPotenciaX;
    }

    public JButton BotaoLogaritmo(short x, short y, short width, short height){
        botaoLogaritmo = new JButton();
        botaoLogaritmo.setFont(new Font("Look and Feel", 1, 17));
        botaoLogaritmo.setText("log");
        botaoLogaritmo.setRequestFocusEnabled(false);
        botaoLogaritmo.setFocusable(false);
        botaoLogaritmo.setBounds(x, y,width, height);

        botaoLogaritmo.addActionListener((ActionEvent e) -> {
                Calcular.identicadoresArmazenados += "1$0$l$";
                App.textoInserido += "10log";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoLogaritmo;
    }

    public JButton BotaoLogaritmoNatural(short x, short y, short width, short height){
        botaoLogaritmoNatural = new JButton();
        botaoLogaritmoNatural.setFont(new Font("Look and Feel", 1, 24));
        botaoLogaritmoNatural.setText("ln");
        botaoLogaritmoNatural.setRequestFocusEnabled(false);
        botaoLogaritmoNatural.setFocusable(false);
        botaoLogaritmoNatural.setBounds(x, y,width, height);

        botaoLogaritmoNatural.addActionListener((ActionEvent e) -> {
                for (byte i = 0; i < App.formatoDecimal.format(Math.PI).length(); i++) {
                    Calcular.identicadoresArmazenados += App.formatoDecimal.format(Math.E).substring(i,i+1)+"$";
                }
                Calcular.identicadoresArmazenados += "l$";
                App.textoInserido += App.formatoDecimal.format(Math.E)+"log";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoLogaritmoNatural;
    }

    public JButton BotaoXElevadoPotencia3(short x, short y, short width, short height){
        botaoXElevadoPotencia3 = new JButton();
        botaoXElevadoPotencia3.setFont(new Font("Look and Feel", 1, 24));
        botaoXElevadoPotencia3.setText("x³");
        botaoXElevadoPotencia3.setRequestFocusEnabled(false);
        botaoXElevadoPotencia3.setFocusable(false);
        botaoXElevadoPotencia3.setBounds(x, y,width, height);

        botaoXElevadoPotencia3.addActionListener((ActionEvent e) -> {
                Calcular.identicadoresArmazenados += "^$3$";
                App.textoInserido += "^3";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoXElevadoPotencia3;
    }

    public JButton BotaoRaizCubicaX(short x, short y, short width, short height){
        botaoRaizCubicaX = new JButton();
        botaoRaizCubicaX.setFont(new Font("Look and Feel", 1, 24));
        botaoRaizCubicaX.setText("³√x");
        botaoRaizCubicaX.setRequestFocusEnabled(false);
        botaoRaizCubicaX.setFocusable(false);
        botaoRaizCubicaX.setBounds(x, y,width, height);

        botaoRaizCubicaX.addActionListener((ActionEvent e) -> {
                Calcular.identicadoresArmazenados += "3$√$";
                App.textoInserido += "3√";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoRaizCubicaX;
    }

    public JButton BotaoRaizYX(short x, short y, short width, short height){
        botaoRaizYX = new JButton();
        botaoRaizYX.setFont(new Font("Look and Feel", 1, 24));
        botaoRaizYX.setText("\u02B8√x");
        botaoRaizYX.setRequestFocusEnabled(false);
        botaoRaizYX.setFocusable(false);
        botaoRaizYX.setBounds(x, y,width, height);

        botaoRaizYX.addActionListener((ActionEvent e) -> {
                Calcular.identicadoresArmazenados += "√$";
                App.textoInserido += "√";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoRaizYX;
    }

    public JButton BotaoDoisElevadoPotenciaX(short x, short y, short width, short height){
        botaoDoisElevadoPotenciaX = new JButton();
        botaoDoisElevadoPotenciaX.setFont(new Font("Look and Feel", 1, 24));
        botaoDoisElevadoPotenciaX.setText("2\u02E3");
        botaoDoisElevadoPotenciaX.setRequestFocusEnabled(false);
        botaoDoisElevadoPotenciaX.setFocusable(false);
        botaoDoisElevadoPotenciaX.setBounds(x, y,width, height);

        botaoDoisElevadoPotenciaX.addActionListener((ActionEvent e) -> {
                Calcular.identicadoresArmazenados += "2$^$";
                App.textoInserido += "2^";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoDoisElevadoPotenciaX;
    }

    public JButton BotaoLogYBaseX(short x, short y, short width, short height){
        botaoLogYBaseX = new JButton();
        botaoLogYBaseX.setFont(new Font("Look and Feel", 1, 17));
        botaoLogYBaseX.setText("log\u1D67x");
        botaoLogYBaseX.setRequestFocusEnabled(false);
        botaoLogYBaseX.setFocusable(false);
        botaoLogYBaseX.setBounds(x, y,width, height);

        botaoLogYBaseX.addActionListener((ActionEvent e) -> {
                Calcular.identicadoresArmazenados += "l$";
                App.textoInserido += "log";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoLogYBaseX;
    }

    public JButton BotaoEElevadoPotenciaX(short x, short y, short width, short height){
        botaoEElevadoPotenciaX = new JButton();
        botaoEElevadoPotenciaX.setFont(new Font("Look and Feel", 1, 24));
        botaoEElevadoPotenciaX.setText("e\u02E3");
        botaoEElevadoPotenciaX.setRequestFocusEnabled(false);
        botaoEElevadoPotenciaX.setFocusable(false);
        botaoEElevadoPotenciaX.setBounds(x, y,width, height);

        botaoEElevadoPotenciaX.addActionListener((ActionEvent e) -> {
                for (byte i = 0; i < App.formatoDecimal.format(Math.PI).length(); i++) {
                    Calcular.identicadoresArmazenados += App.formatoDecimal.format(Math.E).substring(i,i+1)+"$";
                }
                Calcular.identicadoresArmazenados += "^$";
                App.textoInserido += App.formatoDecimal.format(Math.E)+"^";
                App.areaTexto.setText(App.textoInserido);
        });

        return botaoEElevadoPotenciaX;
    }

}