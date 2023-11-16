package src.Funcoes;

import java.util.Scanner;

public class CalculadoraIMC {
    /*
     * IMC = Peso ÷ (Altura × Altura)
     */
    public double calculaIMC(double pesoEmKg, double alturaEmMetros) {
        return pesoEmKg / (alturaEmMetros * alturaEmMetros);
    }

    public static void main(String[] args) {
        CalculadoraIMC calculadora = new CalculadoraIMC();
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe seu peso em Kg: ");
        double pesoInformado = teclado.nextDouble();

        System.out.print("Informe sua altura em metros: ");
        double alturaInformada = teclado.nextDouble();

        double resultadoIMC = calculadora.calculaIMC(pesoInformado, alturaInformada);

        System.out.println("O IMC do usuário é: " + resultadoIMC);

        teclado.close();
    }
}
