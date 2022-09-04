package ukeoppgaverUke35;

//Oppgave 2 avsnitt 1.2.2 - Kjør programmet i Programkode 1.2.2 b).
public class Program {
    public static void main (String[] args){
        int[] a = Tabell.randPerm(20);
        for (int k : a) System.out.println(k + "");
        int m = Tabell.maks(a); //finner posisjonen til største verdi

        System.out.println("\n største verdi ligger på plass " + m);
    }
}
