/*
WAP to exchange value to two variable with third variable and without third variable

   // Bitwise ^ operator
*/
import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number=");
        int a=sc.nextInt();
        System.out.print("Enter 2nd number=");
        int b=sc.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After exchange a="+a+" and b="+b);
    }
}