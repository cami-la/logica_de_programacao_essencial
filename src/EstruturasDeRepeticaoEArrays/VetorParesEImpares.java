package src.EstruturasDeRepeticaoEArrays;

import java.util.Scanner;

public class VetorParesEImpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i = 0; i < 5; i = i + 1) {
            System.out.print("Informe o " + (i + 1) + "o. número: ");
            numeros[i] = teclado.nextInt();
        }

        System.out.print("Todos Números informados: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        System.out.println("\n*********\n");

        System.out.print("Todos os números pares informados: ");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
            }
        }

        System.out.println("\n*********\n");

        System.out.print("Todos os números ímpares informados: ");
        for (int numero : numeros) {
            if (numero % 2 != 0) {
                System.out.print(numero + " ");
            }
        }

        teclado.close();
    }
}
