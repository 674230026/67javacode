package W13;

import  java.util.Scanner;
public class W13_02_inroArray {
    public static void main(String[] args) {
        // ประกาศตัวแปรชนิด array แบบที่2 - ไม่รู้จำนวนข้อมูล
        Scanner kb = new java.util.Scanner(System.in);

        String brancars [] = new String[3];

        

        System.out.println("ควยเลือกซะ123 :");
         String brandcars =kb.nextLine();

         
        //กำหนดค่า array
        brancars[0] = "toyota";
         brancars[1] = "honda";
          brancars[2] ="nissan";

          // แสดงผลโดยใช้ loop
          System.out.println("===================================================================");
          System.out.println("old Bran of cars in the array are: ");

          for ( int i = 0; i<brancars.length; i++) {
              System.out.print("/  "+brancars[i]);
          }System.out.println();

         //แก้ไขค่าใน array โดยรับค่าจากคียอดย์
         System.out.println("\n\np;ease enter the brand of the 3 rd car: ");
         for (int i =0;  i< brancars.length; i++ ){
            System.out.println("enter the bran of car "+(i+1)+":");
            brancars[i] = kb.next();
             

            switch () {
                case :
                    
                    break;
                default:
                    throw new AssertionError();
            }

         }




          System.out.println("===================================================================");
          
          System.out.println("\nnew Bran of cars in the array are:  ");

          for ( String car : brancars) {
              System.out.print("/  "+car);
          }

          System.out.println("Bran of cars in the array are: ");

    }
}
