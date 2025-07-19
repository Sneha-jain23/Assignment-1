/*
Find the area of an equilateral triangle, the length of whose sides is 12 cm.
*/
import java.util.Scanner;
class Test9{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter side");

    int s= sc.nextInt();
    double area=(Math.sqrt(3)/4)*s*s;
    System.out.println("Area="+area);
    



    }
}