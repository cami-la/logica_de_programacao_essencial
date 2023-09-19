package src.OperadoresEEstruturaCondicional;

import java.util.Scanner;

public class VerificaMaiorNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int numero1 = teclado.nextInt();

        System.out.print("Informe o segundo número: ");
        int numero2 = teclado.nextInt();

        System.out.print("Informe o terceiro número: ");
        int numero3 = teclado.nextInt();

        if(numero1 < 0 || numero2 < 0 || numero3 < 0) {
            System.out.println("Valor inválido!");
        } else {
            if (numero1 > numero2 && numero1 > numero3) {
                System.out.println("O maior número é: " + numero1);
            } else if (numero2 > numero1 && numero2 > numero3) {
                System.out.println("O maior número é: " + numero2);
            } else {
                System.out.println("O maior número é: " + numero3);
            }
        }

        teclado.close();
    }
}
