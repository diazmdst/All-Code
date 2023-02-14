/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Soal_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int min, max, sls;
        int r, f;
        
        System.out.println("Tabel Konversi Celcius ke Reamur dan Fahrenheit");
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai suhu minimum   : ");
        min=input.nextInt();
        System.out.print("Masukkan nilai suhu maksimum  : ");
        max=input.nextInt();
        System.out.print("Masukkan selisih kenaikan     : ");
        sls=input.nextInt();
        
        System.out.println("Celcius\tReamur\tFahrenheit");
        while (min<=max){
            r=(4*min)/5;
            f=((9*min)/5)+32;
            System.out.println(min+"\t"+r+"\t"+f);
            min+=sls;
        }
    }
}
