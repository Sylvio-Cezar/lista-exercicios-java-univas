package br.edu.univas;

import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int notas;
        float media = 0;

        System.out.println("------------------------------------------");
        System.out.println("Informe seu nome:");
        nome = scan.nextLine();

        for (int i = 1; i <= 4; i++) {
            System.out.println("Informe a " + i + "ª nota:");
            notas = scan.nextInt();
            media += notas;
        }

        media /= 4;

        System.out.println("------------------------------------------");
        if (media > 59) {
            System.out.println("Aluno: " + nome + " | Média final: " + media + " | Status: Aprovado");
        }
        else if (media < 40) {
            System.out.println("Aluno: " + nome + " | Média final: " + media + " | Status: Reprovado");
        }
        else {
            System.out.println("Aluno: " + nome + " | Média final: " + media + " | Status: Recuperação");
        }
        System.out.println("------------------------------------------");

    }
}
