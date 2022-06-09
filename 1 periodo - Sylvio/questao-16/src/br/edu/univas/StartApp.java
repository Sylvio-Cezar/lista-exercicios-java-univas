package br.edu.univas;
import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int notas, media = 0;

        for (int i = 0; i < 30; i++) {
            System.out.println("-----------------------------------------------");
            System.out.println("Aluno " + (i + 1) + ", digite sua nota:");
            notas = scan.nextInt();
            media += notas;
        }

        media /= 30;

        System.out.println("-----------------------------------------------");
        System.out.println("A nota média da sala foi de, aproximadamente, " + media + " pontos");
        System.out.println("-----------------------------------------------");
    }
}
