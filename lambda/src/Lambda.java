@FunctionalInterface
public interface Lambda {

     void printName(String name);

     static void printName(){
         System.out.println("Hello I am static method in functional interface");
     }

     static int printAgeTwo(int age) {
         return age * 2;
     }

    default void PrintName(){
        System.out.println("Hello I am default method in a functional interface");
    }

    default int printAge(int age){
         return age;
    }
}

