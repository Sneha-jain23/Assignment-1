/*
Write a Java program that keeps a number from the user and 
generates an integer between 1 and 7 and displays the name of the weekday.
Test Data
Input number: 3
Expected Output :
Wednesday
*/
import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number 1-7 :");
        int num=sc.nextInt();
        if(num==1)
        System.out.println("Monday");
        else if(num==2)
        System.out.println("Tuesday");
        else if(num==3)
        System.out.println("Wednesday");
        else if(num==4)
        System.out.println("Thursday");
        else if(num==5)
        System.out.println("Friday");
       else if(num==6)
        System.out.println("Saturday");
        else if(num==7)
        System.out.println("Sunday");
        else
        System.out.println("please enter number 1-7.");
    }
}