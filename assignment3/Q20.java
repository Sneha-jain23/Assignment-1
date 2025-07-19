/*
WAP to exchange value of two variable without using third variable and arithmetic operator
 */
import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a=");
        int a=sc.nextInt();
        System.out.print("Enter the value of =b");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After exchange a="+a+" and b="+b);
    }
}