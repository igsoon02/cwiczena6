import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        ArrayList<Student> students = new ArrayList<>();
        ArrayList<StudyProgramme>programmes = new ArrayList<>();
        Student s=new Student("John", "Doe", "doe@wp.pl", "Warsaw, Zlota 12", "333-322-222", "1980, 1, 1");


        StudyProgramme it=new StudyProgramme("IT", "AAA", 7, 5);

        s.enrollStudent(it);
        s.addGrade(5, "PGO");
        s.addGrade(2, "APBD");
        Students.promoteAllStudents();
        Students.displayInfoAboutAllStudents();


    }
}
