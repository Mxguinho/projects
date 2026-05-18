package Java.Cachorro;

import java.util.Scanner;

public class Cachorro {
    Scanner s = new Scanner(System.in);
    private float tamanho;
    private String nome;

    public Cachorro() {
        float tamanho;
        String nome;
        System.out.println("Qual o nome do seu cachorro? ");
        nome = s.next();
        setNome(nome);
        System.out.println("Qual Tamanho do " + nome + " em centimetros de altura? ");
        tamanho = s.nextInt();
        setTamanho(tamanho);
    }

    public void Latir() {
        if(tamanho > 60)
            System.out.println("Wooof, Wooof!");
        else if(tamanho > 20)
            System.out.println("Ruff!, Ruff!");
        else
            System.out.println("Yip!, Yip!");
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
