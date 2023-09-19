package src.OperadoresEEstruturaCondicional;

import java.util.Scanner;

public class VerificaNumeroPositivo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = teclado.nextInt();

        if (numero >= 0) {
            System.out.println("Este número '" + numero + "' é positivo!");
        }

        teclado.close();
    }
}
