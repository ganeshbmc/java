package code.rough.oppe2.q2;
import java.util.*;
import java.util.stream.*;


import code.codealong.week_3.A;

public class StreamsTest {
    public static Stream<Student> getEligibleStream(ArrayList<Student> sList){
        Stream<Student> eStream = sList.stream().filter(s -> s.getCGPA() > 7.5 && s.getIncome() < 100000);
        return eStream;
    }

    public static void updateScholarshipStatus(List<Student> eList){
        for (Student es: eList){
            if (es.getCGPA() > 9){
                es.setScholarshipStatus("grade-1 scholarship");
            } else {
                es.setScholarshipStatus("grade-2 scholarship");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> sList = new ArrayList<Student>();
        Student s;
        for (int i=0; i < 4; i++){
            s = new Student(sc.next(), sc.nextDouble(), sc.nextDouble());
            sList.add(s);
        }
        List<Student> eList = getEligibleStream(sList).collect(Collectors.toList());
        updateScholarshipStatus(eList);

        for (Student es: eList){
            System.out.println(es);
        }
        sc.close();
    }
}
