package code.PPA.week_8.ppa1_wk8;

import code.codealong.week_3.A;

public class Employee extends Person implements Cloneable{
    Department dept;
    public Employee(String name, Address addr, Department dept){
        super(name, addr);
        this.dept = dept;
    }
    public Department getDepartment(){
        return this.dept;
    }
    public Employee clone() throws CloneNotSupportedException {
        Employee e = (Employee) super.clone();
        Address a = new Address(this.getAddress().getAddress());
        Department d = new Department(this.getDepartment().getDepartment());
        e.addr = a;
        e.dept = d;
        return e;
    }
    public void updateEmp(String addr, String dept){
        this.addr = new Address(addr);
        this.dept = new Department(dept);
    }

    public String toString(){
        return (this.getName() + " : " + this.getAddress().getAddress() + " : " + this.getDepartment().getDepartment());
    }
}
