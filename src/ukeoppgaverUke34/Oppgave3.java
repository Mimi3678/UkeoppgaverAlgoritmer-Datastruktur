package ukeoppgaverUke34;

public class Oppgave3 {
    public static void main (String[] args){
        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};

        System.out.println(maks(a));
    }

    // a er en heltallstabell
    static int maks(int[] a){
        if (a.length < 1)
            throw new java.util.NoSuchElementException("a er tom");

        int m = a.length - 1;  // indeks til største verdi

        for (int i = a.length - 2; i >= 0; i--) // starter nest bakerst
        {
            if (a[i] > a[m]) m = i;  // indeksen oppdateres
        }

        return m;  // returnerer indeksen/posisjonen til største verdi

    } // maks

}
