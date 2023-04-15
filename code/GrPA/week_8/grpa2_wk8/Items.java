package code.GrPA.week_8.grpa2_wk8;

public class Items implements Cloneable{
    public String[] items;
    public Items(){
        // Empty constructor
    }
    public Items(String[] items){
        this.items = items;
    }
    public String[] getItems(){
        return this.items;
    }
    public Items clone() throws CloneNotSupportedException{
        Items i = (Items) super.clone();
        String[] s = this.items.clone();
        i.items = s;
        return i;
    }
    public String toString(){
        String answer = "";
        for (String i: this.items){
            answer += i + " ";
        }
        return answer;
    }
}
