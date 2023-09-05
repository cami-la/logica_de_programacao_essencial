package src.TiposDeDadosEVariaveis;

import java.util.Scanner;

public class BoasVindas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        
        String nome = teclado.nextLine();

        System.out.println("Seja bem-vindo(a) " + nome);

        teclado.close();
    } 
}
