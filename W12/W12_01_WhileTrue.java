package W12;

public class W12_01_WhileTrue {

    public static void main(String[] args) {
       int h = 0;
        while (true) {  
            h++;
            System.out.println(h+" ");
           
            if (h == 1000) {
                break;
            }
        }
        // กำหนดค่าเริ่มต้น
        // วนลูปไปเรื่อยๆ  ใช้ while (true) {
        // update รอบ
        // แสดงข้อความพร้อมกับค่า count
        // ตรวจสอบเงื่อนไข ถ้ารอบมากกว่าหรือเท่ากับ 1000 ให้ออกจากลูป
        // ออกจากลูป
    }
}
