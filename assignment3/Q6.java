/*
6. Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1

 */
import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number=");
        int num=sc.nextInt();
        int res=Math.abs(num);
        System.out.println("Absolute value of a number="+res);
    }
}