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
public class KonversiSuhu {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tampilkanMenu();   
        
    }
    static void tampilkanMenu(){
        System.out.println("Pilihan\t Label");
        System.out.println("A\t Celcius ke Fahrenteit");
        System.out.println("B\t Celcius ke Reamur");
        System.out.println("C\t Fahrenteit ke Celcius");
        System.out.println("D\t Fahrenteit ke Reamur");
        System.out.println("E\t Reamur ke Fahrenteit");
        System.out.println("F\t Reamur ke Celcius");
        System.out.println("Exit");
        System.out.print("Masukkan pilihan : ");
        String pilih = mintaInputanStr();
        convert(pilih);
        
    }
    static void convert(String pilihan){
        
        double hasil=0; int value=0;
        switch(pilihan){
            case "A":
            System.out.println("Anda memilih Celcius ke Fahrenteit ");
            System.out.print("Masukkan nilai :  "); value =  mintaInputanInt();
                hasil = (double) (9/5 * value) + 32;
                break;
            case "B":
            System.out.println("Anda memilih Celcius ke Reamur ");
                System.out.print("Masukkan nilai :  "); value = mintaInputanInt();
                hasil = (double) (4/5 * value);
                break;
            case "C":
            System.out.println("Anda memilih Fahrenteit ke Celcius ");
                System.out.print("Masukkan nilai :  "); value = mintaInputanInt();
                hasil = (double) 5/9 * (value-32);
                break;
            case "D":
            System.out.println("Anda memilih Fahrenteit ke Reamur ");
                System.out.print("Masukkan nilai :  "); value = mintaInputanInt();
                hasil = (double) 5/9 * (value-32);
                break;
            case "E":
            System.out.println("Anda memilih Reamur ke Fahrenteit ");
                System.out.print("Masukkan nilai :  "); value = mintaInputanInt();
                hasil = (double) (9/4 * value) + 32;
                break;
            case "F":
            System.out.println("Anda memilih Reamur ke Celcius ");
                System.out.print("Masukkan nilai :  "); value = mintaInputanInt();
                hasil = (double) (5/4 * value);
                break;
            case "Exit":
                System.exit(0);
            default : System.out.println("Pilihan tidak tersedia");break;
        
        }
        System.out.println("Konversi "+ value + "= "+ hasil);
        tampilkanMenu();
        
    }
    static int mintaInputanInt(){
        Scanner in = new Scanner(System.in);
        int value=in.nextInt();
        return value;
    }
    static String mintaInputanStr(){
        Scanner in = new Scanner(System.in);
        String value=in.nextLine();
        return value;
    }
}
