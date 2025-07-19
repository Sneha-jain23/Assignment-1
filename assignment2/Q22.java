/*
A pond is 50 m long, 30 m wide and 2 m deep.
 Find the capacity of the pond in cubic metre.
 */
import java.util.Scanner;
class Test22{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length=");
        int l=sc.nextInt();
        System.out.println("Enter breadth=");
        int b=sc.nextInt();
        System.out.println("Enter deep=");
         int d=sc.nextInt();
        int volume=l*b*d;
        System.out.println("Volume of a cuboid="+volume);
    }
}