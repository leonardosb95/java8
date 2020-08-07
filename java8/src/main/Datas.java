package main;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Datas {

    public static void main(String[] args){


        LocalDate hoje= LocalDate.now();
        LocalDate olimpiadasRio=LocalDate.of(2016,Month.JUNE,5);

        LocalDate proximasOlimpiadas=olimpiadasRio.plusYears(4);//Criando uma nova instancia

//        System.out.println(proximasOlimpiadas);





//        System.out.println(hoje.minusYears(1));
//        System.out.println(hoje.minusMonths(4));
//        System.out.println(hoje.minusDays(2));
//
//
//        System.out.println(hoje.plusYears(1));
//        System.out.println(hoje.plusMonths(4));
//        System.out.println(hoje.plusDays(2));


        int anos=olimpiadasRio.getYear()-hoje.getYear();



        Period periodo=Period.between(hoje,olimpiadasRio);
//        System.out.println(periodo.getYears());
//        System.out.println(periodo.getMonths());
//        System.out.println(periodo.getDays());


        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String valorFormatado=proximasOlimpiadas.format(formatador);
        //System.out.println(valorFormatado);

        DateTimeFormatter formatadorComHoras=DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        LocalDateTime agora=LocalDateTime.now();
       // System.out.println(agora.format(formatadorComHoras));

        YearMonth anoEMes=YearMonth.of(2015,Month.JANUARY);

        LocalTime intervalo=LocalTime.of(12,30);
        System.out.println(intervalo);

    }


}
