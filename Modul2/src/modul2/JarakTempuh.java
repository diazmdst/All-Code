/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class JarakTempuh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Berfungsi input data dari user
        Scanner input=new Scanner(System.in);
        
        //Mendeklarasikan variable
        double Vo;
        double a;
        double t;
        double St;
        
        //Tampilkan output
        System.out.println("Menghitung jarak tempuh");
        System.out.println("Masukkan kecepatan awal = ");
        //Menyimpan input user ke variable
        Vo=input.nextDouble();
        //tampilkan output
        System.out.println("Masukkan percepatan = ");
        //Menyimpan input user ke variable
        a=input.nextDouble();
        //tampilkan output
        System.out.println("Masukkan waktu = ");
        //Menyimpan input user ke variable
        t=input.nextDouble();
        St=((Vo*t)+(0/5*a*t*t));
        //tampilkan output
        System.out.println("Jadi, jarak yang ditempuh mobil yaitu "+St+ "km");
    }
    
}
