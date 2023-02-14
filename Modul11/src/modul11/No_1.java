/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul11;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class No_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Masukkan nilai n : ");
        n=sc.nextInt();
        
        for (int i = 0; i <= n; i++) {
            for (int s = 1; s <= n-i; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(kombinasi(i,j) + " ");
            }
            System.out.println();
        }
    }
    static int faktorial(int n) { 
        long x = 1;
        int i = 1;
        while (i <= n){
            x = x * i;
            i++;
        }
        return (int) x;
    }
    
    static int kombinasi (int n, int r){
        int kombinasi;
        kombinasi = faktorial(n)/(faktorial(n-r)*faktorial(r));
        return kombinasi;
}
}

