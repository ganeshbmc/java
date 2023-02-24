package code.rough.week2_lec4;

public class FClass {
    public static void main(String[] args) {
        Date d1, d2;
        d1 = new Date(12,4,1954);
        System.out.println(d1.getDate());
        
        d2 = new Date(1,1,2023);
        d1 = new Date(d2);
        System.out.println(d1.getDate());
    }
}
