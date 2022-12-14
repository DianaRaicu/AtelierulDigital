package collections.hashmap;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Student.CNPSizeException {
        List students = new ArrayList<Student>();
        students.add(new Student("1234567898","And Maria"));
        students.add(new Student("1234512345","Andrei Popescu"));
        students.add(new Student("1234567891","And Maria2"));
        students.add(new Student("1234512346","Andrei Popescu2"));

        StudentDatabase sd = new StudentDatabase(students);

        String name = sd.findStudentName("1234512345");
        System.out.println(name);

        String name1 = sd.findStudentName("1234512349");

    }
}
