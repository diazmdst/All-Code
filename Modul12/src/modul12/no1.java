/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul12;

import java.util.Scanner;

public class no1 {

    public static void main(String[] args) {
        // TODO code application logic here
        int [] nilai;
        nilai=new int[5];
        int cadangan[];
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("5 Bilangan Bulat");
        System.out.println("----------------");
        for (int i=0; i<=4; i++){
            System.out.print("Data ke "+(i+1)+" : ");
            nilai[i]=sc.nextInt();
        }
        System.out.println("----------------");
        for (int i=0; i<=4; i++){
            System.out.println("Data ke "+(i+1)+" adalah : "+nilai[4-i]);
        }
            System.out.println("----------------");
            
            cadangan=nilai;
            System.out.println(cadangan[0]);
            System.out.println(cadangan[1]);
            System.out.println(cadangan[2]);
            System.out.println(cadangan[3]);
            System.out.println(cadangan[4]);
        }
    }
    

