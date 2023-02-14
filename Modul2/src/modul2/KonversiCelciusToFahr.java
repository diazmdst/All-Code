/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

/**
 *
 * @author ASUS
 */
public class KonversiCelciusToFahr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Mendeklarasikan variable
        int celcius;
        int fahrenheit;
        
        //Data nilai variable
        celcius=5;
        //Rumus konversi ke fahrenheit
        fahrenheit=(celcius*9/5)+32;
        
        //Hasil output tertera
        System.out.print("Suhu 5 derajat celcius = " +fahrenheit+ " derajat fahrenheit");
    }
    
}
