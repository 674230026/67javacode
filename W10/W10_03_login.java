package W10;
import java.util.Scanner;
public class W10_03_login {
    public static void main(String[] args) {
      String usernsme = "admin";
      String password = "1234";  
      Scanner kb = new Scanner(System.in);
      System.out.print("ป้อนชื่อผู้ใช้");
      String inputusernsme = kb.nextLine();
      System.out.print("รหัสผ่าน");
      String inputpassword = kb.nextLine();
       if(usernsme.equals(inputusernsme)  && password.equals(inputpassword)){
        System.out.println("เข้าสู่ระบบ");
       } else  {
        } System.out.println("passwordหรือusernameผิด");
        if (usernsme != inputusernsme && password == inputpassword) {
        System.out.println("ขื่อผิด");
       }else if (usernsme.equals(inputusernsme) && password != inputpassword) {
        System.out.println("รหัสผิด");
       } else {
        System.out.println("ผิดทั้งคู่");
       }
    }
}
