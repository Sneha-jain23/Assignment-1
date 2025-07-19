/*
Find the cost of tiling a dining room 20 m long
 and 15 m wide at the rate of $ 5 per square m.
 */
import java.util.Scanner;
class Test27{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length=");
        int l=sc.nextInt();
        System.out.println("Enter width=");
        int w=sc.nextInt();
        System.out.println("Enter rate of per square=");
        int rate=sc.nextInt();
        
        int cost,area;
        area=l*w;
        cost=area*rate;
        System.out.println("cost of tiling a dining room=$"+cost);

    }
}