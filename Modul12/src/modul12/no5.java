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
public class no5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []umur1={18,39,45,50,65,70,90};
        int []umur2={20,32,54,66,75,80,89,90,95,96};
        int a=0, b=0;
        int [] umurgab=new int [umur1.length + umur2.length];
        
        for (int i=0; i<umurgab.length; i++){
            if (umur1.length>a && umur2.length>b){
                if (umur1[a]<umur2[b]){
                    umurgab[i]=umur1[a];
                    a++;
                } else{
                    umurgab[i]=umur2[b];
                    b++;
                }
            } else{
                umurgab[i]=umur2[b];
                b++;
            }
        }
        System.out.println("Setelah diurutkan menjadi : ");
        for (int k=0; k<umurgab.length; k++){
            System.out.print(umurgab[k]+",");
        }
    }
    
}
