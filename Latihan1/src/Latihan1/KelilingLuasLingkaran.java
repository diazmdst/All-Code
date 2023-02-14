/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan1;

/**
 *
 * @author ASUS
 */
public class KelilingLuasLingkaran {

    private static double keliling, luas;
    public static void main(String[] args) {
        int r;
        
        r=21;
        keliling = 3.14 * 2 * r;
        luas = 3.14 * r * r;
        System.out.println("Keliling lingkaran : "+keliling);
        System.out.println("Luas lingkaran : "+luas);
    }
}