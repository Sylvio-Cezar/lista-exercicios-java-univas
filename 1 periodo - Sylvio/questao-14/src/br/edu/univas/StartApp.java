package br.edu.univas;
import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scan.nextLine();

        System.out.println("Digite a quantidade de horas que você trabalha:");
        int horas = scan.nextInt();

        System.out.println("Digite quanto você ganha por hora:");
        float valor = scan.nextFloat();

        System.out.println("Sr(a) " + nome + " irá receber R$ " + (horas * valor));
    }
}
