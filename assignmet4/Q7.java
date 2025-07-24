/*
Q7. 0 1 1 2 3 5 8 13 ..... n-Terms     
 */
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        int i=1;
        int n1=0,n2=1,n3;
        System.out.print(n1+"  "+n2+"  ");
        while(i<=(n-2)){
         
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3+"  ");
            i++;
        }

    }
}