import java.util.ArrayList;

/* 
Generics and students
*/

public class Faculty {

    public static void main(String[] args) {
        var students = new ArrayList<Student>();
        students.add(new Student("Anthony"));
        students.add(new Student("Lanie"));

        printStudentNames(students);
    }

    public static void printStudentNames(ArrayList students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }
    }
}
