public class StudyProgramme {

    String nazwa;
    String opis;
    int semestr;
    int itn;

    public StudyProgramme(String nazwa, String opis, int semestr, int itn){

        this.nazwa = nazwa;
        this.opis = opis;
        this.semestr = semestr;
        this.itn = itn;


    }

    public String getNazwa(){
        return nazwa;
    }
    public String getOpis(){
        return opis;
    }
    public int getSemestr(){
        return semestr;
    }
    public int getItn(){
        return itn;
    }






}
