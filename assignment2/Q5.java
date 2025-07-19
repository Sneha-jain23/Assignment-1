/**
 If it costs 1600 rs. to fence a rectangular park of length 20 m at the rate
  of 25 rs. per m², find the breadth of the park and its perimeter.
   Also, find the area of the field.
 */
import java.util.Scanner;
class Test4{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter costs=");
        int cost=sc.nextInt();
        System.out.print("Enter rate of per m\u00B2");
        int rate=sc.nextInt();
        int p=cost/rate;
        System.out.print("Enter length=");
        int l=sc.nextInt();
        int b;
        b=(p/2)-l;
        System.out.println("Breadth is="+b);
        int area=l*b;
        System.out.println("Area is="+area);
    }

}