/*
The cylinder has a volume of 1287.
The base has a radius 10. What is the area of the surface of the cylinder?
 */
import java.util.Scanner;
class Test38{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter volume of cylinder=");
        int v=sc.nextInt();
        System.out.print("Enter radius=");
        int r=sc.nextInt();
        double h;
        h=v/(3.14*r*r);
        double area;
        area=2*3.14*r*(r+h);
        System.out.println("Surface area of cylinder="+area);
    }

}
