package code.GrPA.week_7.grpa1_wk7;
import java.util.*;

class DivisionException extends Exception {
    public String toString(){
        return "Division by 3 is not allowed";
    }
}

public class Test {
    public static void divide (int a, int b)  {
        try {
            if (b != 3) {
                System.out.println(a/b);;
            } else {
                DivisionException de = new DivisionException();
                throw de;
            }
        } catch (DivisionException de) {
            System.out.println((de));
        }
    }

    public static void main(String[] args) throws DivisionException {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        //call divide method here
        divide(x, y);
    }
}
