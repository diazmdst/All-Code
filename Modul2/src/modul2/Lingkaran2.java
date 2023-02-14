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
public class Lingkaran2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Mendeklarasikan variable
        double r, diameter, phi, luas, keliling;
        //Data nilai variable
        r=15;
        phi=3.14;
        diameter=2*r;
        //Rumus digunakan
        luas=phi*(r*r);
        keliling=phi*diameter;
        //Output
        System.out.println("Menghitung luas dan keliling lingkaran");
        System.out.println("Nilai jari-jari (r) adalah : " +r);
        System.out.println("Nilai diameter (D) adalah : " +diameter);
        System.out.println("Nilai phi yang digunakan adalah : "+phi);
        System.out.println(".......................................");
        System.out.println("Luas lingkaran : "+luas);
        System.out.println("keliling lingakaran : "+keliling);
        System.out.println("Adioss.....");
    }
    
}
