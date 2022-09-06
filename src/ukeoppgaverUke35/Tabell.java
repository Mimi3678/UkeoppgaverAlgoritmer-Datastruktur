package ukeoppgaverUke35;

import java.util.Arrays;
import java.util.Random;

//Bygg opp class Tabell slik som beskrevet i Programkode 1.2.2 a).
//Hjelpe Klasser Oppgave1 Seksjon1.2.2
public class Tabell {
    public static void main(String[] args){
    }

    private Tabell(){}

    //Metoden bytt(int[]a, int i, int j)
    public static void bytt(int[]a, int i, int j){
        int temp = a[i]; a[i] = a[j]; a[j] = temp;
    }

    //Metoden randPerm(int n)
    public static int[] randPerm(int n){
        Random r = new Random();
        int[] a = new int[n];

        Arrays.setAll(a, i -> i + 1);
        for (int k = n-1; k > 0; k--){
          int i = r.nextInt(k + 1);
          bytt(a,k,i);
        }
        return a;
    }

    //Metoden randPerm(int[] a)
    public static void randPerm(int[] a){ //stokker om a
        Random r = new Random(); //en randomgenerator
        for (int k = a.length - 1; k > 0; k--){
            int i = r.nextInt(k + 1); //tilfeldig tall fra [0,k]
            bytt(a,k,i);
        }
    }

    //Metoden maks(int[]a, int fra, int til) - finne maks-metoden
    public static int maks(int[] a, int fra, int til){
        if(fra < 0 || til > a.length || fra >= til){
            throw new IllegalArgumentException("Illegalt intervall");
        }

        int m = fra; //indeks til største verdi i a[fra : til>
        int maksverdi = a[fra]; //største verdi i a[fra : til>

        for (int i = fra + 1; i < til; i++){
            if (a[i] > maksverdi){
                m = i; //indeks til største verdi oppdateres
                maksverdi = a[m]; //største verdi oppdateres
            }
        }
        return m; //posisjonen til største verdi i a[fra : til>
    }

    //Metoden maks(int[] a)
    public static int maks(int[] a){ //bruker hele tabellen
        return maks(a, 0, a.length); //kaller metoden over
    }

    //Første minMetode - se oppgave 1 i avsnitt 1.2.1
    public static int min(int[] a, int fra, int til){
        if (fra < 0 || til > a.length || fra >= til)
            throw new IllegalArgumentException("Illegalt intervall");

            int m = fra;
            int minverdi = a[fra];
            for (int i = fra + 1; i < til; i++) if (a[i] < minverdi){
                m = i;
                minverdi = a[m];
            }
        return m;
        }

    //Andre minMetode - se oppgave 1 i avsnitt 1.2.1
    public static int min(int[] a){
        return min(a, 0, a.length);
    }

    //Oppgave 3 - avsnitt 1.2.2
    //Lag metoden public static void bytt(char[] c, int i, int j).
    // Den skal bytte om innholdet i posisjon i og j  i char-tabellen c. Legg metoden i samleklassen Tabell.
    public static void skriv(char[] a, int fra, int til){
        char temp = a[fra]; a[fra] = a[til]; a[til] = temp;
    }

    //Oppgave 4 - avsnitt 1.2.2
    //lag metoden static void skriv(int[]a, int fra, int til) - skal skrive ut alle på en linje
    //og et mellomrom på hvert tall
    //Lag også metoden public static void skriv(int[]a) - skal skrive ut hele tabellen på en linje
    public static void skriv(int[] a, int fra, int til){
        fratilKontroll(a.length, fra, til);
        if (til - fra > 0) System.out.print(a[fra]);
        for (int i = fra + 1; i < til; i++) System.out.print("" + a[i]);
    }

    public static void skriv(int[] a){
        skriv(a,0,a.length);
    }

    //oppgave 5 - avsnitt 1.2.2
    //lag to skrivIn metoder. Skal ha samme signatur og fungere på samme måte som oppgaven ovenfor
    public static void skrivIn(int[] a, int fra, int til){
        skriv(a, fra, til);
        System.out.println();
    }

    public static void skrivIn(int[] a){
        skrivIn(a,0,a.length);
    }

    //Kontroll test - avsnitt 1.2.3 feil og unntakk
    public static void fratilKontroll(int tablengde, int fra, int til)
    {
        if (fra < 0)                                  // fra er negativ
            throw new ArrayIndexOutOfBoundsException
                    ("fra(" + fra + ") er negativ!");

        if (til > tablengde)                          // til er utenfor tabellen
            throw new ArrayIndexOutOfBoundsException
                    ("til(" + til + ") > tablengde(" + tablengde + ")");

        if (fra > til)                                // fra er større enn til
            throw new IllegalArgumentException
                    ("fra(" + fra + ") > til(" + til + ") - illegalt intervall!");
    }

    //Metode for nest Maks
    public static int[] nestMaks(int[] a)  // legges i class Tabell
    {
        int n = a.length;   // tabellens lengde

        if (n < 2) throw   // må ha minst to verdier!
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = maks(a);  // m er posisjonen til tabellens største verdi

        int nm;           // nm skal inneholde posisjonen til nest største verdi

        if (m == 0)                            // den største ligger først
        {
            nm = maks(a, 1, n);                  // leter i a[1:n>
        }
        else if (m == n - 1)                   // den største ligger bakerst
        {
            nm = maks(a, 0, n - 1);              // leter i a[0:n-1>
        }
        else
        {
            int mv = maks(a, 0, m);              // leter i a[0:m>
            int mh = maks(a, m + 1, n);          // leter i a[m+1:n>
            nm = a[mh] > a[mv] ? mh : mv;        // hvem er størst?
        }

        return new int[] {m,nm};      // m i posisjon 0 , nm i posisjon 1

    } // nestMaks
}
