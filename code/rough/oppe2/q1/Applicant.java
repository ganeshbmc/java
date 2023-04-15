package code.rough.oppe2.q1;

class AgeOutOfBoundsException extends Exception{
    public AgeOutOfBoundsException(String n){
        super("Age of " + n + " is outside the limits");
    }
}

public class Applicant {
    String name;
    int age;
    public Applicant(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String checkAndGetName() throws AgeOutOfBoundsException{
        if (this.age >= 18 && this.age <= 30){
            return this.name;
        } else {
            throw new AgeOutOfBoundsException(this.name);
        }
    }
}
