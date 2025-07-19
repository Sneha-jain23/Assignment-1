/**
 The perimeter of a rectangle is 230 cm. If the length of the rectangle is 70 cm,
  find its breadth and area.
 */
import java.util.Scanner;
class Test{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length=");
        int l= sc.nextInt();
        System.out.println("Enter the perimeter of rectangle=");
        int p=sc.nextInt();
        int b;
        b=(p/2)-l;
        System.out.println("Breadth is="+b);



    }
}