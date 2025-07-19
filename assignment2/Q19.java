/*
 19. A cube with an edge of 7 cm and a cuboid measuring 7 cm × 4 cm × 8 am
  are kept on a table. Which shape has more volume?
 */
import java.util.Scanner;
class Test19{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the edge of cube=");
        int edge=sc.nextInt();
        
        int volume_cube=edge*edge*edge;
        System.out.println("Volume of cube is="+volume_cube);
        System.out.print("Enter the edge of cuboid=");

        int l=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        int volume_cuboid=l*b*h;
        System.out.println("Volume of cuboid is="+volume_cuboid);
        if(volume_cube > volume_cuboid){
            System.out.println("Volume of cube is greater than volume of cuboid");
        }
        else{
             System.out.println("Volume of cuboid is greater than volume of cube");
             }
    

    }
}