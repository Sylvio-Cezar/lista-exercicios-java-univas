package br.edu.univas;
import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first, second, aux;

        System.out.println("Insira 2 valores inteiros:");
        System.out.println("Primeiro:");
        first = scan.nextInt();
        System.out.println("Segundo:");
        second = scan.nextInt();

        aux = first;
        first = second;
        second = aux;

        System.out.println("Valores invertidos: Primeiro = " + first + " | Segundo = " + second);

    }
}
