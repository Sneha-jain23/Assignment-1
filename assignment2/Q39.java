/*Find the surface of the cylinder if its diameter is 12 centimeters
and its height is 9 centimeters.
 */
import java.util.Scanner;
class Test39{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter diameter=");
        int d=sc.nextInt();
        System.out.print("Enter height=");
        int h=sc.nextInt();
        int r=d/2;
        double area=2*3.14*r*(r+h);
        System.out.println("Surface area of the cylinder="+area);

    }
}