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
public class No1 {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a, i, j;
        System.out.print("Masukkan nilai : ");
        a = sc.nextInt();
        for (i = 0; i <= a; i++){
            for (j=0; j<a-i; j++){
                System.out.print(" ");
            }
            for (j=0; j<=i; j++){
                System.out.print(faktorial(i) / (faktorial(j)* faktorial(i-j))+" ");
            }
            System.out.println();
        }
    }
        static long faktorial(int n){
        long x = 1;
        int i = 1;
        while (i <= n){
            x = x * i;
            i++;
        }
        return x;
    }
}