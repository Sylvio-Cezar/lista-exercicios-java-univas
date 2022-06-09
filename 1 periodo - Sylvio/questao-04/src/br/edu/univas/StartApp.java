package br.edu.univas;
import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int X, Y, Z;

        System.out.println("Digite dois valores: ");
        X = scan.nextInt();
        Y = scan.nextInt();
        Z = X % Y;

        if (Z == 0) {
            System.out.println("Divisão de " + X + " por " + Y + " é perfeita!");
        }
        else {
            System.out.println("Divisão de " + X + " por " + Y + " sobra " + Z);
        }
    }
}
