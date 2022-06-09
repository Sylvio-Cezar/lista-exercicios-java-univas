package br.edu.univas;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] idades = new int[1000];
        int i = 1;
        int f1 = 0, f2 = 0, f3 = 0, f4 = 0, fT = 0;

        for (; i <= idades.length; i++) {
            System.out.println("Participante " + i + ", digite sua idade:");
            int idade = scan.nextInt();

            if (idade == -1) { break; }
            else {
                idades[i] = idade;
            }

            if (idades[i] >= 0 && idades[i] <= 12) {
                f1++;
            }
            else if (idades[i] <= 17) {
                f2++;
            }
            else if (idades[i] <= 60) {
                f3++;
            }
            else {
                f4++;
            }

            fT += 1;
        }

        System.out.println("Idades entre 0 e 12 anos: " + f1 + " | Porcentagem: " + (f1 * 100/fT) + "%");
        System.out.println("Idades entre 13 e 17 anos: " + f2 + " | Porcentagem: " + (f2 * 100/fT) + "%");
        System.out.println("Idades entre 18 e 60 anos: " + f3 + " | Porcentagem: " + (f3 * 100/fT) + "%");
        System.out.println("Idades acima de 60 anos: " + f4 + " | Porcentagem: " + (f4 * 100/fT) + "%");
    }
}
