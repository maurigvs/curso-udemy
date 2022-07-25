package org.udemy.apps;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Secao17 {

    public static void main(String[] args) {

        File file = new File("/Users/mauri/temp/file.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine())
                System.out.println(sc.nextLine());
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            if(sc != null) sc.close();
        }
    }
}
