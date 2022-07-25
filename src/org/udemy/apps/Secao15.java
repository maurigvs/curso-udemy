package org.udemy.apps;

import org.udemy.entities.Account;
import org.udemy.exceptions.BusinessException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Secao15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();

            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account ac = new Account(number, holder, balance, withdrawLimit);
            System.out.println();

            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();

            ac.withdraw(amount);
            System.out.print("New balance: " + ac.getBalance());

        } catch (InputMismatchException e1) {
            System.out.println("Invalid input data");

        } catch (BusinessException e2){
            e2.printMessage();
        }

        sc.close();
    }
}
