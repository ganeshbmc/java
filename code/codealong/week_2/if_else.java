public class if_else {
    public static void main(String[] args){
        System.out.println("Conditionals!");

        // Testing "sign" function
        System.out.println(sign(100));
        System.out.println(sign(-9));
        System.out.println(sign(0));

        // Testing "sign2" function (braces not used as the body is a single statement)
        System.out.println(sign2(100));
        System.out.println(sign2(-9));
        System.out.println(sign2(0));

    }

    public static int sign(int v){
        if (v < 0){
            return -1;
        } else if (v > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int sign2(int v){
        if (v < 0) return -1;
        else if (v > 0) return 1;
        else return 0;
        }
}
