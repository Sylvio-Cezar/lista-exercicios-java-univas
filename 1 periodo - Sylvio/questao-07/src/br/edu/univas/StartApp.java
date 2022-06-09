package br.edu.univas;
import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1, num2, num3, num4, num5, somaPares = 0;

        System.out.println("Digite 5 números:");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        num4 = scan.nextInt();
        num5 = scan.nextInt();

        if (num1 % 2 == 0) { somaPares += num1; }
        if (num2 % 2 == 0) { somaPares += num2; }
        if (num3 % 2 == 0) { somaPares += num3; }
        if (num4 % 2 == 0) { somaPares += num4; }
        if (num5 % 2 == 0) { somaPares += num5; }

        System.out.println("Soma dos valores pares: " + somaPares);

    }
}
