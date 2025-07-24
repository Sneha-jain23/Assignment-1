/*
Q2. 1 2 3 ......n [limit]
 */
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of n:");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.print(i+"  ");
            i++;
        }
    }
}