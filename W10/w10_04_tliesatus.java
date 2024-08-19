//ตรวจสอบคำนำหน้าชื่อ
//ด.ช ด.ญ นาย นาง นางสาว
// ถ้าดป็นด.ญ หรือ นางสาว เป็นผู้หญิง
// ถ้าเป็นด.ช หรือนาย เป็นผู้ชาย
//
package W10;

import java.util.Scanner;

public class w10_04_tliesatus {
    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);

       System.out.println("ระบุเพศ(mele/femle)");
       String gentder = kb.next(); 

       System.out.println("ระบุอายุ");
       int arg = kb.nextInt();

       System.out.println("ระบุสถานะ(sinle/married)");
       String ismarried = kb.next();

       if (gentder.equalsIgnoreCase("male")) {
        System.out.println("ผู้ชาย");
        if (arg<15) {
            System.out.println("ด.ช");
        }else{
            System.out.println("นาย");
        }
       }else {

       if (arg<15) {
           System.out.println("ด.ญ");            
        }else 
         if (ismarried.equalsIgnoreCase("married")) {
            System.out.println("นาง");
        }else{
            System.out.println("นางสาว");
        }
       } 
       

    }
    }

