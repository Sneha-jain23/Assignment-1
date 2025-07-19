/*
 15. Shelly has a rectangular garden of length 22 m and breath 15 m.
 Her friend Rachel has a square garden of side 21 m. 
 Whose garden is bigger and by how much?
 */
import java.util.Scanner;
class Q15{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter length of shelly\'s garden=");
        int l=sc.nextInt();
        System.out.print("Enter breadth of shelly\'s garden=");
        int b=sc.nextInt();
        int Sarea;
        Sarea=l*b;
        System.out.println("Area of shelly's garden is="+Sarea);
        System.out.print("Enter side of Rachel's garden=");
        int side=sc.nextInt();
        int Rarea=side*side;
        System.out.println("Area of Rachel's garden is="+Rarea);
        if(Rarea>Sarea){
            int res=Rarea-Sarea;
            System.out.println("Rachel's garden= "+res+"cm\u00B2 bigger than Shelly.");
        }
        else{
            int res=Sarea-Rarea;
            System.out.println("Shelly's garden="+res+"cm\u00B2 bigger than Rachel. ");
        }
    }
}