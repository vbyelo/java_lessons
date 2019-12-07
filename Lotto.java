import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Collections;

public class Lotto {


    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbers.add(i);
        }

        Random random = new Random();
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int index = random.nextInt(49 - i);
            res.add(numbers.get(index));
            numbers.remove(index);
        }
        Collections.sort(res);
        for (int i : res) {
            System.out.println(i);
        }
        System.out.println(Arrays.toString(res.toArray()));

        BaseLotto bl = new BaseLotto();
        ArrayList<Integer> numbers1 = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbers1.add(i);
        }
        ArrayList<Integer> wynik = BaseLotto.Losowanie(numbers1, 6);
        for(int w : wynik){
            System.out.println(w);
        }




    }
}

class BaseLotto{

    public static ArrayList<Integer>  Losowanie( ArrayList<Integer> pula, int num){
        Random random = new Random();
        ArrayList<Integer> wynik = new ArrayList<>();
        int dlugosc = pula.size();
        for (int i = 0; i < num; i++) {
            int index = random.nextInt(dlugosc - i);
            wynik.add(pula.get(index));
            pula.remove(index);
        }
        Collections.sort(wynik);
        for (int i : wynik) {
            System.out.println(i);
        }

        return wynik;
    }
}