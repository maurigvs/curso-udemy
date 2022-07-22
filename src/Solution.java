// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalTime;
import java.util.Timer;

public class Solution {

    public static void main(String[] args){

        //String s = "abbabba";
        //String s = "codility";
        //System.out.println(solution(s));

        /* Exercicio 1 - n26
        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();
        solution2(numero);

        System.out.println();
        System.out.print("Deseja continuar (s/n)? ");
        sc.nextLine();
        flag = sc.nextLine();*/

        /* Exercicio 2 - N26
        int[] a = {2,2,3,4,3,3,2,2,1,1,2,5};
        System.out.println(solution3(a));*/

        /* Exercicio 3 - n26
        int[] A = {1,5,6};
        int F = 4;
        int M = 3;
        int[] result = solution4(A, F, M);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }*/

        /* Exercicio Toptal
        int X = 100;
        int[] B = {10,6,6,8};
        int Z = 2;

        System.out.println(solution5(X, B, Z));*/

        int X = 100;
        System.out.println(solution6(X));

    }

    private static String solution6(int X) {
        
        String duration = null;

        return duration;
    }

    private static int solution5(int X, int[] B, int Z) {

        int downloaded = 0;
        for (int b:B){
            downloaded += b;
        }

        int remaining = X - downloaded;

        int average = 0;
        for (int i = B.length-1; i >= Z; i--) {
            average += B[i];
        }
        average = average / Z;

        int result = remaining / average;

        return result;

    }


    private static int[] solution4(int[] A, int F, int M) {

        int[] result = new int[F];
        int totalRolls = A.length + F;
        int totalRollsSum = M * totalRolls;
        int rollSum = 0;
        for (int i: A) rollSum += i;

        int sumBalance = totalRollsSum - rollSum;


        // How to split the difference between totalRolls and totalRollsSum by F ?



        return result;

    }


    private static int solution3(int[] a) {

        int qtde = 0;

        for (int i = 0; i < a.length; i++) {
            if(i+1 != a.length && a[i] == a[i+1]){
                qtde++;
            }
        }
        return qtde;
    }

    public static void solution2(int N) {
        int enable_print = N % 10;
        while (N > 0) {
            if (enable_print == 0 && N % 10 != 0) {
                enable_print = 1;
            }
            else if (enable_print >= 1) {
                System.out.print(N % 10);
            }
            N = N / 10;
        }
    }

    public static int solution(String S) {

        int result = 0;
        String[] prefixes = new String[S.length()-1];
        String[] sufixes = new String[S.length()-1];
        int cursor = S.length()-1;
        String properResult = null;

        for (int i = 0; i < S.length()-1; i++) {
            prefixes[i] = S.substring(0,cursor);
            cursor--;
            sufixes[i] = S.substring(cursor, S.length());
        }

        for (int i = 0; i < prefixes.length; i++) {
            for (int j = 0; j < sufixes.length; j++) {
                if(prefixes[i].equals(sufixes[i])){
                    if(properResult == null || prefixes[i].length() < properResult.length()){
                        properResult = prefixes[i];
                    }

                    result = properResult.length();
                }
            }
        }

        return result;
    }


}
