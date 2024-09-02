package W12;

import java.util.Scanner;

public class W12_03_doWhile_checkGrade {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int score;
       

        
           // ประกาศตัวแปรเพื่อเก็บค่าที่ผู้ใช้ป้อน
        // ให้ผู้ใช้ป้อนข้อมูลซ้ำจนกว่าจะถูกต้อง
        do {
           
             System.out.println("between 1 and 100 :");// แสดงข้อความให้ผู้ใช้ป้อนข้อมูล between 1 and 100:
              score = kb.nextInt();
            
                
               
             
            
            
            // รับค่าจากคีย์บอร์ดเก็บไว้ในตัวแปร score
          
        
        
    }while (score <1 || score >100);


        // แสดงข้อมูลที่ผู้ใช้ป้อน เช่น ou entered: 75
        // ตรวจสอบเกรด

        
        System.out.print("Enter Your Score (0-100) : ");
       
        if (score > 100 || score < 0) {  
            System.out.println("Out of range");
        } else if (score >= 80) {
            System.out.println("Yore Grade is A");
        } else if (score >= 70) {
            System.out.println("Yore Grade is B");
        } else if (score >= 60) {
            System.out.println("Yore Grade is C");
        } else if (score >= 50) {
            System.out.println("Yore Grade is D");
        } else {
            System.out.println("Yore Grade is E");
        }
        kb.close();
    
  
} 
}

      
         // ปิด Scanner object
