/*
32.A square garden with a side length of 150 m has a square
 swimming pool in the very centre with a side length of 25 m . 
 Calculate the area of the garden.
 */
import java.util.Scanner;
class Test32{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter side length of garden= ");
        int garden_side=sc.nextInt();
        int garden_area=garden_side*garden_side;
        System.out.print("Enter side length of pool=");
        int pool_side=sc.nextInt();
        int pool_area=pool_side*pool_side;
        int result=garden_area-pool_area;
        System.out.println("Garden area excluding swimming pool="+result+"m\u00B2");
    }
}