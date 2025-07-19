/*
How many tiles of length 5 cm and breadth 8 cm are needed to tile
 the floor of a bed room 200 cm long and 400 cm wide?
 */
import java.util.Scanner;
class Test30{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of tile=");
        int tiles_l=sc.nextInt();
        System.out.print("Enter breadth of tile=");
        int tiles_b=sc.nextInt();
        int tiles_area=tiles_l*tiles_b;
        System.out.print("Enter the length of floor=");
        int floor_l=sc.nextInt();
        System.out.println("Enter the breadth of floor=");
        int  floor_w=sc.nextInt();
        long floor_area=floor_l*floor_w;
        long required_tiles=floor_area/tiles_area;

        System.out.println("Required tiles="+required_tiles);
    }
}