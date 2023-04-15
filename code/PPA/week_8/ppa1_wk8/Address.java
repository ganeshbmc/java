package code.PPA.week_8.ppa1_wk8;

public class Address implements Cloneable{
    String addr;
    public Address(String addr){
        this.addr = addr;
    }
    public String getAddress(){
        return this.addr;
    }
    public Address clone() throws CloneNotSupportedException {
        Address a = (Address) super.clone();
        return a;
    }
}
