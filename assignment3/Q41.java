/*
Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.          Calculate percentage and grade according to following: 
	Percentage >= 90% : Grade A 
	Percentage >= 80% : Grade B 
	Percentage >= 70% : Grade C 
	Percentage >= 60% : Grade D 
	Percentage >= 40% : Grade E 
	Percentage < 40% : Grade F


 */
import java.util.Scanner;
class Test1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Physics marks: ");
        float p= sc.nextFloat();
        System.out.print("Enter Chemistry marks: ");
        float ch= sc.nextFloat();
        System.out.print("Enter Biology marks: ");
        float b= sc.nextFloat();
        System.out.print("Enter Mathematics marks: ");
        float m = sc.nextFloat();
        System.out.print("Enter Computer marks: ");
        float c= sc.nextFloat();

        float total = p+ch+b+m + c;
        float percentage = (total / 500) * 100;

        System.out.println("Percentage = " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        } else if (percentage >= 60) {
            System.out.println("Grade D");
        } else if (percentage >= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }
    }
}
