/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nomer1;

import java.util.Random;

public class Nomer1 {

    public static void main(String[] args) {
        // Membuat objek random
        Random acak = new Random();

        // Menghasilkan angka acak antara 1 dan 12
        int nomorBulan = acak.nextInt(12) + 1;

        // Menampilkan angka acak yang dihasilkan
        System.out.println("Angka yang dihasilkan: " + nomorBulan);

        // Menentukan nama bulan sesuai angka
        String namaBulan;

        switch (nomorBulan) {
            case 1: namaBulan = "Januari"; break;
            case 2: namaBulan = "Februari"; break;
            case 3: namaBulan = "Maret"; break;
            case 4: namaBulan = "April"; break;
            case 5: namaBulan = "Mei"; break;
            case 6: namaBulan = "Juni"; break;
            case 7: namaBulan = "Juli"; break;
            case 8: namaBulan = "Agustus"; break;
            case 9: namaBulan = "September"; break;
            case 10: namaBulan = "Oktober"; break;
            case 11: namaBulan = "November"; break;
            case 12: namaBulan = "Desember"; break;
            default: namaBulan = "Tidak diketahui";
        }

        // Menampilkan nama bulan
        System.out.println("Nama bulan: " + namaBulan);
    }
}
