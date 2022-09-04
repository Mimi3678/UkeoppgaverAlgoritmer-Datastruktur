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

    //Metoden maks(int[]a, int fra, int til)
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
}
