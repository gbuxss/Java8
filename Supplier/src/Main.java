import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Hello world!";

        System.out.println(supplier.get());
    }


}