/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanip.praktikum7;

/**
 *
 * @author Praktikan
 */
public class Mahasiswa {
    private String nama;
    private String npm;
    private double nilaiTugas;
    private double nilaiUas;
    private double nilaiUts;
    private double NA;
    
    //constructor (cara cepat klik kanan insert code, constructor)
    public Mahasiswa(String nama, String npm, double nilaiTugas, double nilaiUts, double nilaiUas){
        this.nama = nama;
        this.npm = npm;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts; 
        this.nilaiUas = nilaiUas;
    }
    //---------------------------------------
   
    
    public void printData(String jurusan){
        System.out.println("NPM\t:" + this.npm);
        System.out.println("Nama\t:" + this.nama);
        System.out.println("Jurusan\t:" + jurusan);
    }
    
    public int sumValue(int x, int y){
        return x+y;
    }
    
    public void hitungNA(){
        this.NA = (this.nilaiTugas*0.3) + (this.nilaiUts*0.35) + (this.nilaiUas*0.35);
    }
    
    public void hitungNA(double nilaiTugas, double nilaiUts, double nilaiUas){
        this.NA = (nilaiTugas*0.3) + (nilaiUts*0.35) + (nilaiUas*0.35);
        System.out.println(this.NA);
    }
    
    public void hitungNA(String pesan){
        System.out.println("Nilai tidak valid");
    }

    //setter getter, cara cepat (klik kanan, refactor, encapsulate)
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    
}
