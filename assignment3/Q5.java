/*
5.Take input of age of 3 people by user and determine oldest
 and youngest among them.
 */
import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st person age=");
        int a=sc.nextInt();
        System.out.print("Enter 2nd person age=");
        int b=sc.nextInt();
        System.out.print("Enter 3rd person age=");
        int c=sc.nextInt();
        if((a>b)&&(a>c)){
            System.out.println(" person1 is Oldest="+a);
        }
        else if((b>a)&&(b>c)){
          System.out.println(" person2 is Oldest="+b);
        }
        else
           System.out.println(" person3 is Oldest="+c);
        
         if((a<b)&&(a<c)){
         System.out.println(" person1 is youngest="+a);}
         else if((b<a)&&(b<c)){
         System.out.println(" person2 is Youngest="+b);}
         else{
         System.out.println(" person3 is youngest="+c);}
    }
}