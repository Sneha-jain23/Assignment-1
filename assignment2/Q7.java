/**
 Find the height of a triangle whose base is 50 cm and whose area is 500 cm².
 */
import java.util.Scanner;
class Test6{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter area=");
    int a= sc.nextInt();
    System.out.println("Enter base=");
    int b=sc.nextInt();
    double h=(2.0/b)*a;
    System.out.println("Hiegth="+h);


    }
}