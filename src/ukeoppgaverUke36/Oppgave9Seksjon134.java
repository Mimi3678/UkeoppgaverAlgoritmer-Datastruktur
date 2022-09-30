package ukeoppgaverUke36;

import static ukeoppgaverUke35.Tabell.*;

public class Oppgave9Seksjon134 {
    public static void main(String[] args){

        int[] a = {2,4,6,3,1,5,8,9,7,10};
        int fra;
        int til;

       // System.out.println(utvalgssortering(a, 0, 10));

    }

    public static void utvalgssortering(int[] a, int fra, int til){
        fratilKontroll(a.length, fra, til);

        for (int i = fra; i < til - 1; i++){
            bytt(a,i,min(a,i,til));
        }
    }
}
