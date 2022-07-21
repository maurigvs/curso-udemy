import util.Calculadora;
import util.CurrencyConverter;

import java.util.Scanner;

public class Aula73 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is the Dollar price?");
        double price = sc.nextDouble();

        System.out.println("How many Dollars will be bought?");
        double amount = sc.nextDouble();

        double reais = CurrencyConverter.converter(price, amount);

        System.out.printf("Amount to be paid in Reais: %.2f%n", reais);


    }
}
