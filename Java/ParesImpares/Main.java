// 15. Faca um programa que leia valores inteiros positivos e diga, no final, 
// quantos números pares foram lidos, quantos números ímpares foram lidos, o 
// maior numero lido e o menor número lido. A entrada de dados para com a 
// digitação do valor -1.

package ParesImpares;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pares = 0, impares = 0, numeros, num = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite números: ");
        for(numeros = 0; num >= 0; numeros++) {
            num = s.nextInt();
            if(num >= 0) {
                if(num % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
        }
        numeros--;
        System.out.println("Total: " + numeros + "; Pares: " + pares + "; Impares: " + impares);
        s.close();
    }
}
