/*
 Find the 28th term of an Arithmetic Progression -21 -18 -15 -12 . . . . . 
 */
import java.util.Scanner;
class Test44{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n=");
        int n=sc.nextInt();
        System.out.print("Enter 1st term=");
        int a1=sc.nextInt();
        System.out.print("Enter 2nd term=");
        int a2=sc.nextInt();
        int d=a2-a1;
        int T;
        T=a1+(n-1)*d;
        System.out.println("The n of term is="+T);

    }
}