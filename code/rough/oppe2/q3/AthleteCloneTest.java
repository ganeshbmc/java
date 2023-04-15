package code.rough.oppe2.q3;

import java.util.Scanner;

public class AthleteCloneTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Athlete dummyAthlete = new Athlete();
        try{
            Athlete a1 = (Athlete) dummyAthlete.clone();
            a1.setAthleteChestNum(sc.next());
            a1.setIndividualEvt1(sc.next());
            a1.setIndividualEvt2(sc.next());

            Athlete a2 = (Athlete)a1.clone();
            a2.setAthleteChestNum(sc.next());
            a2.setIndividualEvt2(sc.next());
            System.out.println(a1 + "\n" + a2);
        } catch (CloneNotSupportedException c){
        }
        sc.close();
    }
}
