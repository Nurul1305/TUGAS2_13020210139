/* NIM           : 13020210139
Nama             : Nurul Faisah 
Hari/Tanggal     : Jum'at,24 Maret
Waktu Pengerjaan :  14.08 */

import java.util.Scanner;

/* Baca N, */
/* Print i = 1 s/d N dengan ITERATE */
public class PrintIterasi {

    public static void main (String[] args) {
        //TODO Auto generated method stub
        /* Kamus : */
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print("Nilai N >0 = "); /* Inisialisasi */
        N =  masukan.nextInt();

        i = 1;      /* First Elmt */
        System.out.print("Print i dengan ITERATE : \n");
        for (;;) {
            System.out.println(i); /* Proses */
            if (i == N)
                /* Kondisional Berhenti */  break;
            else {
                i++;    /* Next Elmt */
            }
        } /* (i == N) */
    }
}