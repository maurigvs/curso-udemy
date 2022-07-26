package org.udemy.apps;

import org.udemy.entities.Product;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Secao17 {

    public static void main(String[] args) {

        //aula215();
        //aula218();
        //aula219();
        //aula220();
        exercicioProposto();
    }

    private static void exercicioProposto() {

        List<Product> products = new ArrayList<>();
        products.add(new Product("TV LED", 1290.99, 1));
        products.add(new Product("Video Game Chair", 350.00, 3));
        products.add(new Product("Iphone X", 900.00, 2));
        products.add(new Product("Samsung Galaxy 9", 9850.00, 2));

        String path = "/Users/mauri/temp/output_2.txt";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (Product p : products){
                bw.write(p.toString());
                bw.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }


    public static void aula220(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        // Imprime atribuitos do objeto File

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());

        sc.close();
    }

    public static void aula219(){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        // Imprime os diretórios dentro de um diretório

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("Folders: ");
        for(File folder : folders){
            System.out.println(folder);
        }

        // Imprime os arquivos de um diretório

        File[] files = path.listFiles(File::isFile);
        for(File file : files){
            System.out.println(file);
        }

        boolean success = new File(strPath + "/subdir").mkdir();
        System.out.println("Directory created successfully: " + success);

        sc.close();
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
