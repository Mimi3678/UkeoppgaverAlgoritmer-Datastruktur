package ukeoppgaverUke35;

//lag to min-metoder tilsvarende de to maks-metodene
//i programkode 1.2.1b og 1.2.1c - seksjon 1.2.1
public class Oppgave1 {
    public static void main(String[] args){
        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};
        int m = min(a,0,15);

        System.out.print(m);
        System.out.println("\n----------------------------------");
        System.out.println(min2(a));
    }

    //Første min-metode
    public static int min(int [] a, int fra, int til){
        if (fra < 0 || til > a.length || fra >= til){
            throw  new IllegalArgumentException("Illegal intervall");
        }

        int m = fra;
        int minsteverdi = a[fra];

        for (int i = fra + 1; i < til; i++) if (a[i] < minsteverdi){
            m = i;
            minsteverdi = a[m];
        }
        return m;
    }

    //Andre min-metode
    public static int min2(int[] a){
        return min(a,0,a.length);
    }
}
