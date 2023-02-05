public class explore{
    public static void main(String[] args)
    {
        System.out.println("Exlpore java!");

        // Using a static function
        System.out.println(stat_func(1));

        // Using a non-static function
        explore e = new explore();
        System.out.println(e.func(2));

        // Using more than one input parameter
        // Note that there are two functions with the same name "func" but the signatures are different
        explore m = new explore();
        System.out.println(m.func(1, 2));

        // Using strings and string manipulation
        explore s = new explore();
        System.out.println(s.str_func("India rocks!"));

        // Using arrays
        explore a = new explore();
        int[] l = {1, 2, 3, 4};
        System.out.println(a.arr_func(l));
    }

    public static int stat_func(int x){
        return x;
    }

    public int func(int x){
        return x;
    }

    // Note that there are two functions with the same name "func" but the signatures are different
    public int func(int x, int y){
        return x+y;
    }

    public String str_func(String x){
        String xx = x.substring(0, 5);
        return xx;
    }

    public int arr_func(int[] x){
        return x.length;
    }
}
