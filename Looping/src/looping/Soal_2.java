/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Soal_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ulang = 1, data;
        int bilangan, jumlah = 0, rerata;
        Scanner input = new Scanner(System.in);
        System.out.print("Banyak data yang akan diproses = ");
        data= input.nextInt();
        while ( ulang <= data ) {
            System.out.print("Data ke "+ulang+ " : ");
            bilangan = input.nextInt();
            jumlah = jumlah + bilangan;
            ulang++;
        }
        rerata = jumlah / data;
        System.out.println("Rata-rata data adalah = "+ rerata);
    }
}
