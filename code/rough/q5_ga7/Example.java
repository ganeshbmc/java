package code.rough.q5_ga7;

public class Example {
    public static void main(String[] args) {
        int a=10,b=0;
        try{
             int c=a/b;
             System.out.println("Quotient is "+c);
        }
        catch (Exception ae){
             System.out.println("Exception handled");
        }
        catch (ArithmeticException ae){
              System.out.println("ArithmeticException handled");
        }
   }
}