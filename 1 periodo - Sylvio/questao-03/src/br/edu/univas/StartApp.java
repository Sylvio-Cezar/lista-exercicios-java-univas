package br.edu.univas;
import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("--------------------------------");
        System.out.println("Digite sua idade: ");
        int idade = scan.nextInt();
        System.out.println("--------------------------------");

        if (idade <= 7) {
            System.out.println("Infantil A");
        }
        else if (idade <= 10) {
            System.out.println("Infantil B");
        }
        else if (idade <= 13) {
            System.out.println("Juvenil A");
        }
        else if (idade <= 17) {
            System.out.println("Juvenil B");
        }
        else if (idade <= 60) {
            System.out.println("Adulto");
        }
        else {
            System.out.println("Sênior");
        }
        System.out.println("--------------------------------");
    }
}
