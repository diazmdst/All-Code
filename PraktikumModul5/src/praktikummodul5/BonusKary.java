/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikummodul5;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class BonusKary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tahun, golongan;
        Scanner input=new Scanner(System.in);
        
        System.out.println("Bonus Akhir Tahun Karyawan");
        System.out.print("Golongan : ");
        golongan=input.nextInt();
        System.out.print("Masa Kerja : ");
        tahun=input.nextInt();
        
        if((golongan == 1) && (tahun <= 10)){
            System.out.println("Jumlah Bonus : 50%");
        }else if ((golongan == 1) && (tahun >= 11 && tahun <= 20)){
            System.out.println("Jumlah Bonus : 60%");
        }else if ((golongan == 1) && (tahun >= 21 && tahun <= 30)){
            System.out.println("Jumlah Bonus : 70%");
        }
        if ((golongan == 2 ) && (tahun <= 10)){
            System.out.println("Jumlah Bonus : 60%");
        }else if ((golongan == 2) && (tahun >= 11 && tahun <= 20)){
            System.out.println("Jumlah Bonus : 70%");
        }else if ((golongan == 2) && (tahun >= 21 && tahun <= 30)){
            System.out.println("Jumlah Bonus : 80%");
        }
        if ((golongan == 3 ) && (tahun <= 10)){
            System.out.println("Jumlah Bonus : 70%");
        }else if ((golongan == 3) && (tahun >= 11 && tahun <= 20)){
            System.out.println("Jumlah Bonus : 80%");
        }else if ((golongan == 3) && (tahun >= 21 && tahun <= 30)){
            System.out.println("Jumlah Bonus : 90%");
        }
        if ((golongan == 4 ) && (tahun <= 10)){
            System.out.println("Jumlah Bonus : 80%");
        }else if ((golongan == 4) && (tahun >= 11 && tahun <= 20)){
            System.out.println("Jumlah Bonus : 90%");
        }else if ((golongan == 4) && (tahun >= 21 && tahun <= 30)){
            System.out.println("Jumlah Bonus : 100%");
        }
    }
    
}
