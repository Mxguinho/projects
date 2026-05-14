// Jogo de Adivinhação: O computador escolhe um número aleatório e o usuário tenta adivinhar. 
// O loop só para quando o usuário acerta, dando dicas de "maior" ou "menor" a cada tentativa.

package JogoAdivinha;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner s = new Scanner(System.in);
        int numeroAleatorio, certo = 0, tentativa;
        while(certo != 1) {
        numeroAleatorio = random.nextInt(26);    
        System.out.print("Tente imaginar o número que estou pensando: ");
        tentativa = s.nextInt();
        if(tentativa == numeroAleatorio) {
            certo = 1;
            System.out.println("acertou!!!");
            break;
        }
        System.out.println("Errou!!! O que eu estava pensando era " + numeroAleatorio + "\n");
        }
        s.close();
    }
}
