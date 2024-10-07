package W15;

import java.util.Scanner;

public class W15_02_method_calculator {
    // ทั้งหมดเป็น method ที่มีการรับค่าและคืนค่า
    
    // 1) Method สำหรับบวกเลข
    static int add(int a, int b) {
        System.out.print(a + " + "+b + " = ");
        return a+b;
}
    // 2) Method สำหรับลบเลข
    static int suptact(int a, int b) {
        System.out.print(a + " - "+b + " = ");
        return a-b;
}

    // 3) Method สำหรับคูณเลข
    static int multiply(int a, int b) {
        System.out.print(a + " * "+b + " = ");
        return a*b;
    }

    // 4) Method สำหรับหารเลข
    static int devide(int a, int b) {
        System.out.print(a + " / "+b + " = ");
        return a/b;
    }
    //รับค่าจากคีย์บอร์ด
   

    public static void main(String[] args) {
         Scanner kb = new Scanner(System.in);
         System.out.println("ป้อนค่าที่1 ");
        int a = kb.nextInt();
         System.out.println("ป้อนค่าที่2 ");
        int b = kb.nextInt();
        // 1) Method สำหรับบวกเลข
        System.out.println("ผลบวกของตัวเลข เท่ากับ "+add(a,b));

        // 2) Method สำหรับลบเลข
        System.out.println("ผลลบของตัวเลข เท่ากับ "+suptact(a,b));

        // 3) Method สำหรับคูณเลข
        System.out.println("ผลคูณของตัวเลข เท่ากับ "+multiply(a,b));

        // 4) Method สำหรับหารเลข
        System.out.println("ผลหารของตัวเลข เท่ากับ "+devide(a,b));
    }
}



