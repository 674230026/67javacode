public class factoreal {
  public static void main(String[] args) {
     int[] number = {1, 2, 3, 4, 5,6,7,8,9,10};
     String multiply = " x ";
     int factorial1 = 1;
     System.out.print("factorral of: "+number[5]+" is ");
     for (int i = 0; i < 5; i++){
       
       factorial1 =factorial1 * number[i];
        System.out.print( number[i]);
        if (i<number.length-1) {
          System.out.print(multiply);
        }
     
     } 
        System.out.print(" = "+factorial1+"\n");

//     factorial 2 
         int factorial2 = 1;
        System.out.print("factorral of: "+number.length+" is ");
     for (int o = 0; o < number.length; o++){
       
        factorial2 = factorial2 * number[o];
        System.out.print( number[o]);
        if (o<number.length-1) {
          System.out.print(multiply);
        }
     
     } 
        System.out.print(" = "+factorial2);
       
  }
}
