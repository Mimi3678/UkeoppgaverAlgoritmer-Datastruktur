package ukeoppgaverUke36;

import ukeoppgaverUke35.Tabell;

public class Oppgave1Seksjon132 {
    public static void main(String[] args){

        int[] a = {3,5,4,7,6,8,1,2,9,10};
        int[] b = {1,2,5,7,3,8,4,9,6,10};
        int[] c = {2,5,4,3};

        System.out.println(Tabell.inversjoner(a)); //Får da 14 inversjoner som svar
        System.out.println(Tabell.inversjoner(b)); //Får da 8 inversjoner som svar
        System.out.println(Tabell.inversjoner(c)); //Får da 8 inversjoner som svar


    }
}
