package esercizio3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class es3 {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> contatti= new HashMap<>();
        System.out.println("inserisci contatto: nome, numero telefono");
        String nome;
        int numeroTelefono;

        while (true) {
            System.out.print("Nome: ");
            nome = sc.nextLine();

            if (nome.equals("0")) {
                break;
            }

            System.out.print("Numero telefono: ");
            numeroTelefono = Integer.parseInt(sc.nextLine());

            contatti.put(nome, numeroTelefono);
        }
        System.out.println("Lista dei contatti:");
        for (Map.Entry<String, Integer> entry : contatti.entrySet()) {
            System.out.println("Nome: " + entry.getKey() + ", Numero telefono: " + entry.getValue());
        }
        System.out.print("Numero telefono: ");

        rimuoviContatto(contatti, sc);
    }
    public static void rimuoviContatto(Map<String, Integer> contatti, Scanner scanner) {
        System.out.println("Inserisci il nome del contatto che vuoi rimuovere:");
        String nomeDaRimuovere = scanner.nextLine();

        if (contatti.containsKey(nomeDaRimuovere)) {
            contatti.remove(nomeDaRimuovere);
            System.out.println("Contatto rimosso con successo!");
            System.out.println("lista dei contatti:");
            for (Map.Entry<String, Integer> entry : contatti.entrySet()) {
                System.out.println("Nome: " + entry.getKey() + ", Numero telefono: " + entry.getValue());
            }

        } else {
            System.out.println("Il contatto specificato non esiste nella rubrica.");
        }
    }
}
