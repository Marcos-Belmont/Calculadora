// todo:
// O usuario pode escrever em cima do Resultado (usar booleanos de resultados para consertar?)
// Numeros inteiros devem ser truncados para integers (numeros terminados com .0)
// Este codigo talvez nao seja suficiente para calculos mais complexos (integral, etc)

public class Calcular {

    // Gerando resultado do calculo
    public static void Resultado() {
        String input = App.textoInserido;

        // Checa se o input esta vazio ou e invalido
        if (input.isEmpty() || !eInputValido(input)) {
            App.areaTexto.setText("Entrada Inválida");
            return;
        }

        try {
            // Avalia a expressão
            double resultado = avaliarExpressao(input);

            // Atualiza a área de texto com o resultado. 
            App.textoInserido = String.valueOf(App.formatoDecimal.format(resultado));
            App.areaTexto.setText(App.textoInserido);
        } catch (Exception e) {
            App.areaTexto.setText("Erro");
        }
    }

    private static boolean eInputValido(String input) {
        // Adiciona logica para checar se o input e uma expressao matematica valida
        // Pode ser mudado no futuro para ser mais complicado
        return input.matches("[0-9X÷+\\-]*");
    }

    private static double avaliarExpressao(String expression) {
        // Troca os simbolos que usamos graficamente para aqueles usados na programacao
        expression = expression.replace("X", "*").replace("÷", "/");

        // Divide a expressao entre operandos e operadores
        String[] tokens = expression.split("(?<=[-+*/])|(?=[-+*/])");

        double resultado = Double.parseDouble(tokens[0]);

        for (int i = 1; i < tokens.length; i += 2) {
            String operador = tokens[i];
            double proxOperando = Double.parseDouble(tokens[i + 1]);

            switch (operador) {
                case "+":
                    resultado += proxOperando;
                    break;
                case "-":
                    resultado -= proxOperando;
                    break;
                case "*":
                    resultado *= proxOperando;
                    break;
                case "/":
                    if (proxOperando == 0) {
                        throw new ArithmeticException("Divisao por zero");
                    }
                    resultado /= proxOperando;
                    break;
                default:
                    throw new IllegalArgumentException("Operador invalido");
            }
        }

        return resultado;
    }
}