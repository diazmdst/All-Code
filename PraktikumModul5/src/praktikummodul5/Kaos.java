/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikummodul5;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Kaos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        String ukuran;
        int s, m, l, xl, xxl;
        int jumlah, total;
        
        System.out.println("Pembayaran Kaos");
        System.out.print("Ukuran : ");
        ukuran=input.nextLine();
        System.out.print("Jumlah : ");
        jumlah=input.nextInt();
        s=30000;
        m=38000;
        l=45000;
        xl=50000;
        xxl=60000;
        
        switch(ukuran){
            case "s" :
                total=s*jumlah;
                System.out.println("Total bayar : Rp "+total);
                break;
            case "m" :
                total=m*jumlah;
                System.out.println("Total bayar : Rp "+total);
                break;
            case "l" :
                total=l*jumlah;
                System.out.println("Total bayar : Rp "+total);
                break;
            case "xl" :
                total=xl*jumlah;
                System.out.println("Total bayar : Rp "+total);
                break;
            case "xxl" :
                total=xxl*jumlah;
                System.out.println("Total bayar : Rp "+total);
                break;
            default :
                System.out.println("Koreksi lagi boss");
        }
    }
    
}
