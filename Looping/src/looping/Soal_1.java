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
public class Soal_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bensin = 0;
        int harga, jumlah;
        Scanner input = new Scanner(System.in);
        System.out.print("harga per liter Rp ");
        harga=input.nextInt();
        System.out.println("Jumlah liter \tHarga (RP)");
        System.out.println("=============================");
        while(bensin < 20){
            bensin = bensin + 1;
            jumlah = harga * bensin;
            System.out.print(bensin);
            System.out.println("\t\t"+jumlah);
        }
        System.out.println("=============================");
    }
    }
