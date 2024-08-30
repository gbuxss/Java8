public class MyClass implements Lambda{
    public static void main(String[] args) {

        MyClass mc = new MyClass();
        mc.printName("Jeevan");
        mc.PrintName();
        Lambda.printName();
        
    }

    @Override
    public void printName(String name) {
        System.out.println("I am overriding an abstract method " + name);
    }
}
