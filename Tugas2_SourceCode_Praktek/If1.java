/* NIM           : 13020210139
Nama             : Nurul Faisah 
Hari/Tanggal     : Kamis,23 Maret
Waktu Pengerjaan : 15.48 */

/* contoh pemakaian IF satu kasus */
/* membaca nilai integer, menuliskan nilainya jika positif */

import java.util.Scanner;

public class If1 {

    public static void main (String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        Scanner masukan=new Scanner(System.in);
        int a;
        /* Programm */

        System.out.print ("Contoh IF satu kasus \n");
        System.out.print ("Ketikkan suatu nilai integer : ");
        a = masukan.nextInt();
        if (a >= 0)
        System.out.print ("\nNilai a positif "+a);

    }
}