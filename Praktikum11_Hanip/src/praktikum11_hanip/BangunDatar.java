/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum11_hanip;

/**
 *
 * @author Praktikan
 */
public abstract class BangunDatar {
    String warna;
    
    public abstract double luas();
    
    public abstract double keliling();

    /**
     * @return the warna
     */
    public String getWarna() {
        return warna;
    }

    /**
     * @param warna the warna to set
     */
    public void setWarna(String warna) {
        this.warna = warna;
    }

    void print() {
        
    }
    
}
