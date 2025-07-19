/*
WAP to check given year is a leap year or not .
 */
import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Year=");
        int year=sc.nextInt();
         if((year%4==0 && year%100!=0) || year%400==0)
         System.out.print(year+" is leap year.");
         else
         System.out.print(year+" is not leap year.");
    }
}
