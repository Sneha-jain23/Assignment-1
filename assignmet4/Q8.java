//Q8. 1	2	2	4	8	32	…… n terms
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        int i=1;
        while(i<=n){
            int res=(int)(Math.pow(2,i));
            System.out.print(res+"  ");
            i++;
        }
    }
}