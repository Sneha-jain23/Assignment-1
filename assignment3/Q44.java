/*
Write a program to input choice from user. If user enter ‘+’ as
 choice then calculate addition of 2 number. If Choice ‘>’ then check 
 which number is greaterst. If choice is ‘==’ then check both number is equal or not.
*/
import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       
        System.out.print("num1=");
        int num1=sc.nextInt();
        System.out.print("num2=");
        int num2=sc.nextInt();
        System.out.print("Enter choice:");
        char ch=sc.next().charAt(0);
       
        if(ch=='+'){
            int res=num1+num2;
            System.out.println("num1+num2="+res);
        }
        else if(ch=='>'){
            if(num1>num2){
                System.out.println(num1+"is greater");
            }
            else
            System.out.println(num2+"is greater");
        }
        else if(ch=='='){
            if (num1==num2)
            System.out.println("both are equal");
            else
            System.out.println("both are not equal");

        }
    else
        System.out.println("wrong choice");
    }
}

