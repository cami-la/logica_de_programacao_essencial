package src.Bibliotecas;

import java.time.Year;
import java.util.Scanner;

public class VerificaAnoBissexto {

    public boolean ehBissexto(int ano) {
        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            return true;
        } else { 
            return false;
        }
    }

    public boolean ehBissextoComYear(int ano) {
        return Year.isLeap(ano);
    }

    public static void main(String[] args) {
        VerificaAnoBissexto verificaNumeroBissexto = new VerificaAnoBissexto();

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o ano que será verificado: ");
        int anoInformadoPeloUsuario = teclado.nextInt();

        boolean ehBissexto = verificaNumeroBissexto.ehBissexto(anoInformadoPeloUsuario);

        System.out.println("O ano " + anoInformadoPeloUsuario + " é bissexto? " + ehBissexto);

        System.out.println("-----------------------------");

        boolean ehBissextoComYear = verificaNumeroBissexto.ehBissextoComYear(anoInformadoPeloUsuario);

        System.out.println("O ano " + anoInformadoPeloUsuario + " é bissexto? " + ehBissextoComYear);


        teclado.close();
    }
}
