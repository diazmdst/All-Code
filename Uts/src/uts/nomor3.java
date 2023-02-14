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
public class nomor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumA, jumB, jumC, hari;
        double total, hlama, disc;
        Scanner input=new Scanner(System.in);
        
        System.out.print("Jumlah Barang A : ");
        jumA=input.nextInt();
        System.out.print("Jumlah Barang B : ");
        jumB=input.nextInt();
        System.out.print("Jumlah Barang C : ");
        jumC=input.nextInt();
        System.out.print("Hari : ");
        hari=input.nextInt();
        
        if (hari >= 1 && hari <= 3){
            hlama=(jumA*10000)+(jumB*15000)+(jumC*20000);
            System.out.println("Total : Rp "+hlama);
        }
        else if (hari >= 4 && hari <= 5){
            hlama=(jumA*10000)+(jumB*15000)+(jumC*20000);
            disc=hlama*0.10;
            total=hlama-disc;
            System.out.println("Total : Rp "+total);
        }
        else if (hari >= 6 && hari <= 7){
            hlama=(jumA*10000)+(jumB*15000)+(jumC*20000);
            disc=hlama*0.20;
            total=hlama-disc;
            System.out.println("Total : Rp "+total);
        }
    }
}
