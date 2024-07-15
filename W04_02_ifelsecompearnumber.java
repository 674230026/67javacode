
import java.util.Scanner;

public class W04_02_ifelsecompearnumber {
    public static void main(String[] arge) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number");
        int Num1 = input.nextInt();

        System.out.print("Enter the Second Number: ");
        int Num2 = input.nextInt();
        int result = 0;
        if (Num1 < Num2) {

            result = Num1 - Num2;
            System.out.println("the nimber 1 is greater than the number 2 ");
        } else {
            result = Num1 + Num2;
            System.out.println("the nimber 1 is lss than or equal to number 2 ");
        }
        System.out.println(result);
    }
}
