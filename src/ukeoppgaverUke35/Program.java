package ukeoppgaverUke35;

//Oppgave 2 avsnitt 1.2.2 - Kjør programmet i Programkode 1.2.2 b).
public class Program {
    public static void main (String[] args){
        /*int[] a = Tabell.randPerm(20);
        for (int k : a) System.out.println(k + "");
        int m = Tabell.maks(a); //finner posisjonen til største verdi

        System.out.println("\n største verdi ligger på plass " + m);
         */


        //Oppgave 1 - avsnitt 1.2.4
        int[] a = Tabell.randPerm(20); // tilfeldig permutasjon av 1 . . 20
        int[] b = Tabell.nestMaks(a);  // metoden returnerer en tabell

        int m = b[0], nm = b[1];       // m for maks, nm for nestmaks

        Tabell.skrivIn(a);        // se Oppgave 5 i Avsnitt 1.2.2
        System.out.print("Størst(" + a[m] + ") har posisjon " + m);
        System.out.println(", nest størst(" + a[nm] + ") har posisjon " + nm);
    }


}
