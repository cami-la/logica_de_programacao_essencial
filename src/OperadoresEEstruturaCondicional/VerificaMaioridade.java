package src.OperadoresEEstruturaCondicional;

import java.util.Scanner;

public class VerificaMaioridade {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();

        String mensagem = "";
        if (idade >= 18) {
            mensagem = "Com a idade " + idade + " você tem maioridade!";
        }  else {
            mensagem = "Com a idade " + idade + " você não tem maioridade!";
        }

        System.out.println(mensagem);
        
        teclado.close();
    }
}
