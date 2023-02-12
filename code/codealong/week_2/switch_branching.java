public class switch_branching {
    public static void main(String[] args){
        System.out.println("Checkout multiway branching using 'switch' in java!");

        // Testing "sign" function which uses 'switch'
        // Note: We can only use constants with 'case'. Cannot use 'if' statement along with 'case'
        sign(1);
        sign(-1);
        sign(0);

        // Testing "sign" function which returns a string instead of void
        System.out.println(sign2(1));
        System.out.println(sign2(-1));
        System.out.println(sign2(0));
        System.out.println(sign2(100));

    }

    public static void sign(int v){
        switch (v){
            case -1: {
                System.out.println("Negative");
                break;
            }
            case 1: {
                System.out.println("Positive");
                break;
            }
            case 0: {
                System.out.println("Zero");
                break;
            }
        }
    }

    public static String sign2(int v){
        // Note that 'default' needs to be mentioned because the return type of the function is "String"
        switch (v){
            case -1: {
                String ans = "Negative";
                return ans;
                // break;
            }
            case 1: {
                String ans = "Positive";
                return ans;
                // break;
            }
            case 0: {
                String ans = "Zero";
                return ans;
                // break;
            }
            default: {
                String ans = "Error";
                return ans;
            }
        }
    }
}
