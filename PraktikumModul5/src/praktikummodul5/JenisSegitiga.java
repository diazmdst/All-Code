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
public class JenisSegitiga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, c;
        double aR, bR, cR;
        Scanner input=new Scanner(System.in);
        
        System.out.println("Menentukan Jenis Segitiga");
        System.out.print("Masukkan sisi 1 : ");
        a=input.nextInt();
        System.out.print("Masukkan sisi 2 : ");
        b=input.nextInt();
        System.out.print("Masukkan sisi 3 : ");
        c=input.nextInt();
        System.out.println("--------------------------");
        
        aR=Math.sqrt(Math.pow(b,2)+Math.pow(c,2));
        bR=Math.sqrt(Math.pow(c,2)+Math.pow(a,2));
        cR=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        
        if (a==aR || b==bR || c==cR){
            System.out.println("Segitiga Siku-Siku");
        }
        else if (a==b && b==c && c==a){
            System.out.println("Segitiga Sama Sisi");
        }
        else if (a==b || a==c || b==c){
            System.out.println("Segitiga Sama Kaki");
        }
        else {
            System.out.println("Segitiga Sembarang");
        }
    }
}
