/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author Ezyweb
 */
public class NilaiBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0;
        int[] nilai = new int[7];
        System.out.println("Masukkan 7 nilai : ");
        for (int i = 0; i < 7; i++) {
            input = in.nextInt();
            nilai[i] = input;
            System.out.println("Anda memasukkan nilai = " + input);
        }
        System.out.println("Nilai Terbesar = " + cariNilaiBesar(nilai));
        System.out.println("Nilai Terkecil = " + cariNilaiKecil(nilai));
    }
    static int cariNilaiBesar(int[] a) {
        int besar = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > besar) {
                besar = a[i];
            }
        }
        return besar;
    }
    static int cariNilaiKecil(int[] a) {
        int kecil = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < kecil) {
                kecil = a[i];
            }
        }
        return kecil;
    }
}
