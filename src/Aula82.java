import util.Account;

import java.util.Scanner;

public class Aula82 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account account;
        double amount;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit? (y/n): ");
        char response = sc.next().charAt(0);

        if (response == 'y'){
            System.out.print("Enter initial deposit value: ");
            amount = sc.nextDouble();
            account = new Account(holder, number, amount);
        } else {
            account = new Account(holder, number);
        }

        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        amount = sc.nextDouble();
        account.deposit(amount);

        System.out.println();
        System.out.print("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        amount = sc.nextDouble();
        account.withdraw(amount);

        System.out.print("Updated account data: ");
        System.out.println(account);

    }
}
