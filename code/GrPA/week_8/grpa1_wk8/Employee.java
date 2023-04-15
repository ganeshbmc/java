package code.GrPA.week_8.grpa1_wk8;
import java.util.*;
import java.util.stream.*;

public class Employee {
    String name, dept;
    double salary;

    public Employee(String name, String dept, double salary){
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public String toString(){
        return this.name +" : "+ this.dept +" : " + this.salary;
    }

    public static Stream<Employee> query(ArrayList<Employee> eArr, String dept, double salary){
        Stream eStream = eArr.stream().filter(e -> e.dept.equals(dept) && e.salary >= salary);
        return eStream;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var eList = new ArrayList<Employee>();
        eList.add(new Employee("Jack", "HR", 30000));
        eList.add(new Employee("Aria", "HR", 40000));
        eList.add(new Employee("Nora", "IT", 50000));
        eList.add(new Employee("Bella", "IT", 60000));
        eList.add(new Employee("Jacob", "IT", 70000));
        eList.add(new Employee("James", "HR", 80000));
        String d = sc.next();       //read department
        double s = sc.nextInt();    //read salary
		
        var st = query(eList, d, s);
        st.forEach(n -> System.out.println(n + " "));
    }
}
