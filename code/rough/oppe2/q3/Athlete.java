package code.rough.oppe2.q3;
import java.util.*;

import code.codealong.week_3.A;

public class Athlete implements Cloneable{
    private String athleteChestNum="";
    private ArrayList<String> events = new ArrayList<String>();
    
    public Athlete(){
        athleteChestNum = "000";
        events.add("Relay");
        events.add("Ind Evt 1");
        events.add("Ind Evt 2");
    }
    // public Athlete(String athleteChestNum, ArrayList<String> events){
    //     this.athleteChestNum = athleteChestNum;
    //     this.events = events;
    // }
    public void setAthleteChestNum(String acn){
        this.athleteChestNum = acn;
    }
    public void setIndividualEvt1(String e1){
        this.events.remove(1);
        this.events.add(1, e1);
    }
    public void setIndividualEvt2(String e2){
        this.events.remove(2);
        this.events.add(2, e2);
    }
    public String toString(){
        return athleteChestNum + ":" + events;
    }
    public Athlete clone() throws CloneNotSupportedException{
        Athlete a = (Athlete) super.clone();
        ArrayList<String> e = (ArrayList) this.events.clone();
        a.events = e;
        return a;
    }
}
