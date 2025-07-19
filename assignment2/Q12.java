/*12. Find the area of a right angled triangle whose
 hypotenuse is 13 cm and one of its sides containing the right angle is 12 cm.
  Find the length of the other side.
 */
import java.util.Scanner;
class Test12{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter hypotenius=");

        int hypotenius=sc.nextInt();
        System.out.print("Enter base=");
        int base=sc.nextInt();
        double height;
        height=Math.sqrt((hypotenius*hypotenius)-(base*base));
        System.out.println("Height is="+height);
        double area;
        area= (1*base*height)/2;
         System.out.println("area of a right angled triangle="+area);


    }
}