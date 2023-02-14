/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_b_215314060;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Soal_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumGalon, jumBbesar, jumBkecil, jumGelas;
        int hGalon, hBbesar, hBkecil, hGelas;
        int hlGalon, hlBbesar, hlBkecil, hlGelas, totalhl, bayar;
        double discGalon, discBbesar, discBkecil, discGelas, totalhdisc;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Nota Warung 'Air Surga' ");
        System.out.println("Nama : Diaz Madestu Pratama");
        System.out.println("NIM  : 215314060");
        
        System.out.println(" ");
        
        System.out.print("Masukkan Jumlah Galon   : ");
        jumGalon=input.nextInt();
        System.out.print("Masukkan Jumlah B.Besar : ");
        jumBbesar=input.nextInt();
        System.out.print("Masukkan Jumlah B.Kecil : ");
        jumBkecil=input.nextInt();
        System.out.print("Masukkan Jumlah Gelas   : ");
        jumGelas=input.nextInt();
        
        System.out.println(" ");
        
        hGalon=30000;
        hBbesar=5000;
        hBkecil=3000;
        hGelas=1000;
        
        hlGalon=jumGalon*hGalon;
        hlBbesar=jumBbesar*hBbesar;
        hlBkecil=jumBkecil*hBkecil;
        hlGelas=jumGelas*hGelas;
        
        discGalon=hlGalon*0.15;
        discBbesar=hlBbesar*0.12;
        discBkecil=hlBkecil*0.10;
        discGelas=hlGelas*0.20;
        
        totalhl=hlGalon+hlBbesar+hlBkecil+hlGelas;
        totalhdisc=discGalon+discBbesar+discBkecil+discGelas;
        bayar=(int) (totalhl-totalhdisc);
        
        System.out.println("Jml Kemasan  @     harga   discount");
        System.out.println("====================================");
        System.out.println(jumGalon+"   Galon   "+hGalon+" "+hlGalon+"  "+discGalon);
        System.out.println(jumBbesar+"   B.Besar "+hBbesar+"  "+hlBbesar+"  "+discBbesar);
        System.out.println(jumBkecil+"   B.Besar "+hBkecil+"  "+hlBkecil+"  "+discBkecil);
        System.out.println(jumGelas+"   B.Besar "+hGelas+"  "+hlGelas+"   "+discGelas);
        System.out.println("====================================");
        System.out.println("Total             "+totalhl+"  "+totalhdisc);
        System.out.println("Dibayarkan   "+bayar);
    }

}
