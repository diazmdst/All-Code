/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

import static java.lang.Math.sqrt;

/**
 *
 * @author ASUS
 */
public class SisiMiringSegitiga {
    public static void main(String[] args) {
        int alas, tinggi;
        double hasil;
            alas=8;
            tinggi=10;
            hasil=sqrt((alas*tinggi)+(alas*tinggi));
            System.out.println("Panjang sisi miring segitiga siku-siku adalah : "+hasil);
    }
}
