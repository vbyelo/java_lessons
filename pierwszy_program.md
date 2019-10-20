# Pierwszy Program "Witaj, Świecie!"

```Java
package lekcja1.prog1;

public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Witaj, Świecie!");
    }
}
```


* __Java__ to język obiektowy. W programach posługujesz się _obiektami_, które wykonują niezbędne operacje. Ten program składa się z jednej klasy (<span style="color:blue">class</span>) o nazwie _HelloWorld_.

* _main_ to metoda (<span style="color:blue">method</span>), czyli funkcja zadeklarowana w klasie. Metoda _main_ wywoływana jako pierwsza podczas uruchamiania programu. _String[] args_ parametr metody _main_.

* Pakiet (<span style="color:blue">_package_</span>) to zestaw powiązanych klas. Dobrą praktyką jest umieszczanie każdej klasy w pakiecie, ponieważ pozwala to na rozróżnienie klas mających taką samą nazwę.

* Metoda _main_ wykonuje tylko jedną operację chyli wyświetlenia komunikatu sa _System.out_.

