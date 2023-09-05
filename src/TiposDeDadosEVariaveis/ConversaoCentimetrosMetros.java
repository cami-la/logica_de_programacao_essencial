package src.TiposDeDadosEVariaveis;

import java.util.Scanner;

public class ConversaoCentimetrosMetros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor em centímetros: ");
        double valorCentimetros = teclado.nextDouble();

        double valorMetro = valorCentimetros / 100;

        System.out.println("O valor " + valorCentimetros + " em metros é: " + valorMetro);

        teclado.close();
    }
    
}
