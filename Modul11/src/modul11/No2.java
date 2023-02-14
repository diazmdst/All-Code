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
public class No2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n;
        
        do{
            System.out.print("Masukkan n : ");
            n=sc.nextInt();
            
        } while (n<30 || n>100);

        for (double x=-4; x<=4; x=x+0.5){
            int jBintang=normal(n,x);
            bintang(jBintang);
        }
    }
    
    static int normal(int n, double x){
        double e=2.71828;
        double nPangkat = -0.5 * Math.pow(x, 2);
        double f = (1.0/Math.sqrt(2*3.14)) * (Math.pow(e, nPangkat));
        return (int) Math.round(n*f);
    }
    
    static void bintang(int m){
        for(int i=1; i<=m; i++){
            System.out.print("*");
        }
        System.out.println();
    }
}

