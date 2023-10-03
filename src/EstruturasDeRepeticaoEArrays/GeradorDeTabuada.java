package src.EstruturasDeRepeticaoEArrays;

import java.util.Scanner;

public class GeradorDeTabuada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int tabuada = 0;

        do {
            System.out.print("Informe o número da tabuada entre 1 e 10: ");
            int numeroInformado = teclado.nextInt();

            if (numeroInformado < 1 || numeroInformado > 10) {
                System.out.println("Número inválido " + numeroInformado);
                continue;
            } else {
                tabuada = numeroInformado;
                break;
            }
        } while (true);

        System.out.println("Imprimindo a tabuada de " + tabuada + "...");
        for (int i = 0; i <= 10; i++) {
            int resultado = tabuada * i;
            System.out.println(tabuada + " x " + i + " = " + resultado);
        }

        teclado.close();
    }
}
