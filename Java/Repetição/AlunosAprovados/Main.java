// 10. Faça um algoritmo e o programa em C que receba duas notas de cinco 
// alunos, calcule e mostre:
//  a) a média aritmética das duas notas de cada aluno;
//  b) a mensagem que está na tabela a seguir:
// Média Aritmética Mensagem
// Até 3 Reprovado
// Entre 3 e 7 Exame
// Acima de 7 Aprovado
// O total de alunos aprovados, de exame e reprovados; a média da classe.

package AlunosAprovados;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float[] notas = new float[10], media = new float[5];
        int aprovado = 0, exame = 0, reprovado = 0;

        for(int i = 1; i <= 5; i++) {
            for(int o = 1; o <= 2; o++) {
                System.out.print("Digite a " + o + "ª nota do " + i + "ª aluno: ");
                notas[(i * 2) - o] = s.nextFloat();
            }
            media[i - 1] = (notas[(i * 2) - 1] + notas[(i * 2) - 2]) / 2;

            if(media[i - 1] <= 3) {
                reprovado++;
            } else if(media[i - 1] > 3 && media[i - 1] < 7) {
                exame++;
            } else if(media[i - 1] >= 7) {
                aprovado++;
            }
        }
        System.out.print("\t|Nota 1 |Nota 2 | Média |\n");
        for(int i = 1; i <= 5; i++) {
            System.out.print("\t|  "+ notas[(i * 2) - 1] + "  |  " + notas[(i * 2) - 2] + "  |  " + media[i - 1] + "  |\n");
        }
        System.out.println("\nAté 3 Reprovado" + 
                        "\nEntre 3 e 7 Exame" + 
                        "\nAcima de 7 Aprovado\n");
        System.out.println("reprovados: " + reprovado + " Em exame: " + exame + " Aprovados: " + aprovado);

        s.close();
    }
}
