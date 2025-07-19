/*
 Calculate the volume of the cylinder: r = 5 cm, h = 9 cm
 */
import java.util.Scanner;
class Test40{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter r=");
        int r=sc.nextInt();
        System.out.print("Enter h=");
        int h=sc.nextInt();
        float volume=(22/7)*r*r*h;
        System.out.println("Volume of cylinder="+volume);
    }
}