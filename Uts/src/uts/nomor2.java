/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class nomor2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int type, ukuran;
        double diskon, hlama, hbaru;
        Scanner input=new Scanner(System.in);
        
        System.out.println("Type (1. LED 2. LCD) : ");
        type=input.nextInt();
        System.out.println("Ukuran (Inchi) : ");
        ukuran=input.nextInt();
        System.out.println("Harga : ");
        hlama=input.nextDouble();
        
        if (type == 1){
            diskon = hlama*0.05;
            hbaru=hlama-diskon;
            System.out.println("Harga akhir : "+hbaru);
        }
        else if (type == 2 && ukuran == 14){
            diskon=hlama*0.1;
            hbaru=hlama-diskon;
            System.out.println("Harga akhir : "+hbaru);
        }
        else if (type == 2 && ukuran == 32){
            diskon=hlama*0.12;
            hbaru=hlama-diskon;
            System.out.println("Harga akhir : "+hbaru);
        }
        else if (type == 2 && ukuran >= 40){
            diskon=hlama*0.15;
            hbaru=hlama-diskon;
            System.out.println("Harga akhir : "+hbaru);
        }
    }
    
}
