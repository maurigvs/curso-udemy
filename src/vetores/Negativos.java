package vetores;

import java.util.Scanner;

public class Negativos {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] numeros = new int[n];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");

        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] < 0){
                System.out.println(numeros[i]);
            }
        }
        

        sc.close();
    }
}
