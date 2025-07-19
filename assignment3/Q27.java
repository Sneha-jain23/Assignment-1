/*
 Check given character is vowel or not using switch case 
 */
import java.util.Scanner;
class Test1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter character=");
        char ch=sc.next().charAt(0);
        switch(ch){
            case 'a':
                System.out.print(ch+" is vowel");
                break;
            case 'e':
                System.out.print(ch+" is vowel");
                break;
            case 'i':
                System.out.print(ch+" is vowel");
                break;
            case 'o':
                System.out.print(ch+" is vowel");
                break;
            case 'u':
                System.out.print(ch+" is vowel");
                break;
            default:
                System.out.print(ch+" is consonent");
                break;

        }
    }
}