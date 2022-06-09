package br.edu.univas;
import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float salMensal, faixa = 0;

        System.out.println("-------------------------------------------------");
        System.out.println("Informe seu salário mensal: ");
        salMensal = scan.nextFloat();

        if (salMensal <= 1903.98) {
            faixa = 0;
        }
        else if (salMensal <= 2826.66) {
            faixa = 7.5f;
        }
        else if (salMensal <= 3751.05) {
            faixa = 15.0f;
        }
        else if (salMensal <= 4664.68) {
            faixa = 22.5f;
        }
        else {
            faixa = 27.5f;
        }

        System.out.println("-------------------------------------------------");
        if (faixa == 0) {
            System.out.println("Você se enquadra como isento do IR");
        }
        else {
            System.out.println("Você se enquadra na faixa de: " + faixa + "% do IR");
        }
        System.out.println("-------------------------------------------------");
    }
}
