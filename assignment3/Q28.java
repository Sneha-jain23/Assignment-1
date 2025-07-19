/*
 Program to perform arithmetic operation using switch case
 */
import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  arithmetic operation : ");
        char op=sc.next().charAt(0);
        System.out.println("Enter a=");
        int a=sc.nextInt();
        System.out.println("Enter b=");
        int b=sc.nextInt();

        switch(op){
            case '+':
                System.out.println("a+b="+(a+b));
                break;
            case '-':
                System.out.println("a-b="+(a-b));
                break;
            case '*':
                System.out.println("a*b="+(a*b));
                break;
            case '/':
                System.out.println("a/b="+(a/b));
                break;
            case '%':
                System.out.println("a%b="+(a%b));
                break;
            default:
                System.out.print("Enter correct operation");
        }
    }
}