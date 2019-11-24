
public class Inheritance {
    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik();
        pracownik.imie = "Grzegorz";
        pracownik.nazwisko = "Kowalski";
        pracownik.Wydrukowac();
        // System.out.println(pracownik.imie + " " + pracownik.nazwisko + " "
        // + (pracownik.pelnyEtap ? "pracuje na pelny etap" : "pracuje na pół etapu") +
        // ", jego pansja " + pracownik.Pensja());

        Pracownik pracownik2 = new Pracownik("Halina", "Kowalczyk", Plec.Kobieta);
        pracownik2.Wydrukowac();
        // System.out.println(pracownik2.imie + " " + pracownik2.nazwisko + " "
        // + (pracownik2.pelnyEtap ? "pracuje na pelny etap" : "pracuje na pół etapu") +
        // ", jej pansja " + pracownik2.Pensja());

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
        this.wyplaty = 18.0f;
        this.dniWTygodniu = 5;
        this.pelnyEtap = true;
        this.plec = Plec.Mezczyzna;
    }

    public Pracownik(String imie, String nazwisko, Plec plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wyplaty = 18.0f;
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
