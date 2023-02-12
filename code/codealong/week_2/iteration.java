public class iteration {
    public static void main(String[] args){
        System.out.println("Keep iterating!");

        // Testing "sumarray" function using "for" loop
        int[] l = {1, 2, 3, 4, 5};
        System.out.println("For loop result: " + sumarray(l));

        // Testing "sumarray_while" function using "while" loop
        // Note: It is better to use "while" loop for this purpose instead of "for" loop
        System.out.println("While loop result:  " + sumarray_while(l));

        // Testing the proper way to use "for" loop using "sumarray_for_2" function
        System.out.println("For loop v2 result: " + sumarray_for_2(l));
    }

    public static int sumarray(int[] a){
        int sum = 0, n = a.length;
        int i;

        for (i = 0; i < n; i++){
            sum += a[i];
        }
        return sum;
    }

    public static int sumarray_while(int[] a){
        int n = a.length;
        int sum = 0;
        int i = 0;

        while (i < n){
            sum += a[i];
            i++;
        }
        return sum;
    }

    public static int sumarray_for_2(int[] a){
        int sum = 0;

        for (int v: a){
            sum += v;
        }
        return sum;
    }
}
