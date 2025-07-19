/*
How many bricks will be required to lay a path 120 m long
and 2.4 m breadth if a brick is 24 cm long and 15 cm wide?
 */
import java.util.Scanner;
class Test26{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of path=");
        double path_l=sc.nextDouble();
        path_l=path_l*100;
        System.out.println("Enter breadth of path=");
        double path_b=sc.nextDouble();
          path_b=path_b*100;
          
        double path_area=path_l*path_b;
        System.out.println("Enter breadth of brick=");
        int brick_b =sc.nextInt();
        System.out.println("Enter length of brick=");
        int brick_l=sc.nextInt();
        int brick_area=brick_l*brick_b;
        double result=path_area/brick_area;
        System.out.println("Number of bricks required="+result);
    }
}