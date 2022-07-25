package old.exercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Aula106 {

    public static void main(String[] args){

        LocalDate.of(2022, 6, 12);
        LocalDate.parse("2022-06-12");

        // The Date/Time API in Java works with the ISO 8601 format by default, which is (yyyy-MM-dd)
        // We can overwrite it like this
        LocalDate date = LocalDate.parse("2022.06.12", DateTimeFormatter.ofPattern("yyyy.MM.dd"));

        System.out.println(date);

        Scanner sc = new Scanner(System.in);
        sc.close();
    }
}
