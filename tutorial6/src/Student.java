import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Student {
    public static final AtomicInteger Indeksy = new AtomicInteger(0);
    String indeks;
    private int generujIndeks() {
        return Indeksy.incrementAndGet();
    }

    String imie;
    String nazwisko;
    String email;
    String adres;
    String nrtelefonu;
    String uro;
    String status;
    int semestr;
    int itn;
    ArrayList<StudyProgramme> studyProgrammes;

    public Student(String imie, String nazwisko, String email, String adres, String nrtelefonu, String uro){



        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.adres = adres;
        this.nrtelefonu = nrtelefonu;
        this.uro= uro;
        this.indeks =("s"+generujIndeks());
        this.status = "Kandydat";
        this.studyProgrammes = new ArrayList<>();
        this.semestr = semestr;
        this.itn = itn;


    }

    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
    public String getEmail(){
        return email;
    }
    public String getAdres(){
        return adres;
    }
    public String getNrtelefonu(){
        return nrtelefonu;
    }
    public String getUro(){
        return uro;
    }
    public int getSemestr(){
        return semestr;
    }
    public int getItn(){
        return itn;
    }
    public String getStatus(){
        return status;
    }
    public ArrayList<StudyProgramme> getStudyProgrammes() {
        return studyProgrammes;
    }
    public void addGrade(int grade, String subject) {

    }
    public void setStatus(String status) {
        this.status = status;
    }


    public void promoteToNextSemester(){
        this.semestr ++;
    }


    public void enrollStudent(StudyProgramme programme) {
        studyProgrammes.add(programme);

        this.semestr = 1;

        }
    }

