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
public class Latihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ulang = 1;
double jumlah = 0;
double bilangan;
Scanner tombol = new Scanner(System.in);
while ( ulang <= 5 ) {
System.out.print("Masukkan data ke "+ulang+ " : ");
bilangan = tombol.nextDouble();
jumlah = jumlah + bilangan;
ulang++;
}
System.out.println("Jumlah 5 bilangan tersebut adalah "+ jumlah);
}
}