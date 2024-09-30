// โจทย์
// 1. สร้างโปรแกรมเพื่อแสดงข้อมูลทั้งหมดใน Array
// 2. หาผลรวมของข้อมูลทั้งหมดใน Array
// 3. สร้าง Array ใหม่เพื่อรับค่าข้อมูลตัวเลข ผ่านคีย์บอร์ด 5 ตัว
// 4. แสดงข้อมูลทั้งหมดใน Array ใหม่
// 5. หาผลรวมของข้อมูลทั้งหมดใน Array ใหม่

package W14;
import java.util.Scanner;
public class W14_00_SumNumber {

    public static void main(String[] args) {

       
        // ประกาศตัวแปรชนิด Array แบบที่ 1 - รู้จำนวนข้อมูลล่วงหน้า
          int numbers[] = {10, 30, 17, 9, 31, 225, 64, 89, 5, 120};
          int sumo = 0;
           
        // 1. แสดงรายการข้อมูลใน Array ทั้งหมด
        for (int i = 0;  i<numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        

        System.out.println("\n====================================");

        // 2. หาผลรวมของข้อมูลทั้งหมด
        int sum = 0;
         for (int i = 0;  i<numbers.length; i++) {
            System.out.print(numbers[i]+" ");
            sum = sum + numbers[i];
            
        }System.out.println(sum);

        System.out.println("====================================");

        // 3. สร้าง Array ใหม่เพื่อรับค่าข้อมูลตัวเลข ผ่านคีย์บอร์ด 5 ตัว
           Scanner kb = new Scanner(System.in);
           int newnumber [] = new int [5];
           for (int i = 0;  i<newnumber.length; i++) {
            System.out.print("Enter number "+(i+1)+" ");
            newnumber[i] = kb.nextInt();
                   
        }
        System.out.println("====================================");

        // 4. แสดงข้อมูลทั้งหมดใน Array ใหม่
        sum = 0;
        for (int i  = 0; i  < newnumber.length; i++) {
            System.out.print(newnumber[i]+" "); 
            sum = sum + newnumber[i];
       


        }  System.out.print("\nsum of number = "+sum);

        
        // 5. หาผลรวมของข้อมูลทั้งหมดใน Array ใหม่
    
        System.out.println("\n====================================");

        int[] mergeNumbers = new int[numbers.length+newnumber.length];
        for (int i = 0; i< numbers.length; i++) {
            mergeNumbers[i] = numbers[i];
        }
        for (int i = 0; i<newnumber.length; i++) {
            mergeNumbers[numbers.length + i] = newnumber[i];
        }sum = 0;
        for (int i  = 0; i  < mergeNumbers.length; i++) {
            System.out.print(mergeNumbers[i]+" "); 
            sum = sum + mergeNumbers[i];
       


        }  System.out.print("\nsum of number = "+sum);


    }
}
