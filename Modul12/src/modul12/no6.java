/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul12;

/**
 *
 * @author ASUS
 */
public class no6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] angka={23,26,30,32,33,69,50,70,80,55,76,53,21};
        
        System.out.print("Ganjil : ");
        for (int i=0; i<angka.length; i++){
            if (angka[i]%2!=0){
                System.out.print(angka[i]+",");
            }
        }
        System.out.println("");
        System.out.print("Genap : ");
        for (int i=0; i<angka.length; i++){
            if (angka[i]%2==0){
                System.out.print(angka[i]+",");
            }
        }
    }
    
}

