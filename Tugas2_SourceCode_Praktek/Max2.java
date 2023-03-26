/* NIM           : 13020210139
Nama             : Nurul Faisah 
Hari/Tanggal     : Kamis,23 Maret
Waktu Pengerjaan : 22.58 */

import java.util.Scanner;

/* Maksimum dua bilangan yang dibaca */
public class Max2 {

    public static void main(String[] args) {
        //TODO Auto-genrated method stub
        /* Kamus */
        int a, b;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Maksimum dua bilangan : \n");
        System.out.print ("Ketikkan dua bilangan, pisahakan dg RETURN :  \n");

        a=masukan.nextInt();
        b=masukan.nextInt();
        System.out.println("Ke dua bilangan : a = "+ a +"b = "+b);
        if (a >= b){
            System.out.println ("Nilai a yang maksimum: "+ a);
        }else /* a > b */ {
            System.out.println ("Nilai b yang maksimum: "+ b);
        }


    }
}