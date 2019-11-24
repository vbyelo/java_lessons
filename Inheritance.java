
public class Inheritance {
    public static void main(String[] args){
        Pracownik pracownik= new Pracownik();
        System.out.println(pracownik.name + " " + pracownik.nazwisko + " " + (pracownik.pelnyEtap? "pracuje na pelny etap": "pracuje na pół etapu"));
    }
}

class Pracownik{
    String name;
    String nazwisko;
    float wyplaty;
    int dniWTygodniu;
    boolean pelnyEtap;

    public Pracownik(){
        this.name = "";
        this.nazwisko = "";
        this.wyplaty = 18.0f;
        this.dniWTygodniu = 5;
        this.pelnyEtap = true;
    }

}
