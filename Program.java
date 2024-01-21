import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        Student student1 = new Student("Yurii", 28);
        Student student2 = new Student("Aleksei", 24);
        Student student3 = new Student("Maksim", 26);
        Student student4 = new Student("Oleg", 30);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        Actions.displayStudents(students);

        File f = new File(Actions.FILE_JSON);
        if (f.exists() && !f.isDirectory()) {
            students = Actions.loadStudentsFromFile(Actions.FILE_JSON);
        } else {
            Actions.saveStudentsToFile(Actions.FILE_JSON, students);
            Actions.saveStudentsToFile(Actions.FILE_BIN, students);
            Actions.saveStudentsToFile(Actions.FILE_XML, students);
        }

        Actions.displayStudents(students);





    }
}
