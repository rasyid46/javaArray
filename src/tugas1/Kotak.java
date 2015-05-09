/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugas1;

/**
 *
 * @author Ezyweb
 */
public class Kotak extends PersegiPanjang{
        public static void main(String[] args) {
        PersegiPanjang PP = new PersegiPanjang();
        PP.setPjg(5);
        PP.setLeb(5);
        System.out.println("Luas Persegi Panjang = "+PP.getLuas());
        System.out.println("Kel Persegi Panjang = "+PP.getKel());
        Persegi P = new Persegi();
        P.setSisi(10);
        System.out.println("Luas Persegi = "+P.getLuasP());
        System.out.println("Kel Persegi = "+P.getKelP());
        
    }
}
