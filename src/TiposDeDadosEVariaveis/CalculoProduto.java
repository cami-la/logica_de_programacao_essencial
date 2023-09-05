package src.TiposDeDadosEVariaveis;

import java.util.Scanner;

public class CalculoProduto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nomeDoProduto = teclado.nextLine();

        double valorUnitarioProduto = teclado.nextDouble();

        int quantidadeProduto = teclado.nextInt();

        double valorTotalProduto = valorUnitarioProduto * quantidadeProduto;

        System.out.println("O Produto " + nomeDoProduto + " com o valor unitario R$ " + valorUnitarioProduto + " com a quantidade " +  quantidadeProduto + " custará o total de R$ " + valorTotalProduto);

        teclado.close();
    }
}
