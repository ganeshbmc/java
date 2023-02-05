public class while_loop {
    public static void main(String[] args){
        System.out.println("Testing 'while' loops in java!");

        // Testing "sumupto" function
        System.out.println(sumupto(5));

        // Testing "sumupto_alt" function
        System.out.println(sumupto_alt(10));
    }

    public static int sumupto(int n){
        int sum = 0;

        while (n > 0){
            sum += n;
            n--;
        }
        return sum;
    }

    public static int sumupto_alt(int n){
        int sum = 0, i = 0;

        do {
            sum += i;
            i++;
        } while ( i <= n);

        return sum;
    }
}
