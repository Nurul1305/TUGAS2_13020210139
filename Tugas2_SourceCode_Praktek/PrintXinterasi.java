/* NIM           : 13020210139
Nama             : Nurul Faisah 
Hari/Tanggal     : Jum'at,24 Maret
Waktu Pengerjaan :  15.01 */

import java.util.Scanner;

/* contoh baca nilai x, */
/* Jumlah nilai yang dibaca dengan ITERATE */
public class PrintXinterasi {

    public static void main (String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        int Sum =0;
        int x;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Masukan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt();  /* First Elmt */
        if (x == 999) {
            System.out.print ("Kasus kosong \n");
        }else {     /* Minimal ada satu data yang dijumlahkan */
                Sum = x;    /* Inisialisasi; invariant !!*/
                for (;;) {
                    System.out.print("Masukan nilai x (int), akhiri dg 999 : ");
                    x = masukan.nextInt();  /*Next Elmt */
                    if (x==999)
                        break;
                    else{
                        Sum = Sum + x;  /* Proses */
                    }
                }

        }
        System.out.println ("Hasil penjumlahan = "+ Sum);
    /* Terminasi */
    }
}
