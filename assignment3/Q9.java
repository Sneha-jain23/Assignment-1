/*
 Write a program to check whether a entered character is lowercase
  ( a to z ) or uppercase ( A to Z ).
*/
import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a character=");
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("Upper case");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("Lower case");
        }
        else
            System.out.println(ch+"is not a alphabet.");
        
    }
}




