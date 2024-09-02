package W12;

import java.util.Scanner;   // นำเข้าคลาส Scanner

public class W12_04_doWhile_selectMenu {

    public static void main(String[] args) {
        Scanner hg = new Scanner(System.in);
        // ประกาศ Scanner object
        
          int choice;
            System.out.print("Enter your choice :");
          choice = hg.nextInt();
         
        do {
        
            break;
        
        }while (choice == 3);     
         // ให้ผู้ใช้เลือกเมนูซ้ำจนกว่าจะเลือกออก ใช้ do-while
        // เงื่อนไขคือ วนลูปไปเรื่อยๆ จนกว่าผู้ใช้จะเลือก 3
        // แสดงเมนู
        System.out.println("====================================");
        System.out.println("Menu:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Exit");
        System.out.println("====================================");

       
      // choice = hg.nextInt();
      
        // รับค่าเลือกเมนู
        // แสดงข้อความให้ผู้ใช้ป้อนเลือกเมนู Enter your choice:
        // รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร choice
        System.out.println("------------------------------------");

        
        // ตรวจสอบเมนูที่ผู้ใช้เลือก
        switch (choice) {
            case 1:     // ถ้าผู้ใช้เลือก 1
                System.out.print("Enter the first number: ");
            int num1 = hg.nextInt();  // รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร num1
            System.out.print("Enter the choice number: ");
            int num2 = hg.nextInt();  // รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร num2
            {
          int som = num1+num2;
                 System.out.println("ผลรวม "+som);// คำนวณผลรวม
                 break;
            }
            // แสดงผลรวม
            // ออกจาก switch
            case 2:
             System.out.print("Enter the first number: ");
             int num = hg.nextInt();
             System.out.print("Enter the choice number: ");
             int num4 = hg.nextInt();
             int differrence = num-num4;
             System.out.print("Enter the differrence is : "+differrence);
             break;
            case 3:
               System.out.println("ออก");
               break;
            default:  
             System.out.println("innva;od choice . please tryagain."); // ถ้าผู้ใช้เลือกเมนูอื่น
            // แสดงข้อความเลือกเมนูไม่ถูกต้อง
            }
        }

        // ปิด Scanner object
    }

