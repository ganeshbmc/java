package code.rough.oppe2.q4;
import java.util.*;

public class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Rectangle<Integer> r1 = new Rectangle(sc.nextInt(), sc.nextInt());
        Rectangle<Double> r2 = new Rectangle(sc.nextDouble(), sc.nextDouble());
        double large_area = r1.compareArea(r2);
        System.out.println(large_area);
    }
}
