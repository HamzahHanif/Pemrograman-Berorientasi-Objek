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
public class SegiEmpat extends BangunDatar {
    private double sisi;
    
    public SegiEmpat(double sisi, String warna){
        this.sisi = sisi;
        this.warna = warna;
    }

    @Override
    public double luas() {
        return getSisi() * getSisi();
    }

    @Override
    public double keliling() {
       return 4 * getSisi();
    }

    
    /**
     *
     * @return
     */
    public String getWarna(){
        return  this.warna;
    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }

    /**
     * @return the sisi
     */
    public double getSisi() {
        return sisi;
    }

    /**
     * @param sisi the sisi to set
     */
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    
}


