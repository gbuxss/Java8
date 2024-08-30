import java.util.*;

public class Main {
    public static <employee> void main(String[] args) {

        List<Employee> employee = new ArrayList<>();

        Employee john = new Employee(3, "John");
        Employee rock = new Employee(2, "Rock");
        Employee hardy = new Employee(1, "Hardy");

        //sort the employee by id number
        employee.add(john);
        employee.add(rock);
        employee.add(hardy);


        System.out.println(employee);

       Collections.sort(employee, Comparator.comparing(Employee::getName));




        List<String> employee2 = new ArrayList<>(Arrays.asList("Rock", "John", "Hardy"));

        Collections.sort(employee2);// this is a natural order
        System.out.println(employee2);
        employee2.sort(Comparator.reverseOrder()); //this is a reverse order
        System.out.println(employee2);
    }
}