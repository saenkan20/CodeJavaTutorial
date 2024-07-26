public class testlogic {
    public static void main(String args[]){
        /*
        > มากกว่า
        < น้อยกว่า
        == เท่ากับ
        >= มากว่าหรือเท่ากับ
        <= น้อยกว่าหรือเท่ากับ
        != ไม่เท่ากับ
        6 > 5 true
        6 < 5 false
        ตัวดำเนินงานการทางตรรกศาสตร์
        && AND และ (8 > 7 && 8 = 10)
        true && true = true
        false && ture = false
        false && false = false

        * 
        */
        int x = 6,y = 9;
        System.out.print(x > y); 
        System.out.print(x < y);
        System.out.print(x >= y);
        System.out.print(x <= y);
        System.out.print(x != y);
        System.out.print(x < y) && (y > 3); 
        System.out.print(x == 5 || (y > 2));
        System.out.print(y > x); 
    }
}
