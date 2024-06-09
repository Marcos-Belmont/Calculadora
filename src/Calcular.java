import java.math.BigDecimal;
import java.util.Arrays;

//Anotacoes:

//O sistema faz o calculo tendo como refencia sempre como prioritario os valores da direita para a esquerda.
//O sistema quando verifica um valor com um sinal (+ ou -), ele aplica com o valor numérico mais próximo a ele na direita.

//O sistema de multiplicacao e divisao faz o sistema andar com prioridade para a direita e depois esquerda.
//O sistema de multiplicacao e divisao caminha para a esquerda até ter um valor numerico e um possivel sinal (+ ou -).
//O sistema de multiplicacao e divisao caminha para a direita até achar um valor numérico.

public class Calcular {

    private static final BigDecimal EULER = new BigDecimal(2.71d);
    private static final BigDecimal MENOS_UM = new BigDecimal(-1);
    private static final BigDecimal CEM = new BigDecimal(100);
    private static final BigDecimal ZERO = new BigDecimal(0);
    private static final BigDecimal UM = new BigDecimal(1);

    public static String identicadoresArmazenados = ""; //Strign para armazenar os ID

    public static void Resultado() {

        BigDecimal resultado = new BigDecimal(0);//Deixa o resultado padrão como 0

        System.out.println("ID: " + identicadoresArmazenados);

        //String responsável por separar os elementos em valores, exemplo: '2+15' vai ser valor0 = 2, valor1 = +, valor2 = 15
        String[] valores = new String[identicadoresArmazenados.length()];
        Arrays.fill(valores, ""); //Deixa todos os valores do array como vazio

        int contador = 0; //Responsável por fazer a contagem de valores
        int prioridade = 0, maximoPrioridade = 0; //Responsável por fazer a contagem de parenteses e pegar o seu valor máximo

        int contagemFatorialModulo = 0; //Responsável por contar os valores fatoriais e de modulo
        int[] fatorialModulo = new int[identicadoresArmazenados.length()]; //Responsável por armazenar a posição dos valores fatoriais e de modulo
        Arrays.fill(fatorialModulo, 0); //Deixa todos os elementos do array como 0

        int contagemLog = 0; //Responsável por contar os valores log
        int[] log = new int[identicadoresArmazenados.length()]; //Responsável por armazenar a posição dos valores do log
        Arrays.fill(log, 0); //Deixa todos os elementos do array como 0

        int contagemPot = 0; //Responsável por contar os valores de potencia
        int[] pot = new int[identicadoresArmazenados.length()]; //Responsável por armazenar a posição dos valores de potencia
        Arrays.fill(pot, 0); //Deixa todos os elementos do array como 0

        int contagemRaiz = 0; //Responsável por contar os valores raiz
        int[] raiz = new int[identicadoresArmazenados.length()]; //Responsável por armazenar a posição dos valores raiz
        Arrays.fill(raiz, 0); //Deixa todos os elementos do array como 0

        int contagemMD = 0; //Responsável por contar os valores que multiplicam, dividem e derivados
        int[] multiplicacaoDivisao = new int[identicadoresArmazenados.length()]; //Responsável por armazenar a posição dos valores da multiplicacao, divisao e derivados
        Arrays.fill(multiplicacaoDivisao, 0); //Deixa todos os elementos do array como 0

        String[] simbolo = new String[identicadoresArmazenados.length()]; //Serve para receber os valores * ou /
        Arrays.fill(simbolo, "");//Deixa todos os elementos do array como vazio

        for (int i=0; i < identicadoresArmazenados.length();i++) //Looping para anexar os elementos da string identicadoresArmazenados para a string valores
        {
            String leitor = ""; //Responsável por armazenar temporariamente e ler os valores do identicadoresArmazenados, para depois armazenar os valores

            //Pega o elemento da ID
            while (!identicadoresArmazenados.substring(i,i+1).equals("$")) 
            {
                leitor += identicadoresArmazenados.substring(i,i+1);
                i++;
            }

            //Anexar o valor
            switch (leitor) {
                case ",":
                    valores[contador] += ".";
                    break;
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":
                    valores[contador] += leitor;
                    break;
                default:
                    switch (leitor) {
                        case "(": //Abre Parenteses
                            prioridade++;
                            if (prioridade > maximoPrioridade) {
                                maximoPrioridade = prioridade;
                            }
                            break;
                        case ")": //Fecha Parenteses
                            prioridade--;
                            contador++;
                            break;
                        case "M": //Modulo
                            fatorialModulo[contagemFatorialModulo] = contador+1;
                            simbolo[contagemFatorialModulo] = "M";
                            contagemFatorialModulo++;
                            contador++;
                            break;
                        case "N": //Fatorial
                            fatorialModulo[contagemFatorialModulo] = contador+1;
                            simbolo[contagemFatorialModulo] = "N";
                            contagemFatorialModulo++;
                            contador++;
                            break;
                        case "√": //Raiz
                            multiplicacaoDivisao[contagemMD] = contador+1;
                            simbolo[contagemMD] = "√";
                            contagemMD++;
                            contador++;
                            break;
                        case "^": //Potência
                            multiplicacaoDivisao[contagemMD] = contador+1;
                            simbolo[contagemMD] = "^";
                            contagemMD++;
                            contador++;
                            break;
                        case "*": //Multiplicacao
                            multiplicacaoDivisao[contagemMD] = contador+1;
                            simbolo[contagemMD] = "*";
                            contagemMD++;
                            contador++;
                            break;
                        case "/": //Divisao
                            multiplicacaoDivisao[contagemMD] = contador+1;
                            simbolo[contagemMD] = "/";
                            contagemMD++;
                            contador++;
                            break;
                        case "\\": //Resto
                            multiplicacaoDivisao[contagemMD] = contador+1;
                            simbolo[contagemMD] = "\\";
                            contagemMD++;
                            contador++;
                            break;
                        case "%": //Porcentagem
                            multiplicacaoDivisao[contagemMD] = contador+1;
                            simbolo[contagemMD] = "%";
                            contagemMD++;
                            contador++;
                            break;
                        default:
                            contador++;
                            break;
                    }
                    valores[contador] += leitor;
                    if (!leitor.equals(")")) {
                      contador++;
                    }
                    break;
            }
        }

        //Elemento fútil, apenas para visualizar no Terminal
        String calculo = "";
        for (int i = 0; i <= contador; i++) {
          //System.out.println(valores[i]);
          calculo += valores[i];
        }
        System.out.println("Cálculo: " + calculo);

        //Looping para aplicar o calculo
        while (maximoPrioridade >= 0) {

            Boolean semParenteses = false, liberarCalculo = false; //Usado para verificar quando deve fazer o calculo ou nao

            int valorInicialParenteses = 0, valorFinalParenteses = 0; //Pega o primeiro valor quando abre o parênteses prioritário e o último, respectivamente

            //Looping para fazer o cálculo com a prioridade do parênteses
            for (int i = 0; i <= contador; i++) {
                
                //Verifica os parenteses e incremente/decrementa a sua prioridade
                switch (valores[i]) {
                    case "(":
                        prioridade++;
                        break;
                    case ")":
                        prioridade--;
                        break;
                }

                //Condição de quando não houver mais parenteses
                if (maximoPrioridade == 0) {
                    i = contador+1;
                    valorInicialParenteses = 1;
                    valorFinalParenteses = contador;
                    semParenteses = true;
                    liberarCalculo = true;
                }

                //Pega o valor inicial do parenteses determinado
                if(prioridade == maximoPrioridade && semParenteses == false){
                    if (liberarCalculo != true) {
                        valores[i] = "";
                        valorInicialParenteses = i+1;
                    }
                    liberarCalculo = true;
                }
                //Pega o valor final do parenteses determinado e aplica o resto do calculo
                else if (liberarCalculo == true) {

                    liberarCalculo = false;

                    //Pega o valor final do parenteses determinado
                    if (i != 0 && semParenteses == false) {
                        valorFinalParenteses = i-1;
                        valores[i] = "";
                    }

                    semParenteses = false;

                    //Loopings do calculo, com base na ordem prioritária dos parenteses

                    //Looping de prioridade a fatorial e modulo
                    for (int count = contagemFatorialModulo; count >= 0; count--) {

                        BigDecimal valorDireita = new BigDecimal(0); //Pega o valor da esquerda e o da direita, para realizar o calculo

                        int seguirDireita = 0; //Fica analisando e armazenando os valores da direita e esquerda.
                        boolean direita = false; //Verifica se já pegou o valor necessário da esquerda e da direita.
                        boolean sinalDireita = true; //Verifica o sinal para aplicar ao valor da direita.

                        if (fatorialModulo[count] >= valorInicialParenteses && fatorialModulo[count] <= valorFinalParenteses) {

                            valores[fatorialModulo[count]] = "";

                            //looping para pegar todos os valores da multiplicacao/divisao
                            while (direita == false) { 

                                //Verificando os valores a direita
                                try {
                                    if(valores[fatorialModulo[count]+seguirDireita].equals("") && direita == false){
                                        System.out.println(valores[fatorialModulo[count]+seguirDireita]);
                                        seguirDireita++;
                                    }
                                    else if (valores[fatorialModulo[count]+seguirDireita].equals("+") && direita == false) {
                                        valores[fatorialModulo[count]+seguirDireita] = "";
                                        sinalDireita = true;
                                    }
                                    else if (valores[fatorialModulo[count]+seguirDireita].equals("-") && direita == false) {
                                        valores[fatorialModulo[count]+seguirDireita] = "";
                                        sinalDireita = false;
                                    }
                                    else if(direita == false){
    
                                        valores[fatorialModulo[count]+seguirDireita] = (sinalDireita == true ? valores[fatorialModulo[count]+seguirDireita] :
                                        (valores[fatorialModulo[count]+seguirDireita].substring(0,1).equals("-") ?
                                        valores[fatorialModulo[count]+seguirDireita].substring(1,valores[fatorialModulo[count]+seguirDireita].length()) 
                                        : "-" + valores[fatorialModulo[count]+seguirDireita]));
    
                                        valorDireita = new BigDecimal(valores[fatorialModulo[count]+seguirDireita]);

                                        System.out.println(valorDireita);
    
                                        valores[fatorialModulo[count]+seguirDireita] = "";
                                    
                                        direita = true; 
                                    }
                                } catch (Exception e) {direita = true;}
                            }

                            //Fazendo o calculo do modulo e fatorial
                            System.out.println("Direita: "+valorDireita);
                            switch (simbolo[count]) {
                                case "M":
                                    valores[fatorialModulo[count]] = String.valueOf(valorDireita.abs());
                                
                                    //valores[multiplicacaoDivisao[count]] = String.valueOf((valorEsquerda.multiply(valorDireita)));
                                    System.out.println("Valor: "+valores[fatorialModulo[count]]);
                                    break;
                                case "N":
                                    
                                    if (valorDireita.remainder(UM).compareTo(ZERO) == 0) 
                                    {
                                        BigDecimal pegarValor = new BigDecimal(1);

                                        while (valorDireita.compareTo(UM) != 0) {
                                            pegarValor = pegarValor.multiply(valorDireita);
                                            valorDireita = valorDireita.subtract(UM);
                                        }
                                        valorDireita = pegarValor;
                                    }
                                    else
                                    {
                                        

                                    }

                                    valores[fatorialModulo[count]] = String.valueOf(valorDireita);

                                    //valores[multiplicacaoDivisao[count]] = String.valueOf((valorEsquerda.multiply(valorDireita)));
                                    System.out.println("Valor: "+valores[fatorialModulo[count]]);
                                    break;
                            }

                            //Serve para computar que esse valor não existe mais para analise
                            fatorialModulo[count] = -2;
                            
                        }

                    }

                    //Looping de prioridade a multiplicacao, divisisao e derivados
                    for (int count = contagemMD; count >= 0; count--) {

                        BigDecimal valorEsquerda = new BigDecimal(0), valorDireita = new BigDecimal(0); //Pega o valor da esquerda e o da direita, para realizar o calculo

                        int seguirEsquerda = 0, salvarValorEsquerda = 0, seguirDireita = 0; //Fica analisando e armazenando os valores da direita e esquerda.
                        boolean esquerda = false, direita = false; //Verifica se já pegou o valor necessário da esquerda e da direita.
                        boolean sinalDireita = true , //Verifica o sinal para aplicar ao valor da direita.
                         validacaoEsquerda = false; //Usado para verificar a existencia de um sinal na esquerda (+/-).

                        if (multiplicacaoDivisao[count] >= valorInicialParenteses && multiplicacaoDivisao[count] <= valorFinalParenteses) {

                            valores[multiplicacaoDivisao[count]] = "";

                            //looping para pegar todos os valores da multiplicacao/divisao
                            while (esquerda == false || direita == false) { 

                                //Verificando a direita da multiplicacao e divisao
                                try {
                                    if(valores[multiplicacaoDivisao[count]+seguirDireita].equals("") && direita == false){
                                        System.out.println(valores[multiplicacaoDivisao[count]+seguirDireita]);
                                        seguirDireita++;
                                    }
                                    else if (valores[multiplicacaoDivisao[count]+seguirDireita].equals("+") && direita == false) {
                                        valores[multiplicacaoDivisao[count]+seguirDireita] = "";
                                        sinalDireita = true;
                                    }
                                    else if (valores[multiplicacaoDivisao[count]+seguirDireita].equals("-") && direita == false) {
                                        valores[multiplicacaoDivisao[count]+seguirDireita] = "";
                                        sinalDireita = false;
                                    }
                                    else if(direita == false){
    
                                        valores[multiplicacaoDivisao[count]+seguirDireita] = (sinalDireita == true ? valores[multiplicacaoDivisao[count]+seguirDireita] :
                                        (valores[multiplicacaoDivisao[count]+seguirDireita].substring(0,1).equals("-") ?
                                        valores[multiplicacaoDivisao[count]+seguirDireita].substring(1,valores[multiplicacaoDivisao[count]+seguirDireita].length()) 
                                        : "-" + valores[multiplicacaoDivisao[count]+seguirDireita]));
    
                                        valorDireita = new BigDecimal(valores[multiplicacaoDivisao[count]+seguirDireita]);

                                        System.out.println(valorDireita);
    
                                        valores[multiplicacaoDivisao[count]+seguirDireita] = "";
                                    
                                        direita = true; 
                                    }
                                } catch (Exception e) {direita = true;
                                }

                                //Verificando a esquerda da multiplicacao e divisao
                                try {
                                    if(valores[multiplicacaoDivisao[count]+seguirEsquerda].equals("") && esquerda == false){
                                        seguirEsquerda--;
                                    }
                                    else if (valores[multiplicacaoDivisao[count]+seguirEsquerda].equals("+") && esquerda == false) {
    
                                        valores[multiplicacaoDivisao[count]+seguirEsquerda] = "";
    
                                        esquerda = true; 
                                    }
                                    else if (valores[multiplicacaoDivisao[count]+seguirEsquerda].equals("-") && esquerda == false) {
    
                                        valores[multiplicacaoDivisao[count]+seguirEsquerda] = 
                                            (valores[multiplicacaoDivisao[count]+seguirEsquerda].substring(0,1).equals("-") ?
                                            valores[multiplicacaoDivisao[count]+seguirEsquerda].substring(1, valores[multiplicacaoDivisao[count]+seguirEsquerda].length()) 
                                            : "-" + valores[multiplicacaoDivisao[count]+seguirEsquerda]);
    
                                        valores[multiplicacaoDivisao[count]+seguirEsquerda] = "";
    
                                        valorEsquerda = valorEsquerda.multiply(MENOS_UM);
    
                                        esquerda = true; 
                                    }
                                    else if(esquerda == false){
                                        if (validacaoEsquerda == false) {
    
                                            valorEsquerda = new BigDecimal(valores[multiplicacaoDivisao[count]+seguirEsquerda]);
                                            valores[multiplicacaoDivisao[count]+seguirEsquerda] = "";
                                            salvarValorEsquerda = seguirEsquerda;
    
                                            validacaoEsquerda = true;
                                        }
                                        else{
                                            seguirEsquerda = salvarValorEsquerda;
                                            esquerda = true; 
                                        }
                                        
                                    }
                                } catch (Exception e) 
                                { 
                                    //seguirEsquerda++;
                                    seguirEsquerda = salvarValorEsquerda;
                                    esquerda = true;
                                }
                                
                            }

                            //Fazendo o calculo da multplicao e divisao
                            System.out.println("Esquerda: "+valorEsquerda+" || Direita: "+valorDireita);
                            switch (simbolo[count]) {
                                case "√":
                                    valores[multiplicacaoDivisao[count]+seguirEsquerda] = String.valueOf(Math.pow(valorDireita.doubleValue(), 1/valorEsquerda.doubleValue()));
                                
                                    //valores[multiplicacaoDivisao[count]+seguirEsquerda] = String.valueOf((valorEsquerda.multiply(valorDireita)));
                                    System.out.println("Valor: "+valores[multiplicacaoDivisao[count]+seguirEsquerda]);
                                    break;
                                case "^":
                                    valores[multiplicacaoDivisao[count]+seguirEsquerda] = String.valueOf(Math.pow(valorEsquerda.doubleValue(), valorDireita.doubleValue()));
                                    
                                    //valores[multiplicacaoDivisao[count]+seguirEsquerda] = String.valueOf((valorEsquerda.multiply(valorDireita)));
                                    System.out.println("Valor: "+valores[multiplicacaoDivisao[count]+seguirEsquerda]);
                                    break;
                                case "*":
                                    valores[multiplicacaoDivisao[count]+seguirEsquerda] = String.valueOf((valorEsquerda.multiply(valorDireita)));
                                    System.out.println("Valor: "+valores[multiplicacaoDivisao[count]+seguirEsquerda]);
                                    break;
                                case "/":
                                    valores[multiplicacaoDivisao[count]+seguirEsquerda] = String.valueOf((valorEsquerda.divide(valorDireita)));
                                    System.out.println("Valor: "+valores[multiplicacaoDivisao[count]+seguirEsquerda]);
                                    break;
                                case "\\":
                                    valores[multiplicacaoDivisao[count]+seguirEsquerda] = String.valueOf((valorEsquerda.remainder(valorDireita)));
                                    System.out.println("Valor: "+valores[multiplicacaoDivisao[count]+seguirEsquerda]);
                                    break;
                                case "%":
                                    valorEsquerda = valorEsquerda.divide(CEM);
                                    valores[multiplicacaoDivisao[count]+seguirEsquerda] = String.valueOf(valorEsquerda.multiply(valorDireita));
                                break;
                            }

                            //Serve para computar que esse valor não existe mais para analise
                            multiplicacaoDivisao[count] = -2;
                            
                        }

                    }

                    //Declarando o valor do resultado, pegando o último valor do parenteses (caso não tenha será o último valor do calculo)
                    resultado = new BigDecimal(0);//Double.parseDouble((valores[valorFinalParenteses].equals("") ? "0" : valores[valorFinalParenteses]));
                    
                    //Looping aplicando o sinal corretamente a cada elemento
                    boolean sinalNegativo = false;
                    for(int count = valorInicialParenteses; count <= valorFinalParenteses;count++){

                        if(valores[count].equals("-")){

                            /*if (sinalNegativo == true) 
                            {
                                sinalNegativo = false;
                            }else{
                                sinalNegativo = true;
                            }*/

                            sinalNegativo = sinalNegativo != true;
                            
                            resultado = resultado.multiply(MENOS_UM);
                            valores[count]="";
                        }
                        else if (valores[count].equals("+")) {
                            valores[count]="";
                        }
                        else if(!valores[count].equals("")){
                            if (sinalNegativo == true) {
                                valores[count] = (valores[count].substring(0,1).equals("-") ? 
                                valores[count].substring(1, valores[count].length()) : "-" + valores[count]);

                                sinalNegativo = false;
                            }
                        }
                    }

                    //Looping da soma e subtração, dando a prioridade o que está entre parenteses
                    int pegarIDValor = 0;
                    for(int count = valorFinalParenteses; count >= valorInicialParenteses-1;count--){

                        /*if(valores[count].equals("-")){
                            resultado = resultado.multiply(invert);
                        }
                        else if (valores[count].equals("+")) {
                            
                        }
                        else */if(!valores[count].equals("")){
                            resultado = resultado.add(BigDecimal.valueOf(Double.parseDouble(valores[count])));
                        }
                        valores[count]="";
                        pegarIDValor = count;
                    }
                    valores[pegarIDValor] = String.valueOf(resultado);
                    
                    //Elemento fútil, apenas para visualizar no Terminal
                    System.out.println("Resultado do Parenteses("+maximoPrioridade+"): "+ resultado);
                }

            }
            maximoPrioridade--; //Decrementa o maximo de parenteses existentes até terminar o cálculo, encerrando assim o looping
        }
        
        identicadoresArmazenados = "";

        App.textoInserido = App.formatoDecimal.format(resultado);

        for (int i = 0; i < App.textoInserido.length(); i++) {
            identicadoresArmazenados += App.textoInserido.substring(i,i+1) + "$";
        }

        App.areaTexto.setText(App.textoInserido);

    }
}
