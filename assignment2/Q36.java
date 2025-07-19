/*
 What is the surface area of a cylinder
  if the diameter is 15m height is 7m?
 */
import java.util.Scanner;
class Test36{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter diameter=");
        int d=sc.nextInt();
        System.out.print("enter height=");
        int h=sc.nextInt();
       
        double r=d/2;
        double s;
        s=2*3.14*r*(r+h);
        System.out.println("surface area of a cylinder="+s);

    }
}