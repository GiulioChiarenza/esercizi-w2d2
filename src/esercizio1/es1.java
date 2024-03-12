package esercizio1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class es1 {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il numero di parole: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        Set<String> parole = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();

        System.out.println("Inserisci le parole:");
        for (int i = 0; i < N; i++) {
            String parola = scanner.nextLine();

            if (!parole.add(parola)) {
                paroleDuplicate.add(parola);
            }
        }

        System.out.println("Parole duplicate:");
        for (String parola : paroleDuplicate) {
            System.out.println(parola);
        }

        System.out.println("Numero di parole distinte: " + parole.size());

        System.out.println("Elenco delle parole distinte:");
        for (String parola : parole) {
            System.out.println(parola);
        }

    }
}
