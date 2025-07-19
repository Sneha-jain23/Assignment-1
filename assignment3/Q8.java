/*
 Modify the above question to allow student to sit if he/she has medical cause.
Ask user if he/she has medicalcause or not ( 'Y' or 'N' ) and print accordingly.
 */
import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Number of classes held=");
        int held=sc.nextInt();
        System.out.print("Number of classes attend=");
        int attend=sc.nextInt();
         int percent=(attend/held)*100;    
        System.out.print("You have medicalcause or not =");
        char ch=sc.next().charAt(0);
        if((percent>75)|| (ch=='y'))
        System.out.println("student is allowed to sit in exam");
        
        else
        System.out.println("student is not allowed to sit in exam");
        

    }
}