/*
Q4. Calculate the sum of following series
    1 2 3 .....n  
    1 - 2 + 3 - 4 + 5 - 6 ....n 
 */
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n=");
        int n=sc.nextInt();
        int i=1,sum=0;
       while(i<=n){
            // 1 2 3 .....n 
           sum=sum+i;
            i++;
        }
         System.out.print("Sum:"+sum);
       
    //    while(i<=n){
    //     if(i%2==0)
    //         sum=sum-i;
    //     else
    //         sum=sum+i;
    //     i++;
    //    }
    //    System.out.print("Sum:"+sum);

    }
}