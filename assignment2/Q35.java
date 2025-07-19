/*
 Find the surface area of the cylindrical
  solid whose radius is 7.7 cm and height is 12 cm.
 */
import java.util.Scanner;
class Test35{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Radius of cylindrical=");
        float r=sc.nextFloat();
        System.out.print("Enter height=");
        int h=sc.nextInt();
        double s;
        s=2*3.14*r*(r+h);
        System.out.println("surface area of the cylindrical="+s+"cm\u00B2");
    }
}