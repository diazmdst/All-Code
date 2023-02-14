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
public class tes {
    static long faktorial(int n) {
        long z = 1;
        int i = 1;
        while (i <= n) {
            z = z * i;
            i++;
        }
        return z;
    }

    public static void main(String[] args) {
        int a, i, j;
        Scanner rendy = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        a = rendy.nextInt();
        for (i = 0; i <= a; i++) {
            for (j = 0; j < a - i ; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(faktorial(i) / (faktorial(j) * faktorial(i - j)) + " ");
            }
            System.out.println();
        }
    }
}