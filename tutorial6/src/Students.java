import java.util.ArrayList;

class Students {
    public static ArrayList<Student> allStudents = new ArrayList<>();

    public static void addStudent(Student student) {
        allStudents.add(student);
    }

    public static void promoteAllStudents() {
        for (Student student : allStudents) {
                ArrayList<StudyProgramme> studyProgrammes = student.getStudyProgrammes();
                for (StudyProgramme programme : studyProgrammes) {
                    int aktualnySemestr = student.getSemestr();
                    if(aktualnySemestr < programme.getSemestr()){
                        if(student.getItn() <  programme.getItn()){
                            student.promoteToNextSemester();
                            if (aktualnySemestr > programme.getSemestr()){
                                student.setStatus("Absolwent");
                            }

                        }
                    }



            }
        }
    }

    public static void displayInfoAboutAllStudents() {

        for (Student student : allStudents){

            System.out.println("Student:" + student.getImie() + " " + student.getNazwisko());
            System.out.println("Semestr: " + student.getSemestr());


        }
    }
}

