/*
Find even odd using switch case 
 */
import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number");
        int num=sc.nextInt();
        int remainder=num%2;
        switch(remainder){
            case 1:
                System.out.println(num+" is even");
                break;
            case 0:
                System.out.println(num+" is odd");
                break;
            default:
                System.out.println("Invalid Number");
        }


    }
}