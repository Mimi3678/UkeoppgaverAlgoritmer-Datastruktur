package ukeoppgaverUke34;

public class Oppgave2 {
    public static void main (String[] args) {
        int[] a = {8, 4, 17, 10, 6, 20, 1, 11, 15, 3, 18, 9, 2, 7, 19};

        int minIndex = min(a);
        System.out.println(minIndex); //kalle den for at det skal printe ut
        System.out.println(a[minIndex]); //finne verdien til minste verdi
    }

    static int min(int[] a) {
        //Initialiser med første element
        int minValue = a[0];
        int minIndex = 0;

        //Looper over alle resterende elementer og sjekk om vi finner
        //et mindre tall
        for (int i=1; i < a.length; ++i) {
            int value = a[i];
            int index = i;

            //Sjekk om verdien er mindre enn det vi har sett tidligere
            if (value < minValue) {
                minValue = value;
                minIndex = index;
            }
        }
        //returner index til minste verdi
        return minIndex;
    }

}
