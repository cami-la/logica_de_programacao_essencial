package src.OperadoresEEstruturaCondicional;

import java.util.Scanner;

public class VerificaGenero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Infome seu gender: M - masculino ou F - feminino");
        char gender = teclado.nextLine().toUpperCase().charAt(0);

        String mensagem = "";
        switch (gender) {
            case 'M' -> mensagem = "M - masculino";        
            //case 'm' -> mensagem = "M - masculino";
            case 'F' -> mensagem = "F - feminino";
            //case 'f' -> mensagem = "F - feminino";
            default -> mensagem = "Gênero inválido!";
        }

        System.out.println(mensagem);
        teclado.close();
    }
}
