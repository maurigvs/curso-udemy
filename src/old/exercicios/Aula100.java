package old.exercicios;

import old.util.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula100 {

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i+1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            list.add(new Employee(id, name, salary));
            System.out.println();
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        n = sc.nextInt();

        System.out.print("Enter the percentage: ");
        double perc = sc.nextDouble();

        // bicha, melhore (esse FOR) !!!
        for (Employee e: list){
            if(e.getId()==n){
                e.increaseSalary(perc);
                break;
            }
        }

        for(Employee e : list){
            System.out.println(e.getId() + ", " + e.getName() + ", " + e.getSalary());
        }

        sc.close();
    }
}
