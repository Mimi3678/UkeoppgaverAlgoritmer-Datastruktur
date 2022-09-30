package ukeoppgaverUke36;

import ukeoppgaverUke35.Tabell;

import javax.swing.text.TabableView;

public class Oppgave3Seksjon135 {
    public static void main (String[] args){

        int[] a = {3,8,10,12,14,16,21,24,27,30,32,33,34,37,40};
        System.out.println(Tabell.lineærsøk(a,24));
        System.out.println(Tabell.lineærsøk(a,30));

    }

    public static int lineærsøk(int[] a, int verdi){
        if (a.length == 0 || verdi < a[0])
            return -1; //verdi er mindre enn det største
        int i = a.length - 1; for (; a[i] > verdi; i--);
        return verdi == a[i]? i : -(i + 2);
    }
}
