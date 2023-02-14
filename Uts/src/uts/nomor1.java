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
public class nomor1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int mid1, mid2, uas;
        double total;
        
        System.out.print("Nilai Mid1 : ");
        mid1=input.nextInt();
        System.out.print("Nilai Mid2 : ");
        mid2=input.nextInt();
        System.out.print("Nilai Uas : ");
        uas=input.nextInt();
        total=(25.0/100*mid1)+(25.0/100*mid2)+(50.0/100*uas);
        System.out.println("Nilai akhir : "+total);
    }
    
}
