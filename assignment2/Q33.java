/*
A rectangular garden has dimensions of 30 m by 20 m
and is divided in to 4 parts by two pathways that run 
perpendicular from its sides. One pathway has a width of 3 m 
and the other, 4 m. Calculate the total usable area of the garden.
*/
import java.util.Scanner;
class Test33{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length=");
        int l=sc.nextInt();
        System.out.print("Enter width=");
        int w=sc.nextInt();
        int garden_area=l*w;
        System.out.print("Enter one pathway width=");
        int path1_w=sc.nextInt();
        //lengthwise 30m long
        int path1_area=path1_w*l;
        System.out.println("Enter second pathway width=");
        int path2_w=sc.nextInt();
        //widthwise 20m long
        int path2_area=path2_w*w;
        int overlap_area=path1_w*path2_w;
        int total_path_area=path1_area+path2_area-overlap_area;
        int usable_area=garden_area-total_path_area;
        System.out.println("total usable area of the garden is="+usable_area+"m\u00B2");


    }
}