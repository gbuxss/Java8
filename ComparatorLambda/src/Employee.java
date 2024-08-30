public class Employee {

    private int id;
    private  String name;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id +
                " Name: " + name;
    }
}
