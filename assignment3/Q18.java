/*
WAP to calculate the percentage of students
 */
import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Total marks=");
        int Total=sc.nextInt();
        System.out.print("Obtained marks=");
        int Obtained=sc.nextInt();
        double percentage=Obtained*100/Total;
        System.out.println("Percentage="+percentage+"%");
    }
}