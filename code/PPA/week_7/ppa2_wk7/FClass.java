package code.PPA.week_7.ppa2_wk7;
import java.util.*;

public class FClass {
    // Implement the function "replace" as described  
    public static String replace(char[] str, int i, char c) throws Exception{
        String result = "";
        try {
            str[i] = c;
            result = new String(str);
            return result;
        } catch (ArrayIndexOutOfBoundsException ae) {
            if (i <= 0) {
                Exception e = new Exception();
                throw e;
            } else {
                str[str.length - 1] = c;
                result = new String(str);
                return result;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        int i = sc.nextInt();
        char c = sc.next().charAt(0);
        try {
            String s2 = new String(replace(s1.toCharArray(), i, c));
            System.out.println(s2);
        } 
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
