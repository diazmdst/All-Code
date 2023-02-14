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
public class JarakTempuhMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Mendeklarasikan variable
        double Vo, a, t, St;
        
        //Variable dari diketahui
        Vo=30;
        a=1.5;
        t=20;
        
        //rumus
        St=((Vo*t)+(0.5*a*t*t));
        
        //Cetak output
        System.out.print("Mobil kecepatan awal "+Vo+" km/jam, Percepatan "+a+" m/s dan waktu "+t);
        System.out.println(" s berjalan sejauh "+St+" km");
    }
    
}
