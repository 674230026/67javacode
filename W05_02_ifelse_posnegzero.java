import java.util.Scanner;
public class W05_02_ifelse_posnegzero {
    public static void main(String[] args){
    Scanner df = new Scanner(System.in);
    System.out.println("enter a number");
    int number = df.nextInt();

    if (number>0) {

        System.out.println(number+"is a positive number :");

    }else{ if (number<0){

        System.out.println(number+"is a negitive number :");

        }else{

        System.out.println(number+"zero");
        
    }
}}}

