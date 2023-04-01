package code.rough.week_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class practice_stream {
    public static void main(String[] args) {
        String s = "We usually use an iterator to process a collection. Suppose we have split a text file as a list of words. We want to count the number of long words in the list.";
        String[] s1 = s.split("\\s");
        // System.out.println(s1);
        long count = 0;
        for (String w: s1) {
            if (w.length() > 5) {
                count++;
            }
        }
        System.out.println(count);

        List<String> words = Arrays.asList(s1);
        Stream<String> wordstream = words.stream();
        long cnt = wordstream.filter(w -> w.length() > 5).count();
        System.out.println(cnt);

        long cnt1 = Stream.of(s1).filter(w -> w.length() > 5).count();
        System.out.println(cnt1);

        Stream.generate(() -> "Echo").limit(7).forEach(System.out::println);
        Stream.generate(Math::random).limit(7).forEach(System.out::println);
        
        Stream.iterate(0, n -> n+1).limit(7).forEach(System.out::println);
        Stream.iterate(0, n -> n <= 7, n -> n+1).forEach(System.out::println);


    }
}
