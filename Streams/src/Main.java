import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("John", "Jack", "Jill", "Joe");
        //find names which start with letter J
        list.stream().filter(x -> x.charAt(0) == 'J').toList().forEach(System.out::println);

        System.out.println("-".repeat(50));
        //find list of distinct even number sorted in reverse order and multiply it by 10
        Stream.of(1, 2, 3, 6, 4, 9, 6, 5)
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .distinct()
                .sorted((a, b) -> (b - a))
                .toList()
                .forEach(System.out::println);

        System.out.println("-".repeat(50));
       String name = "Jeevan";
        long count = name.chars().count();
        System.out.println(count);
    }


}