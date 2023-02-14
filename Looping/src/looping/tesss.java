/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping;

/**
 *
 * @author ASUS
 */
public class tesss {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
int jumlah = 0, bilangan = 0;
do {
jumlah = jumlah + bilangan;
bilangan = bilangan + 5;
} while ( bilangan <= 100 );
System.out.println("Jumlah dari 5+10+…+100 = "+ jumlah);
}
}
