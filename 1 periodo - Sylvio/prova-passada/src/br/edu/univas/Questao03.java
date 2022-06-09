package br.edu.univas;
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numero = new int[25];

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Digite um número:");
            numero[i] = scan.nextInt();

            if (numero[i] < 0) {
                numero[i] = 0;
            }
        }

        String concat = "";
        for (int i = 0; i < numero.length; i++) {
            if (i != 24) {
                concat += numero[i] + " - ";
            }
            else {
                concat += numero[i];
            }
        }

        System.out.println(concat);
    }
}
