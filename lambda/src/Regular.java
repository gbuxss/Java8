public class Regular {

    private static void printName(String name) {



    }

    public static void main(String[] args) {
        Lambda lm = System.out::println;
        lm.printName("jeevan");

    }
}