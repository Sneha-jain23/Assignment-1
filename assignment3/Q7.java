/*
7. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
 */
import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Number of classes held=");
        int held=sc.nextInt();
        System.out.print("Number of classes attend=");
        int attend=sc.nextInt();
        double percent=(attend*100)/held;    
    
        if(percent>75)
        System.out.println("student is allowed to sit in exam");
        else
        System.out.println("student is not allowed to sit in exam");
    }
}