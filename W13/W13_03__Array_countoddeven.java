public class W13_03__Array_countoddeven {
    public static void main(String[] args) {
        //ให้นับเลขคู่และเลขคี่ใน array ด้านล่าง
        int [] number = {5,3,1,9,1,3,8,4,3,44};
        int countodd = 0;
        int countEven = 0;

        for (int i = 0; i < number.length ; i++) {
            System.out.print(" "+number[i]);

            if (number[i]% 2== 0 ) {
               System.out.println("  number  "+number[i]+"  is odd"); 
               countodd++;
               
            }else {
                System.out.println("  number  "+number[i]+ " is even");
               countEven++;
               
            }


        }
        System.out.println("\namount of all number : "+number.length);
             System.out.println("\namount of odd number : "+countodd);
              System.out.println("\namount of Even number : "+countEven);
              System.out.println(number.length+countodd+countEven);
              
    }
}