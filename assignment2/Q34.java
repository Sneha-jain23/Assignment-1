/*
A wooded area is in the shape of a a trapezoid whose
bases measure 128 m and 92 m and its height is 40 m.
A 4 m wide walkway is constructed which runs perpendicular to the two bases.
Calculate the area of the wooded area after the addition of the walkway.
 */
import java.util.Scanner;
class Test34{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base1= ");
        int b1=sc.nextInt();
        System.out.print("Enter base2=");
        int b2=sc.nextInt();
        System.out.print("Enter height=");
        int h=sc.nextInt();
        double trapezoid_area=0.5*(b1+b2)*h;
       
        double walk_way_width=4;
        double walk_way_length=40;
        double walk_way_area=walk_way_length*walk_way_width;
        double total_area=trapezoid_area+walk_way_area;
        System.out.println("Area of trapezoid =" +trapezoid_area);
        System.out.println("Area of walkway =" +walk_way_area);
        System.out.println("Total area =" +total_area );

    }
}