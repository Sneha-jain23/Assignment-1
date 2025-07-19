/*
Ask user to enter age, sex ( M or F ), marital status ( Y or N ) and then using following 
rules print their place of service.
if employee is female, then she will work only in urban areas.
if employee is a male and age is in between 20 to 40 then he may work in anywhere
if employee is male and age is in between 40 t0 60 then he will work in urban areas only.
And any other input of age should print "ERROR".
 */
import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Gender:");
        char g=sc.next().charAt(0);
        System.out.print("Martial Status:");
        char s=sc.next().charAt(0);
        if(g=='F'){
            System.out.println("Work in urban areas");
        }
        else {
            int age=sc.nextInt();
            
            if(age<=20 && age>=40 )
            System.out.println("Work anywhere.");
        
            else if(age<40 && age>=60){
            
            System.out.println("Work in urban areas.");
        }
        else
            System.out.print("ERROR.");
        }
    }
}