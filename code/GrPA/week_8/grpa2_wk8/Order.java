package code.GrPA.week_8.grpa2_wk8;
import java.util.*;

public class Order {
    public static void main(String[] args) throws CloneNotSupportedException{
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt(); // number of items
      String[] itm = new String[n];
      for(int i = 0; i < n; i++){
        itm[i] = sc.next(); // list of items
      } 
      var c1 = new Customer("naresh", new Items(itm));
      Customer c2 = c1.clone();   
      c2.getItems().items[0] = sc.next();   //Update first item of c2
      c2.setName("suresh"); //Update name of c2
      System.out.println(c1);
      System.out.println(c2);
    }
}