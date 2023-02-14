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
public class BiayaKend {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int jarak, harbensin, ratbensin, parkir, tol, total;
                
        System.out.println("Biaya Penggunaan Kendaraan Per Hari");
        System.out.print("Jarak Tempuh (KM) : ");
        jarak=input.nextInt();
        System.out.print("Harga Bensin Per Liter : ");
        harbensin=input.nextInt();
        System.out.print("Rata-Rata Penggunaan Bahan Bakar : ");
        ratbensin=input.nextInt();
        System.out.print("Biaya Parkir : ");
        parkir=input.nextInt();
        System.out.print("Biaya Tol : ");
        tol=input.nextInt();
        
        total=jarak/ratbensin*harbensin;
        System.out.println("Total Biaya Penggunaan Kendaraan : Rp "+total);
    }
    
}
