/*
The base and height of a triangle are in the ratio 8 : 5 
and its area is 320 m². Find the height and base of the triangle.
 */
import java.util.Scanner;

 class Q11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter area: ");
        double area = sc.nextDouble();

        System.out.print("Enter base: ");
        int baseR = sc.nextInt();

        System.out.print("Enter height: ");
        int heightR = sc.nextInt();

        double Rarea = 0.5 * baseR * heightR;

        double onepart = area / Rarea;
        double base = baseR * onepart;
        double height = heightR * onepart;

        System.out.println("Height = " + height);
        System.out.println("Base = " + base);
    }
}
