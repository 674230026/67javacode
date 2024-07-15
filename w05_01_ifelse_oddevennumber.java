import java.util.Scanner;

public class w05_01_ifelse_oddevennumber {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter the  number ");
        int number = sd.nextInt();
        int result = number % 2;

      //  if (result==0) {
      //      System.out.println(number + "is as even numbers" );
     //   }else{
      //      System.out.println(number + "is as odd number" );
       // }
        if (result == 1) {
            System.out.println(number + "is as even numbers");
        } else {
            System.out.println(number + "is as odd number");
        }
       // if (result == 0) {
       //     System.out.println(number + "is as even numbers");
       // } else {
      //      System.out.println(number + "is as odd number");
        //}
        //    System.out.println("What is it for?");
    }
}
