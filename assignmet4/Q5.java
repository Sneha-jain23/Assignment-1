/*
Q5. 1 3 5 7 9 .....n-Terms
 */
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.print(i+"  ");
            i+=2;
        }

    }
}