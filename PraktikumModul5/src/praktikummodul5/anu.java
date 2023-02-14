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
public class anu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
    System.out.print("Masukkan tiga bilangan: ");
    int bil1 = input.nextInt();
    int bil2 = input.nextInt();
    int bil3 = input.nextInt();

  int max ;

 if ((bil1 < bil2)&& (bil1 < bil3)) max = bil1;

     else max = bil2;
    System.out.println(max);
 }}