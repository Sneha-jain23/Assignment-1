/*
What will be the area of a square with perimeter 200 m?
 */
import java.util.Scanner;
class Test31{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter perimeter=");
        int p=sc.nextInt();
        int s,area;
        s=p/4;
        area=s*s;
        System.out.println("Area of square="+area+"m\u00B2");
    }
}