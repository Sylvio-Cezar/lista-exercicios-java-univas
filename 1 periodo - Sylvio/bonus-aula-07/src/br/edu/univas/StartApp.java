package br.edu.univas;
import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float somaTotal = 0;
        int max = 20;
        int[] notas = new int[max];

        for (int i = 0; i < max; i++) {
            System.out.println("Digite a " + (i + 1) + "ª nota:");
            notas[i] = scan.nextInt();
            somaTotal += notas[i];
            System.out.println("----------------------------------");
        }

        System.out.println("Notas digitadas:");
        for (int i = 0; i < max; i++) {
            System.out.println((i + 1) + "ª nota: " + notas[i]);
        }
        System.out.println("----------------------------------");

        somaTotal /= max;
        System.out.println("Média total: " + somaTotal + " pontos");
        System.out.println("----------------------------------");
    }
}
