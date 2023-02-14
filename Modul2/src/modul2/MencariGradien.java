/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

/**
 *
 * @author ASUS
 */
public class MencariGradien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x1, x2, y1, y2;
        int rumus;
        
        x1=2;
        x2=7;
        y1=1;
        y2=2;
        rumus=((y1-y2)/(x1-x2));
        
        System.out.println("Menentukan gradien garis yang menghubungkan 2 titik");
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
        System.out.println("y1 = "+y1);
        System.out.println("y2 = "+y2);
        System.out.println("Jadi, gradien dari x1y1 dan x2y2 adalah m = "+rumus);
    }
    
}
