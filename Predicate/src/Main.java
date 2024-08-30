import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/* predicate holds a conditions*/
public class Main {
    public static void main(String[] args) {

        Predicate<Integer> isEven = x -> x % 2 == 0;

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,10);
        int sum = 0;
        for (int num: numbers){
            if (isEven.test(num))
                sum += num;
        }
        System.out.println("Sum: " + sum);


        //find a word that ends in letter n

        Predicate<String> isWordsEndingInLetterN = x -> x.toLowerCase().charAt(x.length() -1) == 'n';

        List<String> names= Arrays.asList("jeevan", "nancy", "nature", "mean");

        for (String name: names){
            if (isWordsEndingInLetterN.test(name))
                System.out.println(name);
        }
    }
}