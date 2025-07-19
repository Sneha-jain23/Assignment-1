/*
How many square tiles of side 10 cm will be required
 to tile a floor measuring 800 cm by 900 cm?
 */
import java.util.Scanner;
class Test29{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length=");
        int l=sc.nextInt();
        System.out.println("Enter breadth=");
        int b=sc.nextInt();
        long floor_area=l*b;
        System.out.println("Enter side of tile=");
        int side=sc.nextInt();
        int tiles_area=side*side;
        long required_tiles=floor_area/tiles_area;
        System.out.println("Required tiles="+required_tiles);
    }
}