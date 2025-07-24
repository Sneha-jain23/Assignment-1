//Q9. 1	+	1/2	+	1/3	+	1/4	+	1/5	….. n terms(find out sum)
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        float i=1.0f;
        float sum=0.0f;
        while(i<=n){
            sum=sum+(1/i);
            i++;

        }
        System.out.print("Sum:"+sum);
    }
}