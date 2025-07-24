/*
Q3. 1 4 9 16 25 ...n [Term]
 */
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n=");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            System.out.print((i*i)+"  ");
            i++;
        }
    }
}