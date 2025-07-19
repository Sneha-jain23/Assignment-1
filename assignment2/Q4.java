/**
 Find the cost of tiling a rectangular plot of land 300 m long 
 and 150 m wide at the rate of $6 per hundred square m.
 */
import java.util.Scanner;
class Test3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        int l=sc.nextInt();
        System.out.println("Enter breadth");
        int b=sc.nextInt();
        int area=l*b;
        float rate=6.0f/100;
        float result=rate*area;
        System.out.println("Cost of tilling a rectangular plot="+result);

    }
}