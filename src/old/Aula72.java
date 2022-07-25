package old;

import old.util.Calculadora;

import java.util.Scanner;

public class Aula72 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o Raio: ");
        double raio = sc.nextDouble();

        double c = Calculadora.circunferencia(raio);
        double v = Calculadora.volume(raio);

        System.out.printf("Circunferencia : %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor do PI: %.2f%n", Calculadora.PI);

    }
}
