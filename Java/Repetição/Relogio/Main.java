package Relogio;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
        LocalDateTime dataHora = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        try {
            while(true) {
            dataHora = LocalDateTime.now();
            System.out.println("Data: " + dataHora.format(fmt));
            Thread.sleep(1000);
        }
        } catch(InterruptedException e) {
            System.out.println("\n\nPrograma interrompido.");
            Thread.currentThread().interrupt();
        }
    }
}

