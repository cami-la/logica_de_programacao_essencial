package src.Bibliotecas;

import java.util.Scanner;

public class ContadorDeCaracteres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite qualquer frase: ");
        String stringOferecidaPeloUsuario = teclado.nextLine();

        //TODO: retirar os espaços em branco antes de contar


        int tamanhoDaStringFornecida = stringOferecidaPeloUsuario.length();


        System.out.println("O tamanho da String que o usuário forneceu é: " + tamanhoDaStringFornecida);

        teclado.close();
    }
}
