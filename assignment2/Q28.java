/*
A carpet is 5 m long and 4 m wide.
Find its price at the rate of $ 205 per square meter.
 */
import java.util.Scanner;
class Test28{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length=");
        int l=sc.nextInt();
        System.out.print("Enter width=");
        int w=sc.nextInt();
        System.out.println("Enter rate of per sqaure meter=");
        int rate=sc.nextInt();
        int area,cost;
        area=l*w;
        cost=area*rate;
        System.out.println("Carpet price=$"+cost);
    }
}