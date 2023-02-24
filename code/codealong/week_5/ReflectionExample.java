package code.codealong.week_5;

public class ReflectionExample {
    public static void main(String[] args) {
        Class c = new Human().getClass();
        Constructor[] constructors = c.getConstructors();
        Method[] methods = c.getMethods();
        Field[] fields = c.getFields();
        System.out.println("Number of methods: " + methods.length);
        System.out.println("Number of constructors: " + constructors.length);
        System.out.println("Number of fields: " + fields.length);
   }
}