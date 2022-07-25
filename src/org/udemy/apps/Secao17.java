package org.udemy.apps;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Secao17 {

    public static void main(String[] args) {

        // aula215();
        aula218();
    }

    public static void aula218(){

        String[] lines = new String[] {
                "Good morning",
                "Good afternoon",
                "Good night"
        };

        String path = "/Users/mauri/temp/output.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void aula215(){

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
