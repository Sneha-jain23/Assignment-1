/**
 14. The length of one of the diagonals of a field in the form of
  a quadrilateral is 46 m. The perpendicular distance of the other two vertices
   from the diagonal are 13 m and 10 m, find the area of the field.
 */
import java.util.Scanner;
class Test14{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter height=");
        int h=sc.nextInt();
        System.out.print("Enter first vertices=");
        int b1=sc.nextInt();
        System.out.print("Enter second vertices=");
        int b2=sc.nextInt();
        double T1=(1*b1*h)/2;
        double T2=(1*b2*h)/2;
        double area=T1+T2;
        System.out.println("Area of the field="+area+"m\u00B2");

    }
}