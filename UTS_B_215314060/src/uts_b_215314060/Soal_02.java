/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts_b_215314060;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Soal_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int menu;
        double celcius, reamur, fahrenheit;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Program Konversi Suhu oleh :");
        System.out.println("Nama : Diaz Madestu Pratama");
        System.out.println("NIM  : 215314060");
        System.out.println("Menu");
        System.out.println("1. Celcius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Reamur");
        System.out.print("Pilih ? ");
        menu=input.nextInt();
        
        switch (menu)
        {
            case 1 :
                System.out.print("Masukkan Suhu Celcius : ");
                celcius = input.nextDouble();
                reamur = (4.0/5.0)*celcius;
                fahrenheit = (9.0/5.0)*celcius + 32;
                System.out.println("Suhu Reamur = "+reamur);
                System.out.println("Suhu Fahrenheit = "+fahrenheit);
                break;
            case 2 :
                System.out.print("Masukkan Suhu Fahrenheit : ");
                fahrenheit = input.nextDouble();
                celcius = (5.0/9.0)*(fahrenheit- 32);
                reamur = (4.0/9.0)*(fahrenheit - 32);
                System.out.println("Suhu Reamur = "+reamur);
                System.out.println("Suhu Celcius = "+celcius);
                break;
                
            case 3 :
                System.out.print("Masukkan Suhu Reamur : ");
                reamur = input.nextDouble();
                celcius = (5.0/4.0)*reamur;
                fahrenheit = (9.0/4.0)*reamur + 32;
                System.out.println("Suhu Fahrenheit = "+fahrenheit);
                System.out.println("Suhu Celcius = "+celcius);
                break;
            default :
                System.out.println("SALAH WOY");
        }
        
    }
    
}
