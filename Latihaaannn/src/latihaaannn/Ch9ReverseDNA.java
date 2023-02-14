/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihaaannn;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
class Ch9ReverseDNA {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String dna;
        StringBuffer result;

        while (true) {

            System.out.print("Next DNA Sequence: ");           
            dna = scanner.next();
            
            if (dna.equalsIgnoreCase("STOP") )   {
                break;
            }
            
            result = new StringBuffer(dna);
            result.reverse();
            
            System.out.println("RNA: " + result.toString());
            System.out.println("");            
        }
    }
}