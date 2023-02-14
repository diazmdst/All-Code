/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul12;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class no7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c, total;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Banyak elemen yang diinginkan : ");
        total=sc.nextInt();
        
        int jumlah[]=new int[total];
        
        System.out.println("\nBilangan dari "+total+" elemen");
        System.out.println("--------------------------------");
        for (int a=0; a<jumlah.length; a++){
            System.out.print("Bilangan ke "+(a+1)+" = ");
            jumlah[a]=sc.nextInt();
        }
        System.out.println("--------------------------------");
        
        System.out.println("\nBilangan sebelum diurutkan");
        for (int x=0; x<jumlah.length; x++){
            System.out.print(jumlah[x]+", ");
        }
        for (int a=0; a<(jumlah.length-1); a++){
            for (int b=0; b<jumlah.length-a-1; b++){
                if (jumlah[b]>jumlah[b+1]){
                    
                    c=jumlah[b];
                    jumlah[b]=jumlah[b+1];
                    jumlah[b+1]=c;
                }
            }
        }
        System.out.println("\n\nBilangan Setelah Diurutkan : ");
        for (int a=0; a<total; a++){
            System.out.print(jumlah[a]+", ");
        }
    }
    
}

