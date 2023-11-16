package src.Funcoes;

import java.util.Scanner;

public class ConversorTemperatura {
    /*
     * F = C x 1,8 + 32.
     */
    public double conversorCelsiusFahrenheit(double temperaturaEmCelsius) {
        return (temperaturaEmCelsius * 1.8) + 32;
    }

    /*
     * °C = (°F − 32) ÷ 1,8. 
     */
    public double conversorFahrenheitCelsius(double temperaturaEmFahrenheit){
        return (temperaturaEmFahrenheit - 32) / 1.8;
    }
    
    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe a temperatura em °C: ");
        double temperaturaEmCelsiusInformada = teclado.nextDouble();

        double resultadoCelsiusFahrenheit = conversor.conversorCelsiusFahrenheit(temperaturaEmCelsiusInformada);
        System.out.println("A conversão °C -> °F: " + resultadoCelsiusFahrenheit);

        System.out.print("Informe a temperatura em °F: ");
        double temperaturaEmFahrenheiInformada = teclado.nextDouble();

        double resultadoFahrenheitCelsius =  conversor.conversorFahrenheitCelsius(temperaturaEmFahrenheiInformada);
        System.out.println("A conversão °F -> °C: " + resultadoFahrenheitCelsius);

        teclado.close();
    }
}
