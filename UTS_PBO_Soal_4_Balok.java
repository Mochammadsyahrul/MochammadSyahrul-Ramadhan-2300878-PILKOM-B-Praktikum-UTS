/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PBO;

/**
 *
 * @author Mochammad Syahrul Ramadhan (2300878)
 */
public class UTS_PBO_Soal_4_Balok {
    private int panjang, lebar, tinggi;

    public UTS_PBO_Soal_4_Balok (int p, int l, int t) {
        this.panjang = p;
        this.lebar = l;
        this.tinggi = t;
    }

    public int hitungLuas() {
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }

    public int hitungKeliling() {
        return 4 * (panjang + lebar + tinggi);
    }

    public int hitungVolume() {
        return panjang * lebar * tinggi;
    }

    public void display() {
        System.out.println("Author : Mochammad Syahrul Ramadhan(2300878)");
        System.out.println("");
        System.out.println("Balok dengan panjang = " + panjang + ", lebar = " + lebar + " dan tinggi = " + tinggi + 
        " : Luasnya = " + hitungLuas() + ", sedangkan kelilingnya = " + hitungKeliling() + " dan volumenya = " + hitungVolume());
    }
}
