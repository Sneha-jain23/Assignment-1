//Q.10 0	7	14	21	28	35	…..
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        int i=0;
        while(i<=n){
            System.out.print((7*i)+"  ");
            i++;
        }

    }
}