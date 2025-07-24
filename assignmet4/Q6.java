/*
Q6. 2 4 6 8 ........n-Terms
 */
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.print((2*i)+" ");
            i++;
        }

    }
}