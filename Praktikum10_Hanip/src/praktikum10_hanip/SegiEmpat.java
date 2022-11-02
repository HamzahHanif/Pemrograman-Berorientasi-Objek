/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum10_hanip;

/**
 *
 * @author Praktikan
 */
public class SegiEmpat extends BangunDatar {
    private double sisi;
    public SegiEmpat(String warna, double sisi){
        super(warna);
        this.sisi = sisi;
    }

    
    
    @Override
    public double luas(){
        return Math.pow(this.getSisi(), 2);
    }
    
    @Override
    public double keliling(){
        return 4 * this.getSisi();
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
