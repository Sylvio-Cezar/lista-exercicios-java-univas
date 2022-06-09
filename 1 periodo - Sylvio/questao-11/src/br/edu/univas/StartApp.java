package br.edu.univas;
import java.util.Scanner;

public class StartApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* String nome1, nome2, nome3;
        int nasc1, nasc2, nasc3;

        System.out.println("Digite seu nome e ano de nascimento:");
        nome1 = scan.nextLine();
        nasc1 = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite seu nome e ano de nascimento:");
        nome2 = scan.nextLine();
        nasc2 = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite seu nome e ano de nascimento:");
        nome3 = scan.nextLine();
        nasc3 = scan.nextInt();
        scan.nextLine();

        if (nasc1 < nasc2 && nasc1 < nasc3) {
            System.out.println("Nome: " + nome1);
            System.out.println("Idade: " + (2022 - nasc1));
        }
        else if (nasc2 < nasc1 && nasc2 < nasc3) {
            System.out.println("Nome: " + nome2);
            System.out.println("Idade: " + (2022 - nasc2));
        }
        else {
            System.out.println("Nome: " + nome3);
            System.out.println("Idade: " + (2022 - nasc3));
        } */

        String nomeMaisVelho = "";
        int anoNascMaisVelho = 0;

        for (int i = 0; i <  3; i++) {
            System.out.println("--------------------------------------");
            System.out.println("Digite seu nome:");
            String nome = scan.nextLine();

            System.out.println("Digite seu ano de nascimento:");
            int anoNasc = scan.nextInt();
            scan.nextLine();
            System.out.println("--------------------------------------");

            if (i == 0 || anoNasc < anoNascMaisVelho) {
                nomeMaisVelho = nome;
                anoNascMaisVelho = anoNasc;
            }
        }

        System.out.println("--------------------------------------");
        System.out.println("Nome do mais velho: " + nomeMaisVelho);
        System.out.println("Idade do mais velho: " + (2022 - anoNascMaisVelho - 1) + " ou " + (2022 - anoNascMaisVelho));
        System.out.println("--------------------------------------");

    }
}
