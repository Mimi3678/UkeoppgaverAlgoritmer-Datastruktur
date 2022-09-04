package ukeoppgaverUke35;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//Seksjon 1.2.1
public class Oppgave5Seksjon121 {
    public static void main(String[] args){

        //eksempel med en tabell
       int [] a = {1,2,3,4,5,6,7,8,9,10};
       for (int k:a) System.out.print(k + " ");

       System.out.println("\n");

       //eksempel med en liste
        List<Character> liste = new LinkedList<>();
        liste.add('A'); liste.add('B'); liste.add('C');

        for (Character c : liste) System.out.print(c + " ");

        System.out.println("\n");

        //eksempel med en tabell og mengde
        int[] array = {5,9,2,4,7,10,8,1,3,6};
        Set<Integer> s = new TreeSet<>();

        for (int k:array) s.add(k);
        for (int k:s) System.out.print(k + " ");

        System.out.println("\n");

        //Eksempel med en tabell der det skrives ut tekst-strenger
        String[] n = {"Ola", "Miriam", "Nana", "Kari", "Ali"};
        for (String navn : n) System.out.print(navn +" ");
    }
}
