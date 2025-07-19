/*
1. Take values of length and breadth of a rectangle from user and check if it is square or not.

 */
import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length=");
        int l=sc.nextInt();
        System.out.print("Enter breadth=");
        int b=sc.nextInt();
        if(l==b){
            System.out.println("It is square.");
        }
        else
            System.out.println("It's not square");

    }
}