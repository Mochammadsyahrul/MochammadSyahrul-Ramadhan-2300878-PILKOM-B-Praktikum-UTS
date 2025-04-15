/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PBO;

/**
 *
 * @author Mochammad Syahrul Ramadhan (2300878)
 */
public class UTS_PBO_Soal_2_PatternC {
    public static void main(String[] args) {
        System.out.println("Author : Mochammad Syahrul Ramadhan(2300878)");
        System.out.println("Pattern C :");
        for (int i = 1; i <= 6; i++) {

            for (int s = 1; s <= 6 - i; s++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}



