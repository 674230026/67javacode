// ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 
// รอบที่ 2 
// รอบที่ 3 
// รอบที่ 4 
// รอบที่ 5 
package W12; 
public class W12_01_exLoopWhile {

   
    public static void main(String[] args) {
       
      System.out.println("todo1 for loop");
      for ( int i=0; i<=10; i++){
  System.out.println("รอบที่1");
}
     System.out.println("=============================");
        // System.out.println("รอบที่ 1");
        // System.out.println("รอบที่ 2");
        // System.out.println("รอบที่ 3");
        // System.out.println("รอบที่ 4");
        // System.out.println("รอบที่ 5");
    // ==========================================todo 1 - end for loop ========================================
     System.out.println("todo2 for loop");
    int u = 0;
    while (u<=5) { 
        System.out.println("จ้า");
        u++;
    }
    
// โครงสร้างคำสั่งลูป for แบ่งออกเป็น 3 ส่วน
// 1. ส่วนตัวแปรเริ่มต้น
// 2. เงื่อนไข
// 3. การเพิ่มค่า / การลดค่า
// TODO
  System.out.println("todo1 for loop");
  int l  = 0;
       while ( l <= 10 ){
  System.out.println("hello world");l++;
}
System.out.println("=============================");
// ==========================================todo 1 - end for loop ========================================
 System.out.println("todo2 for loop");
  int mon = 0; 
  while ( mon <= 5) { 
      System.out.println("รอบ"+" "+mon+" "+"hello world");
      mon++;
  }




//คำสั่ง 1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// รอบที่ 1 Hello World
// รอบที่ 2 Hello World
// รอบที่ 3 Hello World
// รอบที่ 4 Hello World
// รอบที่ 5 Hello World
// TODO
 System.out.println("todo1 for loop");
int j =1;
do {
    
System.out.print(j+"  ");j++; 
}while(j <10);
System.out.println();
  
  System.out.println("=============================");
// ==========================================todo 1 - end for loop ========================================


 System.out.println("todo2 for loop");
 int nb = 0;
   while (nb<=10) { 
     System.out.print(nb+"  ");
     nb++;
       
   }System.out.println();


System.out.println("=============================");

//คำสั่ง 2 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10
// TODO
 System.out.println("todo1 for loop");
int sammetion = 0;
for ( int f=1; f<=10; f++){
    System.out.print(f+"  ");
  sammetion = sammetion+f; // sammetion += f;  

} System.out.println("="+sammetion);

System.out.println("=============================");



 System.out.println("todo2 for loop");

 int jm = 0;
 int nm = 0;
 while (jm <= 5) { 
     System.out.print(jm+"  ");
     jm++;
 }  nm += jm;
    System.out.println();

    
//คำสั่ง 2.1 ให้แสดงผลลัพธ์ดังนี้
// ===============
// 1 2 3 4 5 6 7 8 9 10 = 55
// TODO
// ======================================================================
//คำสั่ง 2.2 ให้แสดงผลลัพธ์ดังนี้
 System.out.println("todo1 for loop");
int sammetio = 0;
for ( int f=1; f<=10; f++){
    System.out.print(f);
    if(f<=9){
      System.out.print("+");
    }
  sammetio = sammetio+f; // sammetion += f;  

} System.out.println("="+sammetio);

  System.out.println("=============================");

// ===============
// 1+2+3+4+5+6+7+8+9+10 = 55
// TODO
// ======================================================================
//คำสั่ง 3 ให้แสดงผลลัพธ์ดังนี้
// ===============
 System.out.println("todo1 for loop");
for ( int p=10; p>=1; p--){
  System.out.print(p+"  ");
  } 
  System.out.println("=============================");
// 10 9 8 7 6 5 4 3 2 1
// TODO
// ======================================================================
//คำสั่ง 4 ให้แสดงผลลัพธ์ดังนี้
// ===============

 System.out.println("todo1 for loop");
for ( int o=1; o<=19; o+=2){
    System.out.print(o+"  ");
  

}
System.out.println("=============================");
  



// 1 3 5 7 9 11 13 15 17 19
// TODO
// ======================================================================
//คำสั่ง 5 ให้แสดงผลลัพธ์ดังนี้
// ===============
 System.out.println("todo1 for loop");
for ( int d=1; d<=20; d++){
    System.out.print(d+"  ");
  
  } System.out.println();
  System.out.println("=============================");
// 2 4 6 8 10 12 14 16 18 20
// TODO
// ======================================================================
//คำสั่ง 6 ให้แสดงผลลัพธ์ดังนี้
// ===============
 System.out.println("todo1 for loop");
for ( int c=1; c<=100; c+=c){
    System.out.print(c+"  ");
}System.out.println();
System.out.println("=============================");

 System.out.println("todo2 for loop");
    int bv = 0;
    while (bv <= 10) { 
        System.out.print(bv*bv+"  ");
        bv++;
    }
System.out.println();

System.out.println("=============================");

// 1 4 9 16 25 36 49 64 81 100
// TODO
// ======================================================================
//คำสั่ง 7 ให้แสดงผลลัพธ์ดังนี้
// ===============
 System.out.println("todo1 for loop");
System.out.println();
       for ( int n=0; n>=5; n++){
        if(n%2 == 0){
  System.out.println("รอบที่"+ n +"เลขคู่");
}else{
     System.out.println("รอบที่"+ n +"เลขคี่");
}
System.out.println("=============================");




 System.out.println("todo2 for loop");
int cb = 1;
   while (cb<=5
   ) { 
       if(cb % 2 == 0){
         System.out.println("รอบที่"+cb+"เลขคู่");
       }else{
        System.out.println("รอบที่"+cb+"เลขคี่");
       }
       cb++;
   }




// รอบที่ 1 เลขคี่
// รอบที่ 2 เลขคู่
// รอบที่ 3 เลขคี่
// รอบที่ 4 เลขคู่
// รอบที่ 5 เลขคี่
// TODO
// ==================
    }
}
}
