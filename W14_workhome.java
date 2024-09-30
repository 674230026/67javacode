public class W14_workhome {
    public static void main(String [] args) {

        String[] codes = {"123TH", "124EN", "125EN", "126TH", "127EN"};

        
        //  6) แสดงรายการพัสดุ พร้อมทั้งบอกว่ามาจากไทยหรือต่างประเทศ
        // มีแสดงจำนวนพัสดุทั้งหมดเท่าไหร่
        // มีจำนวนพัสดุที่มาจากไทยเท่าไหร่
        // มีจำนวนพัสดุที่มาจากต่างประเทศเท่าไหร่
        int TH = 0;
        int EN = 0;
        for (int i = 0; i < codes.length; i++) {
            if (codes[i].endsWith("TH")) {
                System.out.println("พัสดุที่มาจากประเทศไทย " + codes[i] + " ");
                TH++;
            } else {
                System.out.println("พัสดุที่มาจากต่างประเทศ " + codes[i] + " ");
                EN++;

            }

        }
        System.out.println("จำนวนพัสดุทั้งหมด " + codes.length + " ชิ้น");
        System.out.println("จำนวนพัสดุที่มาจากประเทศไทยจำนวน " + TH + " ชิ้น");
        System.out.println("จำนวนพัสดุที่มาขาดต่างประเทศจำนวน " + EN + " ชิ้น");


    }
}