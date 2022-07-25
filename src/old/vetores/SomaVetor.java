package old.vetores;

import java.util.Scanner;

public class SomaVetor {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        double[] numeros = new double[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();
        }

        double soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        double media = soma / numeros.length;

        System.out.println("VALORES = ");
        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + media);

        sc.close();
    }
}
