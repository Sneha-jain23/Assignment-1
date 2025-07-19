/*
Find the cost of polishing the base of a cone whose height is 4cm and
slant height 5 cm at the rate of 10 rs. Per sq. cm
*/
import java.util.Scanner;
class Test43{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter height=");
        int height=sc.nextInt();
        System.out.print("Enter slant height=");
        int Slant_height=sc.nextInt();
        System.out.print("Enter polishing rate of per square cm=");
        int polishing_rate=sc.nextInt();
        double radius;
        radius=Math.sqrt(Slant_height*Slant_height-height*height);
        double area;
        area=(22*radius*radius)/7;
        System.out.println("Area of base of cone="+area+"cm\u00B2");
        double cost=area*polishing_rate;
        System.out.println("Cost of polishing="+cost+"cm\u00B2");
    }
}