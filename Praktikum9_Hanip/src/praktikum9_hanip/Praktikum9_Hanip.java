/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum9_hanip;

      
/**
 *
 * @author Praktikan
 */
public class Praktikum9_Hanip {
//    public String atributBukanStatic = "Atribut Bukan Static";
//    static String atributStatic = "Atribut static";
//    
//    public void bukanStatic(){
//        System.out.println("Bukan Static");
//    }
//    static void methodStatic(){
//        System.out.println("Method Static");
//    }
//    /**
//     * @param args the command line arguments
//     */
    
    public static class Tabung{
        private final static double pi = Math.PI;
        public static double volume(double r, double t){
            double vol = pi*r*r*t;
            return vol;
        }
        public static double LuasPermukaan(double r, double t){
            double LuasPermukaan = (2*pi*r*(r+t));
            return LuasPermukaan;
        }
    }
    public static void main(String[] args) {
//        // TODO code application logic here
//        Praktikum9_Hanip praktikum = new Praktikum9_Hanip();
//        
//        System.out.println(praktikum.atributBukanStatic);
//        System.out.println(atributStatic);
////        bukanStatic();
//        methodStatic();
////        System.out.println(atributBukanStatic);
//        System.out.println(atributStatic);
//        
        System.out.println(Tabung.LuasPermukaan(2,3));
    }
    
}
