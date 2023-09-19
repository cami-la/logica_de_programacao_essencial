package src.OperadoresEEstruturaCondicional;

import java.util.Scanner;

public class VerificaMaioridadeTernario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idade = teclado.nextInt();

        String mensagem = (idade >= 18) ? "Com a idade " + idade + " você tem maioridade!" 
        : "Com a idade " + idade + " você não tem maioridade!";

        System.out.println(mensagem);

        teclado.close();
    }
}
