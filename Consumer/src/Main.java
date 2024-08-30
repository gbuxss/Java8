//Consumer is a functional interface which contains accept() abstract method
//This interface is suitable for performing a task where no return value is needed

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        Consumer<String> consumer = s -> {
            for (char ltr: s.toCharArray()){
                System.out.println(ltr);

            }
        };


        Consumer<List<Integer>> printOddNumber = x -> {
            Predicate<Integer> isOdd = number -> number % 2 != 0;
            for (int num : x) {

                if (isOdd.test(num))
                    System.out.println(num);
            }
        };
        consumer.accept("Jeevan");
        printOddNumber.accept(Arrays.asList(67, 33, 45, 2, 1, 90));
    }
}