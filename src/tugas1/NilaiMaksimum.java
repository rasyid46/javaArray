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
public class NilaiMaksimum {

   public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int input =0;
        int[] nilai = new int[5];
        System.out.println("Masukkan 5 nilai : ");
        for(int i=0;i<5;i++){
            input =  in.nextInt();
            nilai[i] = input;
        }
        System.out.println("Nilai Maksimum = " +cariMax(nilai));
    }
    static int cariMax(int[] a){
        int MAKS = 1;
        for(int i = 0; i<a.length;i++){
            if(a[i]> MAKS){
                MAKS = a[i];
            }
        }
        return MAKS;
    }  
    
}
