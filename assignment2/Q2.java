/**
  The area of a rectangle is 96 cm².
  If the breadth of the rectangle is 8 cm, 
  find its length and perimeter.
 */
import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter area=");
            int a=sc.nextInt();
            System.out.println("Enter breadth=");
            int b=sc.nextInt();
            int l,p;
            l=a/b;
            System.out.println("Length="+l);
            p=2*(l+b);
            System.out.println("Perimeter="+p);
        
    }
}