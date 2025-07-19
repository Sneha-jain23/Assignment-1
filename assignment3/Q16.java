/*
 WAP to calculate area of circle
 */
import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius=");
        int r=sc.nextInt();
        float area=3.14f*r*r;
        System.out.println("Area of circle="+area);
    }
}