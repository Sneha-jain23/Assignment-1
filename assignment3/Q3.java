/*
3.A company decided to give bonus of 5% to employee if his/her year of service 
is more than 5 years.Ask user for their salary and year of service and print 
the net bonus amount.

 */
import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter salary=");
        float s=sc.nextInt();
        System.out.println("Enter service year=");
        float y=sc.nextFloat();
        if(y>5){
            float bonus=s*(5.0f/100);
            float amount=s+bonus;
            System.out.println("net bonus amount"+amount);
        }
        else
            System.out.println("Salary="+s);
    }
}
