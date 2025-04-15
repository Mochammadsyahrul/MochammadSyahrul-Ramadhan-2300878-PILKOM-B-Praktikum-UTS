/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Mochammad Syahrul Ramadhan (2300878)
 */
package UTS_PBO;
import java.util.Scanner;
public class UTS_PBO_Soal_1 {
    public static void main(String[] args) {
        Scanner Soal_1 = new Scanner(System.in);
        
        System.out.println ("Author : Mochammad Syahrul Ramadhan (2300878)");
        System.out.print("Masukan tiga digit integer : ");
        int bilangan = Soal_1.nextInt();

        if (bilangan < 100 || bilangan > 999) {
            System.out.println("Harap masukkan bilangan bulat tiga digit!");
            return;
        }
        int bilanganAsli = bilangan;
        int bilanganTerbalik = 0;

        while (bilangan != 0) {
            int digit = bilangan % 10;
            bilanganTerbalik= bilanganTerbalik * 10 + digit;
            bilangan /= 10;
        }
        if (bilanganAsli  == bilanganTerbalik) {
            System.out.println(bilanganAsli + " adalah palindrom");
        } else {
            System.out.println(bilanganAsli + " bukan palindrom");
        }
    }
}
