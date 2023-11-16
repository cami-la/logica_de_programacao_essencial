package src.Funcoes;

import java.util.Scanner;

public class ConversorMoedas {
    public double conversorDolarReal(double valorEmDolar, double valorTaxaCambialDolarReal) {
        return valorEmDolar * valorTaxaCambialDolarReal;
    }

    public double conversorRealDolar(double valorEmReal, double valorTaxaCambialRealDolar) {
        return valorEmReal / valorTaxaCambialRealDolar;
    }

    public static void main(String[] args) {
        ConversorMoedas conversor = new ConversorMoedas();
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor em Dolar para converter para Real: ");
        double valorDolarInformado = teclado.nextDouble();

        double resultadoConversorDolarReal = conversor.conversorDolarReal(valorDolarInformado, 5);
        System.out.println("O valor informado em dolar para real é: " + resultadoConversorDolarReal);

        System.out.print("Informe o valor em Real para converter para Dolar: ");
        double valorRealInformado = teclado.nextDouble();

        double resultadoConversorRealDolar = conversor.conversorRealDolar(valorRealInformado, 5);
        System.out.println("O valor informado em real para dolar é: " + resultadoConversorRealDolar);

        teclado.close();
    }
}
