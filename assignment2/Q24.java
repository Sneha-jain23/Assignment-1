/*
24.How many bricks each 25 cm long, 10 cm wide and 7.5 cm thick will be required 
for a wall 20 m long, 2 m high and 0.75 m thick? If bricks sell at $900 per thousand 
what will it cost to build the wall?
*/
import java.util.Scanner;
class Test24{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of wall=");
        int wall_L=sc.nextInt();
         wall_L=20*1000;
         System.out.print("Enter the base of wall=");
        int wall_B=sc.nextInt();
         wall_B=2*1000;
         System.out.print("Enter the thickness of wall=");
        float wall_Thick=sc.nextFloat();
         wall_Thick=wall_Thick*1000;
        double wall_Volume=wall_L*wall_B*wall_Thick;
        System.out.print("Enter the length of brick=");
        int brick_L=sc.nextInt();
        System.out.print("Enter the width of wall=");
        int brick_W=sc.nextInt();
        System.out.print("Enter the height of wall=");
        float brick_H=sc.nextFloat();
        double brick_Volume=brick_L*brick_W*brick_H;
        double res=wall_Volume/brick_Volume;
        System.out.println("Number of bricks="+res);
        double total=(res*900)/1000;
        System.out.println("Total cost=$"+total);


    }
}