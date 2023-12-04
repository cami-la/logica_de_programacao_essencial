package src.Bibliotecas;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        //int numeroAleatorio = random.nextInt(11);   
        int numeroAleatorio = random.nextInt(10) + 1;
        int palpite;  
        
        int numeroDeTentativas = 0;

        do {
            System.out.print("Digite seu palpite entre 1 e 10: ");
            palpite = teclado.nextInt();  

            numeroDeTentativas++;

            if(palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou na tentativa '" + numeroDeTentativas + "'");
            } else if (palpite < numeroAleatorio) {
                System.out.println("Tente novamente! O seu palpite foi menor que o número aleatório!");
            } else {
             System.out.println("Tente novamente! O seu palpite foi maior que o número aleatório!");
            }

        } while(numeroAleatorio != palpite);

        System.out.println("Numero aleatório: " + numeroAleatorio);
        System.out.println("Numero palpite: " + palpite);

        teclado.close();     
    }
}
