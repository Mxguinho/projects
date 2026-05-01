package Calculadora;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int i = 0;
        char operacao;
        float num1, num2, result;
        while(i == 0) {
            System.out.print("\n|   Operação    | Comando |" + 
            "\n---------------------------" +
            "\n|     Soma      |    +    |" + 
            "\n|   Subtração   |    -    |" + 
            "\n| Multiplicação |    *    |" + 
            "\n|    Divisão    |    /    |" + 
            "\n\nEscolha a operação: ");
            
            operacao = s.next().charAt(0);
            if (operacao == '+' || operacao == '-' || operacao == '*' || operacao == '/') {
            } else {
                System.out.println("Operação não identificada!!!");
                continue;
            }

            System.out.print("\nDigite o primeiro número: ");
            num1 = s.nextFloat();
            System.out.print("Digite segundo número: ");
            num2 = s.nextFloat();

            switch (operacao) {
                case '+':
                    result = Soma(num1, num2);
                    break;
                case '-':
                    result = Subtracao(num1, num2);
                    break;
                case '*':
                    result = Multiplicacao(num1, num2);
                    break;
                case '/':
                    result = Divisao(num1, num2);
                    break;
                default:
                    System.out.println("Operação não identificada!!!");
                    continue;
            }
            System.out.println("\nResultado: " + df.format(result));
            System.out.println("\nDeseja continuar s/n?");
            if(s.next().charAt(0) == 'n') {
                i = 1;
            }
        }
        s.close();
    }
    static float Soma(float n1, float n2) {
        float result = n1 + n2;
        return result;
    }
    static float Subtracao(float n1, float n2) {
        float result = n1 - n2;
        return result;
    }
    static float Multiplicacao(float n1, float n2) {
        float result = n1 * n2;
        return result;
    }
    static float Divisao(float n1, float n2) {
        float result = n1 / n2;
        return result;
    }
}