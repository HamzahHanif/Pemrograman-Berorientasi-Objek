/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak15_hanipp;

/**
 *
 * @author Praktikan
 */
public class Mahasiswa {
    private String NPM;
    private String Nama;
    private String Alamat;

    public Mahasiswa(String NPM, String Nama, String Alamat) {
        this.NPM = NPM;
        this.Nama = Nama;
        this.Alamat = Alamat;
    }

    /**
     * @return the NPM
     */
    public String getNPM() {
        return NPM;
    }

    /**
     * @param NPM the NPM to set
     */
    public void setNPM(String NPM) {
        this.NPM = NPM;
    }

    /**
     * @return the Nama
     */
    public String getNama() {
        return Nama;
    }

    /**
     * @param Nama the Nama to set
     */
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    /**
     * @return the Alamat
     */
    public String getAlamat() {
        return Alamat;
    }

    /**
     * @param Alamat the Alamat to set
     */
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
}
