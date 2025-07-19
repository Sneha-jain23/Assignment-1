/*
W.A.P to convert temperature from Fahrenheit to Celsius and Celsius to Fahrenheit.
For given problem you have to take choice from user. If user enter choice ‘c’ or ‘C’
then convert Fahrenheit to Celsius. If user enter choice ‘f’ or ‘F’ then convert Celsius 
to Fahrenheit. 
 */
import java.util.Scanner;

class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter choice (C/F): ");
        char choice = sc.next().charAt(0);
        if (choice == 'c' || choice == 'C') {
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = sc.nextDouble();
            double c = (f - 32) * 5 / 9;
            System.out.println("Temperature in Celsius: " + c);
        } else if (choice == 'f' || choice == 'F') {
            System.out.print("Enter temperature in Celsius: ");
            double c = sc.nextDouble();
            double f = (c * 9 / 5) + 32;
            System.out.println("Temperature in Fahrenheit: " + f);
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
