/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanip_praktikum6;

/**
 *
 * @author Praktikan
 */
import hanip_praktikum6.Mahasiswa;

public class Hanip_Praktikum6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs1 = new Mahasiswa();
        
        mhs1.nama = "Hanip";
        mhs1.npm = "2117051032";
        
//        System.out.println(mhs1.nama);
//        System.out.println(mhs1.npm);
        
        mhs1.insertNilaiUts(90);
        mhs1.insertNilaiUas(90);
        
        mhs1.dataMhs();

    }
    
}
