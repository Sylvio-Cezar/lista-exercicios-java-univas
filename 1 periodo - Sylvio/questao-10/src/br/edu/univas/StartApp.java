package br.edu.univas;
import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float altura, pesoIdeal;
        int sexo;

        System.out.println("Informe seu sexo: 1 para homem ou 0 para mulher");
        sexo = scan.nextInt();
        System.out.println("Informe sua altura:");
        altura = scan.nextFloat();

        if (sexo == 0) {
            pesoIdeal = 62.1f * altura - 44.7f;
        }
        else {
            pesoIdeal = 72.7f * altura - 58f;
        }

        System.out.println("Seu peso ideal é: " + pesoIdeal);
    }
}
