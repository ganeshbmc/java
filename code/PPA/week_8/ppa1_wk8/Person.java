package code.PPA.week_8.ppa1_wk8;

public class Person implements Cloneable{
    String name;
    Address addr;
    public Person(String name, Address addr){
        this.name = name;
        this.addr = addr;
    }
    public String getName(){
        return this.name;
    }
    public Address getAddress(){
        return this.addr;
    }
    public Person clone() throws CloneNotSupportedException {
        Person p = (Person) super.clone();
        Address a = new Address(this.getAddress().getAddress());
        p.addr = a;
        return p;
    }
}
