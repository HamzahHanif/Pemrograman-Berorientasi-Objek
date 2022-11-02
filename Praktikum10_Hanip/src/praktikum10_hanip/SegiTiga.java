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
public class SegiTiga extends BangunDatar {
    private double alas;
    private double tinggi;
    public SegiTiga(String warna, double alas, double tinggi){
        super(warna);
        this.alas = alas;
    }

    
    
    @Override
    public double luas(){
        return 0.5 * this.alas * this.tinggi;
    }
    
    @Override
    public double keliling(){
        return 3 * this.alas;
    }

    /**
     * @return the alas
     */
    public double getAlas() {
        return alas;
    }

    /**
     * @param alas the alas to set
     */
    public void setAlas(double alas) {
        this.alas = alas;
    }

    /**
     * @return the tinggi
     */
    public double getTinggi() {
        return tinggi;
    }

    /**
     * @param tinggi the tinggi to set
     */
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
}
