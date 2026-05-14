package Fibonacci;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> fibonacci = new ArrayList<>();
        Scanner s = new Scanner(System.in);

        fibonacci.add(1);
        fibonacci.add(1);

        System.out.print("Digite qual número da sequência de Fibonacci você deseja: ");
        int selecao = s.nextInt();
        for(int i = 2; i < selecao; i++) {
            fibonacci.add(fibonacci.get(i - 2) + fibonacci.get(i - 1)); 
        }
        System.out.print("Fibonacci: ");
        System.out.print(fibonacci);
        System.out.println();
        s.close();
    }
}
