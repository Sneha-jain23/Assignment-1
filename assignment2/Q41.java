/*
I need to calculate the cylinder volume with a height of 50 cm
and a diameter of 30 cm.
*/
import java.util.Scanner;
class Test41{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter diameter=");
        int d=sc.nextInt();
        System.out.print("Enter height=");
        int h=sc.nextInt();
        
        int r=d/2;
        
        double area=(22/7)*r*r*h;
        System.out.println("Volume of cylinder="+area);
    }
}