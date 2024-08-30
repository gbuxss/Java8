public class Main {
    public static void main(String[] args) {

//        Animal Cow = new Animal() { //creating anonymous class
//            @Override
//            public void walk() {
//                System.out.println("I can walk with four feet ");
//            }
//        };
//        //calling a walk from anonymous class
//        Cow.walk();
//
//        Animal bird = new Animal() {
//            @Override
//            public void walk() {
//                System.out.println("I can walk with two feet");
//            }
//
//
//
//        };
//
//        bird.walk();
//        Animal.fly();

        //using lambda expression
        Animal cow = () -> "I am a cow, and I can walk with four feet's";
        String messgaeFormCow= cow.walk();
        System.out.println(messgaeFormCow);
    }


}