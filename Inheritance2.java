
public class Inheritance2 {
    public static void main(String[] args) {
        Dyrektor pracownik = new Dyrektor();
        pracownik.imie = "Grzegorz";
        pracownik.nazwisko = "Kowalski";
        pracownik.Wydrukowac();

        Asystent pracownik2 = new Asystent("Halina", "Kowalczyk", Plec.Kobieta);
        pracownik2.Wydrukowac();


    }
}

enum Plec {
    Mezczyzna, Kobieta
}

class Pracownik {
    String imie;
    String nazwisko;
    float wyplaty;
    int dniWTygodniu;
    boolean pelnyEtap;
    Plec plec;

    public Pracownik() {
        this.imie = "";
        this.nazwisko = "";
        
        this.dniWTygodniu = 5;
        this.pelnyEtap = true;
        this.plec = Plec.Mezczyzna;
    }

    public Pracownik(String imie, String nazwisko, Plec plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.dniWTygodniu = 5;
        this.pelnyEtap = true;
        this.plec = plec;
    }

    public float Pensja() {
        int dni = this.dniWTygodniu * 4;
        int godziny = this.pelnyEtap ? 8 : 4;
        return this.wyplaty * dni * godziny;
    }

    public void Wydrukowac() {
        System.out.println(this.imie + " " + this.nazwisko + " "
                + (this.pelnyEtap ? "pracuje na pelny etap" : "pracuje na pół etapu")
                + (this.plec == Plec.Mezczyzna ? ", jego pansja " : ", jej pansja ") + this.Pensja());

    }

}

class Dyrektor extends Pracownik{

    public Dyrektor(){
        this.wyplaty = 18.0f;
    }

    public Dyrektor(String imie, String nazwisko, Plec plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.wyplaty = 22.0f;
    }

    public void Wydrukowac() {
        System.out.println("Dyrektor " +  this.imie + " " + this.nazwisko + " "
                + (this.pelnyEtap ? "pracuje na pelny etap" : "pracuje na pół etapu")
                + (this.plec == Plec.Mezczyzna ? ", jego pansja " : ", jej pansja ") + this.Pensja());

    }

}

class Asystent extends Pracownik{

    public  Asystent(){
        this.wyplaty = 22.0f;
    }

    public Asystent(String imie, String nazwisko, Plec plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.wyplaty = 22.0f;
    }

    public void Wydrukowac() {
        System.out.println("Asystent " +  this.imie + " " + this.nazwisko + " "
                + (this.pelnyEtap ? "pracuje na pelny etap" : "pracuje na pół etapu")
                + (this.plec == Plec.Mezczyzna ? ", jego pansja " : ", jej pansja ") + this.Pensja());

    }

}
