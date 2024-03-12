package esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class es2 {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        List<Integer> numeriCasuali = generaNumeriCasuali(10);
        System.out.println("Lista generata: " + numeriCasuali);

        List<Integer> listaInvertita = invertiLista(new ArrayList<>(numeriCasuali));
        System.out.println("Lista invertita: " + listaInvertita);

        System.out.println("Stampa posizioni pari:");
        stampaPosizioni(numeriCasuali, true);

        System.out.println("Stampa posizioni dispari:");
        stampaPosizioni(numeriCasuali, false);

    }

    public static List<Integer> generaNumeriCasuali(int N) {
        Random rand = new Random();
        List<Integer> numeriCasuali = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            numeriCasuali.add(rand.nextInt(101));
        }
        Collections.sort(numeriCasuali);
        return numeriCasuali;
    }

    public static List<Integer> invertiLista(List<Integer> lista) {
        List<Integer> listaInvertita = new ArrayList<>(lista);
        Collections.reverse(listaInvertita);
        lista.addAll(listaInvertita);
        return lista;
    }

    public static void stampaPosizioni(List<Integer> lista, boolean pari) {
        for (int i = 0; i < lista.size(); i++) {
            if (pari && i % 2 == 0) {
                System.out.println(lista.get(i));
            } else if (!pari && i % 2 != 0) {
                System.out.println(lista.get(i));
            }
        }
    }
}
