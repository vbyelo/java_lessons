


public class Inheritance {
    public static void main(String[] args) {
        Pracownik pracownik = new Pracownik();
        pracownik.imie = "Grzegorz";
        pracownik.nazwisko = "Kowalski";
        System.out.println(pracownik.imie + " " + pracownik.nazwisko + " "
                + (pracownik.pelnyEtap ? "pracuje na pelny etap" : "pracuje na pół etapu") + ", jego pansja " + pracownik.Pensja());

        Pracownik pracownik2 = new Pracownik();
        pracownik2.imie = "Halina";
        pracownik2.nazwisko = "Kowalczyk";
        System.out.println(pracownik2.imie + " " + pracownik2.nazwisko + " "
                + (pracownik2.pelnyEtap ? "pracuje na pelny etap" : "pracuje na pół etapu") + ", jej pansja " + pracownik2.Pensja());
        
    }
}

class Pracownik {
    String imie;
    String nazwisko;
    float wyplaty;
    int dniWTygodniu;
    boolean pelnyEtap;

    public Pracownik() {
        this.imie = "";
        this.nazwisko = "";
        this.wyplaty = 18.0f;
        this.dniWTygodniu = 5;
        this.pelnyEtap = true;
    }

    public float Pensja(){
        int dni = this.dniWTygodniu * 4;
        int godziny = this.pelnyEtap ? 8 :4; 
        return this.wyplaty * dni *godziny; 
    }

}
