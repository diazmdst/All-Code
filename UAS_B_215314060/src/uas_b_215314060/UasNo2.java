/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_b_215314060;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class UasNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan Banyak Daerah    : ");
        int banyakData = sc.nextInt();
        int[] jumPasienDaerah = new int[banyakData];
        for(int i=0;i<banyakData;i++){
            System.out.print("Jumlah Pasien ke "+(i+1)+" : ");
            jumPasienDaerah[i]=sc.nextInt();
        }
        tampilData(jumPasienDaerah);
    }
    
        static String zone(int data){
            if (data >= 0 && data <= 10)
                return "Hijau";
            else if (data >= 10 && data <= 50)
                return "Oranye";
            else if (data > 50)
                return "Merah";
            else
                return "No data";
        }
        
        static int totalData(int[] data){
            int jum=0;
            for (int x : data){
                jum += x;
            }
            return jum;
        }
        
        static double rerata(int[] data){
            int panjangData = data.length;
            int totalData = totalData(data);
            return totalData / panjangData;
        }
        
        static  int maxi(int[] data){
            int maxi = 0;
            for (int x=0; x<data.length; x++){
                if (x==0)
                    maxi = data[x];
                else if (x>0 && maxi<data[x])
                    maxi = data[x];
            }
            return maxi;
        }
        
        static int minim(int[] data){
            int minim = 0;
            for (int x=0; x<data.length; x++){
                if (x==0)
                    minim = data[x];
                else if (x>0 && minim>data[x])
                    minim = data[x];
            }
            return minim;
        }
        
        static int greenZone(int[] data){
            int jum = 0;
            String check;
            for (int x : data) {
                check = zone(x);
                if (check.equalsIgnoreCase("hijau"))
                jum++;
            }
            return jum;
        }
        
        static int orangeZone(int[] data){
            int jum = 0;
            String check;
            for (int x : data) {
                check = zone(x);
                if (check.equalsIgnoreCase("oranye"))
                jum++;
            }
            return jum;
        }
        
        static int redZone(int[] data){
            int jum = 0;
            String check;
            for (int x : data) {
                check = zone(x);
                if (check.equalsIgnoreCase("merah"))
                jum++;
            }
            return jum;
        }
        
        static void tampilData(int[] jumPasien){
            System.out.println("No. \t Jum Pasien \t Kategori");
            System.out.println("==================================");
            for (int x=0; x<jumPasien.length; x++){
                System.out.println((x+1)+"\t\t"+jumPasien[x]+" \t "+zone(jumPasien[x]));
            }
            
            System.out.println("==================================");
            System.out.println("Total pasien\t\t\t: " + totalData(jumPasien));
            System.out.println("Rata - rata jumlah pasien\t: " + rerata(jumPasien));
            System.out.println("\nJumlah pasien terbanyak\t\t: " + maxi(jumPasien));
            System.out.println("Jumlah pasien paling sedikit\t: " + minim(jumPasien));
            System.out.println("Jumlah daerah zona hijau\t: " + greenZone(jumPasien));
            System.out.println("Jumlah daerah zona oranye\t: " + orangeZone(jumPasien));
            System.out.println("Jumlah daerah zona merah\t: " + redZone(jumPasien));
        }
             
}
