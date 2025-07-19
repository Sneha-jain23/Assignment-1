/**
 Find the area of a triangle, sides of which are 10 cm 
 and 9 cm and the perimeter 36 cm.
 */
import java.util.Scanner;
class Test5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 :");
        int side1 = sc.nextInt();
        System.out.print("enter side 2 : ");
        int side2 = sc.nextInt();
        System.out.print("entre perimeter : ");
        int p = sc.nextInt();
        int side3;
        side3 = p - side1 - side2;
        double s = p/2.0;
        double area = Math.sqrt((s*(s-side1)*(s-side2)*(s-side3)));
        System.out.println("the area is : "+area);

    }

}