/*
W.A.P to check whether a charachter is an alphabet or not.
*/
import java.util.Scanner;
class Test1{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("It is an Alphabet");
        } else {
            System.out.println("It is not an Alphabet");
        }
    }
}
