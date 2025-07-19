/*
 Find the Volume of Cylinder whose diameter and height are 2.25cm
 */
import java.util.Scanner;
class Test42{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter diameter=");
        float d=sc.nextFloat();
        float r=d/2;
        System.out.print("Enter height=");
        float h=sc.nextFloat();
        float volume=(22/7)*r*r*h;
        System.out.println("Volume of cylinder="+volume);
    }
}