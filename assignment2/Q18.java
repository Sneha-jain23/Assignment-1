/**
 18.Ron jogs around a rectangular park of length 50 m and breadth 30 m. 
 If he takes 10 rounds of the park each day, 
 how much distance does he cover in a day in km?
 */
import java.util.Scanner;
class Test18{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length=");
        int l=sc.nextInt();
        System.out.println("Enter breadth=");
        int b=sc.nextInt();
        int perimeter=2*(l+b);
        float res=perimeter*10;
        res=res/1000;
        System.out.println(res+"km\u00B2");
    }
}
