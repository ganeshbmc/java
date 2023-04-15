package code.GrPA.week_8.grpa2_wk8;

public class Customer implements Cloneable{
    String name;
    Items items;
    public Customer(String name, Items items){
        this.name = name;
        this.items = items;
    }
    public Items getItems(){
        return this.items;
    }
    public void setName(String s){
        this.name = s;
    }
    public Customer clone() throws CloneNotSupportedException{
        Customer c = (Customer) super.clone();
        Items i = new Items();
        i = c.getItems().clone();
        c.items = i;
        return c;
    }
    public String toString(){
        return name + " " + items;
    }
}
