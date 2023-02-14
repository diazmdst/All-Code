/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul12;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class no4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] x={2,7,3,9,4,1,34,25,76,80,90,54,21,78};
        int total, a=0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Total nilai yang dicari : ");
        total=sc.nextInt();
        
        while (a<x.length){
            if (x[a]==total){
                System.out.println("Berada pada index : "+a);
                        break;
            }
            a++;
        }
        
        if (x[a]!=total)
            System.out.println("Tidak ada pada index");
    }
    
}

