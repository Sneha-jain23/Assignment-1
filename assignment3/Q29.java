/*
 WAP to find lowest number among four different number 
 */
 import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("num1=");
        int num1=sc.nextInt();
        System.out.print("num2=");
        int num2=sc.nextInt();
        System.out.print("num3=");
        int num3=sc.nextInt();
        System.out.print("num4=");
        int num4=sc.nextInt();
        if(num1<num2 && num1<num3 && num1<num4)
        System.out.println(num1+" is lowest.");
        else if(num2<num1 && num2<num3 && num2<num4)
        System.out.println(num2+" is lowest.");
        else if(num3<num1 && num3<num2 && num3<num4)
        System.out.println(num3+" is lowest.");
        else
        System.out.println(num4+" is lowest.");


    }
}