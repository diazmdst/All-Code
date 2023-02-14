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
public class no3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int totalArray;
        double min, max;
        double total=0, rerata;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Total elemen array : ");
        totalArray=sc.nextInt();
        double []nilai=new double[totalArray];
        for (int i=0; i<nilai.length; i++){
            System.out.print("Data ke "+(i+1)+" : ");
            nilai[i]=sc.nextDouble();
        }
        for (int i=0; i<nilai.length; i++){
            total=total+nilai[i];
        }
        System.out.println("-------------------");
        rerata=total/nilai.length;
        System.out.println("Rata-rata : "+rerata);
        
        min=nilai[0];
        for (int i=0; i<nilai.length; i++){
            if (min>nilai[i])
                min=nilai[i];
        }
        System.out.println("Nilai terkecil : "+min);
        
        max=nilai[0];
        for (int i=0; i<nilai.length; i++){
            if (max<nilai[i])
                max=nilai[i];
            }
         
        System.out.println("Nilai terbesar : "+max);
    }
}
