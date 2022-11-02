/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hanip_praktikum4;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Hanip_Praktikum4 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      ARRAY
//        Scanner input = new Scanner(System.in);
//        
//        int nilai[] = new int[3];
//        System.out.print("Nilai Matematika : ");
//        nilai[0] = input.nextInt();
//        System.out.print("Nilai Logika : ");
//        nilai[1] = input.nextInt();
//        System.out.print("Nilai Bahasa : ");
//        nilai[2] = input.nextInt();     
//       
//        nilai[1] = 0;
//        
//        for(int print:nilai){
//            System.out.println(print);
//        }
//        
        
        
        
//        ARRAY 2 DIMENSI
        
        int nilai [][] = {{90,75,80},{80,90,80},{70,75,95}};
        
        for(int i[] : nilai){
            for(int j : i){
                System.out.println(j);
                

            }
        }
        
        nilai[0][1] = 70;
                
        System.out.println("Nilai setelah diganti : ");
                
        for(int i[] : nilai){
            System.out.print("[ ");
            for(int j : i){
                System.out.print(j + ", ");
            }
            System.out.println("]");
        }
    }
    
}
