/**
  Find the area of an isosceles right angled triangle of equal sides 15 cm each.
 */
import java.util.Scanner;
class Q10{
    public static void main(String args[]){

       
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter side=")
       int side=sc.nextInt();
       float area;
       area=(1/2.0f)*side*side;
       System.out.println("area of an isosceles right angled triangle:"+area); 
    }
}