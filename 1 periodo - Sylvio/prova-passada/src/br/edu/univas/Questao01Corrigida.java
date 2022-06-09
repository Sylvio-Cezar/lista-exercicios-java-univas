package br.edu.univas;
import java.util.Scanner;

public class Questao01Corrigida {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] idades = new int[1000];
        int idadeAtual = 0;
        int cont = 0;

        int cont0A12Anos = 0;
        int cont13A17Anos = 0;
        int cont18A60Anos = 0;
        int contAcima60Anos = 0;

        do {
            System.out.println("Digite sua idade:");
            idadeAtual = scan.nextInt();
            if (idadeAtual != -1) {
                idades[cont++] = idadeAtual;
            }

            /*if (idadeAtual >= 0 && idadeAtual <= 12) {
                cont0A12Anos++;
            }
            else if (idadeAtual <= 17) {
                cont13A17Anos++;
            }
            else if (idadeAtual <= 60) {
                cont18A60Anos++;
            }
            else {
                contAcima60Anos++;
            } */

        } while (idadeAtual != -1);

        for (int i = 0; i < cont; i++) {
            if (idades[i] >= 0 && idades[i] <= 12) {
                cont0A12Anos++;
            }
            else if (idades[i] <= 17) {
                cont13A17Anos++;
            }
            else if (idades[i] <= 60) {
                cont18A60Anos++;
            }
            else {
                contAcima60Anos++;
            }
        }

        System.out.println("Idades entre 0 e 12 anos: " + cont0A12Anos + " | Porcentagem: " + (cont0A12Anos * 100/cont) + "%");
        System.out.println("Idades entre 13 e 17 anos: " + cont13A17Anos + " | Porcentagem: " + (cont13A17Anos * 100/cont) + "%");
        System.out.println("Idades entre 18 e 60 anos: " + cont18A60Anos + " | Porcentagem: " + (cont18A60Anos * 100/cont) + "%");
        System.out.println("Idades acima de 60 anos: " + contAcima60Anos + " | Porcentagem: " + (contAcima60Anos * 100/cont) + "%");
    }
}
