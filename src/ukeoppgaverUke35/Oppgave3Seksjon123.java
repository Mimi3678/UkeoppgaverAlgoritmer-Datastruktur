package ukeoppgaverUke35;

import java.util.NoSuchElementException;

import static ukeoppgaverUke35.Tabell.fratilKontroll;


public class Oppgave3Seksjon123 {
    public static void main (String[] args){
        int[] a = null;
        int m = maks(a,0,0);
        System.out.print(m);

    }

    public static int maks(int[] a, int fra, int til){

        if (a == null) throw new NullPointerException
                ("Parametertabellen a er null!");

        fratilKontroll(a.length, fra,til);

        if (fra == til) {
            throw new NoSuchElementException
                    ("fra(" + fra + ") = til(" + til +")-tomt tabellintervall!");
        }

        //indeks til største verdi i a[fra : til>
        int m = fra;
        int maksverdi = a[fra]; //største verdi i a[fra : til>

        for (int i = fra + 1; i < til; i++){
            if (a[i] > maksverdi){
                m = i; //indeks til største verdi oppdateres
                maksverdi = a[m]; //største verdi oppdateres
            }
        }
        return m; //posisjonen til største verdi i a[fra : til>
    }
}

