package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    private static double standardDeviation(ArrayList<Integer> populacija) {
        double suma = 0, mean = meanOfALIst(populacija);
        for (Integer i : populacija)
            suma += (i - mean) * (i - mean);
        return Math.sqrt(suma / populacija.size());
    }

    private static int minimumOfAList(ArrayList<Integer> lista) {
        int minimum = lista.get(0);
        for (Integer i : lista)
            if (i < minimum)
                minimum = i;
        return minimum;
    }

    private static int maximumOfAList(ArrayList<Integer> lista) {
        int maximum = lista.get(0);
        for (Integer i : lista)
            if (i > maximum)
                maximum = i;
        return maximum;
    }

    private static double meanOfALIst(ArrayList<Integer> lista) {
        double mean = 0;
        for (Integer i : lista)
            mean += i;
        mean /= lista.size();
        return mean;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String unos;
        ArrayList<Integer> lista = new ArrayList<>(0);
        //inputs the elements of the list while user doesn't enter the word "stop"
        while (!(unos = in.nextLine()).equals("stop")) {
            try {
                Integer broj = Integer.parseInt(unos);
                lista.add(broj);
            } catch (NumberFormatException e) {
            }
        }
        //checks if the list is empty
        if (lista.size() == 0) {
            System.out.println("Lista je prazna");
            return;
        }
        System.out.println("Minimalna vrijednost u listi je " + minimumOfAList(lista));
        System.out.println("Maksimalna vrijednost u listi je " + maximumOfAList(lista));
        System.out.println("Srednja vrijednost elemenata liste je " + meanOfALIst(lista));
        System.out.println("Standardna devijacija liste je " + standardDeviation(lista));
    }
}
