/*
 The surface of the cylinder is 149 cm². 
 The cylinder height is 6 cm. What is the diameter of this cylinder?
 */
import java.util.Scanner;
class Test37{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter surface of the cylinder= ");
        int s=sc.nextInt();
        System.out.print("Entercylinder height=");
        int h=sc.nextInt();
        double r;
        double pi=3.14;
       // r*(r+h)=(s/2*pi);

        double value=s/(2*pi);
        double a=1,b=h,c=-value;
        double d=Math.sqrt(b*b-4*a*c);
        r=(-b+d)/(2*a);
        System.out.println("Radius="+r);
        double diameter=2*r;

        System.out.println("Diameter="+diameter);

    }
}