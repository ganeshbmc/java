public class string_ops {
    public static void main(String[] args){
        System.out.println("Lets try string operations in java!");
        System.out.println(get_letter("Crazy"));
    }

    public static String get_letter(String x){
        String s = x.substring(0, 1);
        return s;
    }
}
