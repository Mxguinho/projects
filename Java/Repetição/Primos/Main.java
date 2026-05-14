//Faça um programa em java que encontre os numeros primos presentes entre 1 e 100

package Primos;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> primos = new ArrayList<>();
        int div;
        int l;

        for(int i = 1; i <= 100; i++) {
            div = 0;
            if(primos.size() != 0) {
                for(l = 1; l < i; l++){
                if((i % l == 0) && (l != 1)) {
                    div++;
                    break;
                }
            }
            }
            if(div == 0) {
                primos.add(i);
            }
        }
        System.out.println("Primos até 100: " + primos);
    }
}
