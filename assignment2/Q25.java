/*
 100 bricks of length 24 cm and breadth 15 cm are used
  to tile a path of a garden. What is the area of the path?
 */
import java.util.Scanner;
class Test25{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length=");
        int l=sc.nextInt();
        System.out.print("Enter breadth=");
        int b=sc.nextInt();
        System.out.print("Enter total bricks=");
        int total_bricks=sc.nextInt();
        int area=l*b;
        int total_area=area*total_bricks;
        System.out.println("Area of th path="+total_area);


    }
}