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
public class TESSSSS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        int jarak, harbensin, ratbensin, parkir, tol, total;
                
        System.out.println("Biaya Bensin Per Hari");
        System.out.print("Jarak Tempuh (KM) : ");
        jarak=input.nextInt();
        System.out.print("Harga Bensin Per Liter : ");
        harbensin=input.nextInt();
        System.out.print("Rata-rata (Km/L) : ");
        ratbensin=input.nextInt();
                
        total=jarak/ratbensin*harbensin;
        System.out.println("Total Biaya : Rp "+total);
    }
    
}
