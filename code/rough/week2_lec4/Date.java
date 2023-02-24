package code.rough.week2_lec4;

public class Date {
    private int day, month, year;

    public Date(int d, int m, int y){
        day = d;
        month = m;
        year = y;
    }

    public Date(Date d){
        this.day = d.day;
        this.month = d.month;
        this.year = d.year;
    }

    public String getDate(){
        return(day + "-" + month + "-" +year);
    }
}