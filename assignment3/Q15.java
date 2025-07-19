/*
Write a java program to accept the cost price of a bike
    and display the road tax to be paid according to the 
    following criteria.
    Cost Price(In Rs)		Tax
     > 100000			 15%
     >50000 and <=100000	 10%
     <=50000			 5%			  
*/
import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter bike cost=");
        int p=sc.nextInt();
        if(p>100000){
         float tax=p*(15f/100);
         System.out.println(" 15% tax"+tax);
         System.out.println("After tax="+(p+tax))
        }
        else if(p>50000 && p<=100000){
         float tax=p*(10f/100);
         System.out.println(" 10% tax="+tax);
         System.out.println("After tax="+(p+tax))
        }
        else if(p<=50000){
            float tax=p*(5f/100);
        System.out.println(" 5% tax="+tax);
        System.out.println("After tax="+(p+tax))
        }
        
    }
}