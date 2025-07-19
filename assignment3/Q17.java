/*
WAP to calculate area of rectangle
*/
import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length=");
        int l=sc.nextInt();
        System.out.print("Enter breadth=");
        int b=sc.nextInt();
        int area=l*b;
        System.out.println("Area of rectangle="+area+"cm\u00B2");
    }
}