/*
 16. Tina wants a new carpet for her rectangular dining room. 
 Her dining room is a 5 meters by 7 meters rectangle. 
 How much carpet does she need to buy to cover her entire dining room.
 */
import java.util.Scanner;
class Test16{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length=");
        int l=sc.nextInt();
        System.out.println("Enter breadth=");
        int b=sc.nextInt();
        int res=l*b;
        System.out.println("Area of dining room="+res+"m\u00B2");
    }
}