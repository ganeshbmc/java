package code.rough.oppe2.q1;
import java.util.*;

public class ExceptionTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Applicant> aList = new ArrayList<Applicant>();

        for (int i=0; i < 4; i++){
            Applicant a = new Applicant(sc.next(), sc.nextInt());
            aList.add(a);
        }
        for (Applicant a: aList){
            try{
                String name = a.checkAndGetName();
                System.out.println(name);
            } catch (AgeOutOfBoundsException ae){
                System.out.println(ae.getMessage());
            }
        }
        sc.close();
    }
}
