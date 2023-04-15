package code.PPA.week_8.ppa1_wk8;

public class Department implements Cloneable{
    String addr;
    public Department(String addr){
        this.addr = addr;
    }
    public String getDepartment(){
        return this.addr;
    }
    public Department clone() throws CloneNotSupportedException {
        Department d = (Department) super.clone();
        return d;
    }
}