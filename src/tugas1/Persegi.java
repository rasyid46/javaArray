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
public class Persegi {
     int sisi;
    
    public Persegi(){
        System.out.println("Kelas Persegi");
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    
    public int getLuasP(){
        return this.sisi*this.sisi;
    }
    
    public int getKelP(){
        return 4*this.sisi;
    }
}
