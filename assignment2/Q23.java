/*
Find the number of cubical boxes of cubical side 3 cm
 which can be accommodated in carton of dimensions 15 cm × 9 cm × 12 cm.
 */
import java.util.Scanner;
class Test23{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter length=");
        int l=sc.nextInt();
        System.out.println("Enter breadth=");
        int b=sc.nextInt();
        System.out.println("Enter height=");
         int h=sc.nextInt();
         
        int side=3;
        int volume=l*b*h;
        //Volume of one box
        int boxVolume=side*side*side;
        //Total boxes
        int total=volume/boxVolume;
        System.out.println("Total cubical boxes = " + total);

    }
}