/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nomer3;

import java.util.Scanner;


public class Nomer3 {

    // Method untuk menghitung jumlah digit
    public static int sumDigits(long n) {
        int jumlah = 0;
        while (n != 0) {
            int digit = (int)(n % 10);  // Ambil digit terakhir
            jumlah += digit;            // Tambahkan ke total
            n = n / 10;                 // Hapus digit terakhir
        }
        return jumlah;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input dari pengguna
        System.out.print("Masukkan bilangan bulat: ");
        long angka = input.nextLong();

        // Memanggil method dan menampilkan hasil
        int totalDigit = sumDigits(angka);
        System.out.println("Jumlah digit dari " + angka + " adalah: " + totalDigit);
    }
}
