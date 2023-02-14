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
public class Soal_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int jumM, brtM;
        int no=1, kec=0, sed=0, bsr=0;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Banyak mangga yang diproses : ");
        jumM=input.nextInt();
        
        while (no<=jumM){
            System.out.print("Berat mangga "+no+" : ");
            brtM=input.nextInt();
            no++;
            
            if (brtM < 200){
                kec=kec+1;
            }else if (brtM >= 200 && brtM < 600){
                sed=sed+1;
            }else if (brtM >= 600){
                bsr=bsr+1;
            }
        }
        no--;
            System.out.println("Dari "+no+" mangga yang ditimbang");
            System.out.println("Kecil   : "+kec+" buah");
            System.out.println("Sedang  : "+sed+" buah");
            System.out.println("Besar   : "+bsr+" buah");
    }
}
