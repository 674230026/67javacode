import java.util.Scanner; //นำเข้าคลาส sanner จากpackage java..util

public class W04_01_AeraCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// สร้างอ็อบเจ็กด์ของคลาส Scsnner
        System.out.println("ป้อนค่ารัศมีวงกลม");// แสดข้อความที่ผู้ใช้ป้อนค่ารัศมี
        double radius = sc.nextDouble(); // รับค่ารัศมีและเก็บ
        // double radius; // ประกาศตัวแปล
        // radius = 10; // กำหนดค่ารัศมี 10
        double area; // ประกาศตัวแปบหาค่าพื้นที่
        double PI = 3.14159; // ประกาศค่าคงที่ PI
        if (radius > 0) {
            area = PI * radius * radius; // คำนวณพื้นที่วงกลม
            System.out.println("พื้นที่วงกลมที่มีราศมีเท่ากับ " + radius + " คือ " + area);
        } else {
            System.out.println("Error ค่ารัศมีต้องมีค่ามากกว่า 0 โปรดป้อนค่ารัศมีใหม่");
            radius = sc.nextDouble(); // รับค่ารัศมีใหม่จากผู้ใช้
            
        }

    }
}
