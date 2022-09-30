package ukeoppgaverUke36;

import ukeoppgaverUke35.Tabell;

import java.util.Arrays;

public class Oppgave2Seksjon131 {
    public static void main (String[] args){

        int[] a = {2,3,6,1,4,5}; //permutasjon av tallene fra 1 til 10
        Tabell.nestePermutasjon(a); //lager neste permutasjon
        System.out.println(Arrays.toString(a));
    }

}
