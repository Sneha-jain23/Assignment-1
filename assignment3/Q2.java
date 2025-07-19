/*
2.A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.

 */
import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Quantity=");
        int Q=sc.nextInt();
        int unitCost=100;
        int Total=unitCost*Q;
        if(Total>1000){
             double res=Total*(10/100.0);
             System.out.println("Total cost after 10% discount="+res);

        }
        else{
            System.out.println("Total cost="+Total);
        }
    }
}