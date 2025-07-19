/*
4.A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade.
*/

import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Physics marks=");
        float P=sc.nextFloat();
        System.out.print("Enter Chemistry marks=");
        float C=sc.nextFloat();
        System.out.print("Enter Mathematics marks=");
        float M=sc.nextFloat();
        System.out.print("Enter Hindi marks=");
        float H=sc.nextFloat();
        System.out.print("Enter English marks=");
        float E=sc.nextFloat();
        float sum=P+C+M+H+E;
        float p=(sum/500)*100;
        if(p>80){
            System.out.println("A");
        }
        else if(p>60|| p<=80){
            System.out.println("B");
        }
        else if(p<=60|| p>50)
            System.out.println("C");
        else if(p<=50 || p>45)
            System.out.println("D");
        else if(p<=45 || p>25)
             System.out.println("E");
        else
             System.out.println("F");

    }
}