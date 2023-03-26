/* NIM           : 13020210139
Nama             : Nurul Faisah 
Hari/Tanggal     : Kamis,23 Maret
Waktu Pengerjaan : 15.12 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.*;
public class BacaString {

    public static void main (String[] args) throws IOException{
        //TODO Auto-generated method stub
        /* Kamus */
        String str;

        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
        /* Program */

        System.out.print ("\nBaca string dan Integer : \n");

        System.out.print("masukkan sebuah string  : ");

        str = datAIn.readLine();

        System.out.print("String yang dibaca : "+ str );
    }

}
