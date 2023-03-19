package code.codealong.week_8.rough;
import java.util.stream.Stream;
import java.util.Scanner;

public class practice_streams {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a message: ");
        String msg = scnr.nextLine();
        System.out.println("How many times do you want your message to be repeated?");
        Integer num = scnr.nextInt();
        
        Stream<String> echos = Stream.generate(() -> msg).limit(num);
        echos.forEach(System.out::print);
        // System.out.println(echos);
    }
}
