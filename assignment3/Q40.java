/*
 */
import java.util.Scanner;
class Test1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.CP = sc.nextDouble();
        System.out.print("Enter Selling Price: ");
        double SP = sc.nextDouble();

        if (SP > CP) {
            double profit = SP - CP;
            System.out.println("Profit = " + profit);
        } else if (CP > SP) {
            double loss = CP- SP;
            System.out.println("Loss = " + loss);
        } else {
            System.out.println("No Profit No Loss");
        }
    }
}
