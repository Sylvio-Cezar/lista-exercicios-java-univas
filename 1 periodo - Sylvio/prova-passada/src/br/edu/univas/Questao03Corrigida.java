package br.edu.univas;
import java.util.Scanner;

public class Questao03Corrigida {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numero = new int[5];
        String concat = "";

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Digite um número:");
            numero[i] = scan.nextInt();

            if (numero[i] < 0) {
                numero[i] = 0;
            }
        }


        for (int i = 0; i < numero.length; i++) {
            System.out.print(numero[i]);
            if (i < 4) {
                System.out.print(" - ");
            }
        }
    }
}
