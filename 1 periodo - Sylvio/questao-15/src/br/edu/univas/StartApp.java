package br.edu.univas;
import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("Digite seu peso:");
        float peso = scan.nextFloat();

        System.out.println("Digite sua altura:");
        float altura = scan.nextFloat();
        System.out.println("----------------------------");

        float imc = peso / (altura * altura);

        if (imc < 18.5f) {
            System.out.println("Abaixo do peso");
        }
        else if (imc < 24.9f) {
            System.out.println("Peso normal");
        }
        else if (imc < 29.9f) {
            System.out.println("Sobrepeso");
        }
        else if (imc < 34.9f) {
            System.out.println("Obesidade grau 1");
        }
        else if (imc < 39.9f) {
            System.out.println("Obesidade grau 2");
        }
        else {
            System.out.println("Obesidade grau 3");
        }
    }
}
