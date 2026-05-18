package Java.Cachorro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cachorro> cachorros = new ArrayList<>();
        int i = 0;

        do {
            Cachorro cachorro = new Cachorro();
            cachorros.add(cachorro);
            cachorros.get(i).Latir();
            System.out.println(cachorros.get(i).getNome());
            i++;
        } while (!cachorros.get(i - 1).getNome().equals("bob"));
    }
}
