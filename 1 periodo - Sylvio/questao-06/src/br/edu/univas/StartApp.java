package br.edu.univas;
import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float precoGasolina, precoEtanol;
        System.out.println("Insira o preço da gasolina:");
        precoGasolina = scan.nextFloat();
        System.out.println("Insira o preço do etanol:");
        precoEtanol = scan.nextFloat();

        if ((precoEtanol / precoGasolina * 100) > 70) {
            System.out.println("Vale a pena usar gasolina!");
        }
        else {
            System.out.println("Vale a pena usar etanol!");
        }
    }
}
