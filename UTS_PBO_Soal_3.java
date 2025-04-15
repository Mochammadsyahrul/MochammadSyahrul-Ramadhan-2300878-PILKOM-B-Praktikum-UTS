/*
 * Klik nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt untuk mengubah lisensi ini
 * Klik nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java untuk mengedit template ini
 */
package UTS_PBO;

/**
 *
 * @author Mochammad Syahrul Ramadhan (2300878)
 */
import java.util.Scanner;
public class UTS_PBO_Soal_3 {
    public static int angkaReverse(int angka) {
        int hasilReverse = 0;
        while (angka != 0) {
            int digit = angka % 10;
            hasilReverse  = hasilReverse  * 10 + digit;
            angka /= 10;
        }
        return hasilReverse ;
    }
    public static boolean angkaPalindrom(int angka) {
        return angka == angkaReverse(angka);
    }
    
    //kelas utama nya/class main
    public static void main(String[] args) {
        Scanner masukanBilangan = new Scanner(System.in);
        System.out.println("Author : Mochammad Syahrul Ramadhan(2300878)");
        System.out.println("");
        System.out.print("Masukkan sebuah bilangan bulat: ");
        int angka = masukanBilangan.nextInt();

        if (angkaPalindrom(angka)) {
            System.out.println(angka + " adalah palindrom.");
        } else {
            System.out.println(angka + " bukan palindrom.");
        }
    }
}



