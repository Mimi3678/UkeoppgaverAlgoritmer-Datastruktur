package ukeoppgaverUke35;

import static ukeoppgaverUke35.Tabell.fratilKontroll;

public class Oppgave5Seksjon123 {
    public static void main (String[] args){

        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};
        int m = skrivIn(a, 0, 5);
        System.out.println(m);

        }

        public static void skriv(int[] a, int fra, int til){
        fratilKontroll(a.length, fra,til);
        for (int i = fra; i < til; i++)
            System.out.print(a[i] + "");
        }

    public static void skriv(char[] c, int fra, int til){
        fratilKontroll(c.length, fra, til);
        for (int i = fra; i < til; i++)
            System.out.print(c[i] + "");
    }

    public static int skrivIn(int[] c, int fra, int til){
        fratilKontroll(c.length, fra, til);
        for(int i = fra; i < til; i++) System.out.print(c[i] + "");
        System.out.println();
        return fra;
    }


}
