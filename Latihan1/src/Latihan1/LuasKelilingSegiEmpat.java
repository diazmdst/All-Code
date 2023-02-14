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
public class LuasKelilingSegiEmpat {
    public static void main(String[] args) {
        int panjang, lebar;
        
        panjang=15;
        lebar=10;
        int luas = panjang*lebar;
        int keliling = (2*(panjang + lebar));
        System.out.println("Luas segiempat : " + luas);
        System.out.println("Keliling segiempat : " + keliling);
    }
}
