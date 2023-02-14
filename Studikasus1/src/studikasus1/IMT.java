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
public class IMT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int berat;
        double imt, tinggi;
        System.out.println("Indeks Masa Tubuh Pasien");
        System.out.print("Berat (Kg) : ");
        berat=input.nextInt();
        System.out.print("Tinggi (m) : ");
        tinggi=input.nextDouble();
        
        imt=(berat/Math.pow(tinggi,2));
        System.out.println("Jadi Indeks Masa Tubuh : "+imt);
        
        if (imt<18.5){
            System.out.println("Berat Badan Kurang");
        }
        else if (18.5<=imt && imt<=22.9){
            System.out.println("Berat Badan Normal");
        }
        else if (23<=imt && imt<=29.9){
            System.out.println("Berat Badan Cenderung Berlebih");
        }
        else if (imt>=30){
            System.out.println("Berat Badan Obesitas");
        }
    }
    
}
