package pl.edu.ur.oopl6.zad2;

import java.util.Random;

public class ObjectCounter {
    public static void main(String[] args){
        Punkt[] p = new Punkt[10];
        Random r = new Random();
        for (int i = 0; i<10; i++){
            p[i] = new Punkt(r.nextInt(1000), r.nextInt(1000), r.nextInt(1000));
            System.out.println(p[i].toString());
        }
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println(Punkt.last_point.toString());
        System.out.println("-------------------------------------------------");
        Punkt.PokazOstatniObiekt();
    }
     /*Program losuje 3 liczby z zakresu od 1 do 999, ktore zapisuje jako wspolrzedne.
       Robi to 10 razy dzieki petli for i zapisuje te dane w obiektach. Na biezaco wyswietla
       ktory obiekt z kolei sie tworzy. Nastepnie wyswietla ostatni utworzony obiekt z jego wspolrzednymi.
*/
}
