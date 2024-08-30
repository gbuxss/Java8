import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<String, Integer> lengthOfString = x -> x.length();

        System.out.println(lengthOfString.apply("Jeevan"));

        Function<String, String> subString = x -> x.substring(0, 1);

        //find the name of student starting with first three letter "j"

        Function<List<Student>, List<Student>> studentWithLetterJ = x -> {
            List<Student> result = new ArrayList<>();
            for (Student s : x) {
                if (subString.apply(s.getName()).equalsIgnoreCase("j"))
                    result.add(s);
            }
            return result;
        };


        List<Student> students = Arrays.asList(new Student(1, "jeevan"),
                new Student(2, "sabin"),
                new Student(5, "john"));

        List<Student> studentWithLetterJResult =studentWithLetterJ.apply(students);
        System.out.println(studentWithLetterJResult);
    }

    public static class Student {

        private int id;
        private String name;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}

