package src.Funcoes;

import java.util.Scanner;

public class VerificaSinalDeNumero {

    public char verificarSinal(int numero) {
        return (numero > 0) ? 'P' : 'N';
    }

    public static void main(String[] args) {
        VerificaSinalDeNumero verificaSinalDeNumero = new VerificaSinalDeNumero();
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o número para ser verificado: ");
        int numeroInformado = teclado.nextInt();

        System.out.println(verificaSinalDeNumero.verificarSinal(numeroInformado));

        teclado.close();
    }
}
