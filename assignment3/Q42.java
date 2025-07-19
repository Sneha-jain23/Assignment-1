/*
Write a Java program to input basic salary of an employee and 
calculate its Gross salary according to following: 
Basic Salary <= 10000 : HRA = 20%, DA = 80% 
Basic Salary <= 20000 : HRA = 25%, DA = 90% 
Basic Salary > 20000 : HRA = 30%, DA = 95% 

 */
import java.util.Scanner;
class Test1{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double basicSalary, hra, da, grossSalary;

        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();

        if (basicSalary <= 10000) {
            hra = basicSalary * 0.20;
            da = basicSalary * 0.80;
        } else if (basicSalary <= 20000) {
            hra = basicSalary * 0.25;
            da = basicSalary * 0.90;
        } else {
            hra = basicSalary * 0.30;
            da = basicSalary * 0.95;
        }

        grossSalary = basicSalary + hra + da;
        System.out.println("Gross Salary = Rs. " + grossSalary);
    }
}
