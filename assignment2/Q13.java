/*
13. The area of a right triangle is 184 cm² and one of its legs is 16 cm long.
 Find the length of other leg.
 */
import java.util.Scanner;
class Test13{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter area=");
        int area=sc.nextInt();
        System.out.print("Enter width=");
        int width=sc.nextInt();
        int length;
        length=(2*area)/width;
        System.out.println("Length="+length);
    }
}