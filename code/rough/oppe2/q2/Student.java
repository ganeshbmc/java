package code.rough.oppe2.q2;

public class Student {
    String name;
    String scholarshipStatus = "";
    double avgCGPA, income;
    public Student(String name, double avgCGPA, double income){
        this.name = name;
        this.avgCGPA = avgCGPA;
        this.income = income;
    }
    public double getCGPA(){
        return this.avgCGPA;
    }
    public double getIncome(){
        return this.income;
    }
    public void setScholarshipStatus(String status){
        this.scholarshipStatus = status;
    }
    public String toString(){
        return this.name +" : "+ this.avgCGPA +" : "+ this.income +" : "+ this.scholarshipStatus;
    }
}
