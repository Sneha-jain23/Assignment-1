/*
Write a Java program to count total number of notes in given amount. 
 */
import java.util.Scanner;
class Test1{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();
        
        int notes2000 = amount / 2000;
        amount = amount % 2000;
        
        int notes500 = amount / 500;
        amount = amount % 500;
        
        int notes200 = amount / 200;
        amount = amount % 200;
        
        int notes100 = amount / 100;
        amount = amount % 100;
        
        int notes50 = amount / 50;
        amount = amount % 50;
        
        int notes20 = amount / 20;
        amount = amount % 20;
        
        int notes10 = amount / 10;
        amount = amount % 10;
        
        int notes5 = amount / 5;
        amount = amount % 5;
        
        int notes2 = amount / 2;
        amount = amount % 2;
        
        int notes1 = amount;

        System.out.println("2000 notes: " + notes2000);
        System.out.println("500 notes: " + notes500);
        System.out.println("200 notes: " + notes200);
        System.out.println("100 notes: " + notes100);
        System.out.println("50 notes: " + notes50);
        System.out.println("20 notes: " + notes20);
        System.out.println("10 notes: " + notes10);
        System.out.println("5 notes: " + notes5);
        System.out.println("2 notes: " + notes2);
        System.out.println("1 notes: " + notes1);
    }
}
