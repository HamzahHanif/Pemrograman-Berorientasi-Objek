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
public class SegiTiga extends BangunDatar {
    private double alas;
    private double tinggi;
    
    public SegiTiga(double alas,double tinggi, String warna){
        this.alas = alas;
        this.tinggi = tinggi;
        this.warna = warna;
    }

    @Override
    public double luas() {
        return getAlas() * getTinggi() * 0.5;
    }

    @Override
    public double keliling() {
       return 3 * getAlas();
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

