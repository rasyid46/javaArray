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
public class PersegiPanjang {
    private int panjang;
    private int lebar;
    
    public PersegiPanjang(){
        System.out.println("Kelas PersegiPanjang");
    }   
    public int getPjg() {
        return panjang;
    }
    public void setPjg(int panjang) {
        this.panjang = panjang;
    }
    public int getLeb() {
        return lebar;
    }
    public void setLeb(int lebar) {
        this.lebar = lebar;
    }
    
    public int getLuas(){
        return this.panjang*this.lebar;
    }
    public int getKel(){
        return 2*(this.panjang+this.lebar);
    }
}
