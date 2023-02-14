/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasus1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Penduduk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int tahun, tahunA, penduduk21;
        double tingkat, jumlah;
        
        penduduk21=271349889;
        tingkat=0.011;
        tahunA=2021;
        
        System.out.println("Prediksi Penduduk Pada Tahun Tertentu");
        System.out.print("Masukkan Tahun : ");
        tahun=input.nextInt();
        jumlah=penduduk21+(penduduk21*(tahun-tahunA))*tingkat;
        System.out.println("Pada tahun"+tahun+"jumlah penduduk Indonesia diprediksi sebanyak "+Math.round(jumlah)+" jiwa");
    }
    
}
