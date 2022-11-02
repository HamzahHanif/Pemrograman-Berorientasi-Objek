/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hamzahhanif_praktikum3;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Hamzahhanif_Praktikum3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        while (true){
        System.out.print("Masukkan nilai : ");
        int nilai = input.nextInt();
        
        if (nilai>100){
            System.out.println("Input tidak sesuai");
            break;
        }
        if((nilai%10)==0){
            System.out.println("Ini kelipatan 10");
            continue;
        }
        char hurufMutu;
        
  
        
        if(nilai >= 76){
//            System.out.println("Anda Lulus!");
            hurufMutu='A';
        }
        else if(nilai>=71){
//            System.out.println("Anda Lulus Bersyarat!");
            hurufMutu='B';
        }
        else if(nilai>=66){
//            System.out.println("Anda harus mengulang!");
            hurufMutu='C';
        }
        else{
//            System.out.println("Nilai anda tidak memenuhi!");
            hurufMutu='D';
        }
        
        switch(hurufMutu){
            case'A':
                System.out.println("Sangat Baik");
                break;
            case'B':
                System.out.println("Baik");
                break;
            case'C':
                System.out.println("Cukup");
                break;
            case'D':
                System.out.println("Kurang");
                break;
            default:
                System.out.println("Huruf Mutu tidak sesuai");
        }
        
       } 
    }
        
    
}
