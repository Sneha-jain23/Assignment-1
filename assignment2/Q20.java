/**
 20. What is the volume of a brick of ice-cream with length 25 cm, 
 breadth 10 cm and height 8 cm?
 */
import java.util.Scanner;
class Test20{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length=");
        int l=sc.nextInt();
        System.out.print("Enter base=");
        int b=sc.nextInt();
        System.out.print("Enter height=");
        int h=sc.nextInt();
        int volume=l*b*h;
        System.out.println("the volume of a brick of ice-cream is="+volume+"cm\u00B2");
    }
}