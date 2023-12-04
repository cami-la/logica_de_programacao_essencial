package src.Bibliotecas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class VerificaDiaDaSemana {

    public LocalDate transformaStringEmLocalDate(String dataCompleta) {
        return LocalDate.parse(dataCompleta);
    }

    public DayOfWeek informaODiaDaSemana(LocalDate data) {
        return data.getDayOfWeek();
    }

    public static void main(String[] args) {
        VerificaDiaDaSemana verificaDiaDaSemana = new VerificaDiaDaSemana();
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a data com o padrão yyyy-MM-dd");
        String dataFornecidaPeloUsuario = teclado.nextLine();

        LocalDate stringParaLocalDate = verificaDiaDaSemana.transformaStringEmLocalDate(dataFornecidaPeloUsuario);

        System.out.println("A data informada foi: " +  stringParaLocalDate);
        
        DayOfWeek informaODiaDaSemana = verificaDiaDaSemana.informaODiaDaSemana(stringParaLocalDate);

        System.out.println("Cami nasceu no dia da semana: " + informaODiaDaSemana);

        teclado.close();
    }
}
