/**
 * How many tiles whose length and breadth are 13 cm and 7 cm respectively
   are needed to cover a rectangular region whose length and breadth are 520 cm 
 and 140 cm? 
 */
import java.util.Scanner;
class Test2{
    public static void main(String rgs[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of tile=");
        int tl=sc.nextInt();
        System.out.println("Enter breadth of tile=");
        int tb=sc.nextInt();
        int t_area=tl*tb;
        System.out.println("Enter length of rectangular region=");
        int Rl=sc.nextInt();
        System.out.println("Enter breadth of rectangular region=");
        int Rb=sc.nextInt();
        int R_area=Rl*Rb;
        double result=R_area/t_area;
        System.out.println(result+"tiles are required");
    }
}