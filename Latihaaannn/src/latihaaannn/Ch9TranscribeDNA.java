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
class Ch9TranscribeDNA {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        String dna;
        StringBuffer rna;
        
        int    size;
        char   base;
        
        while (true) {

            System.out.print("Next DNA Sequence: ");           
            dna = scanner.next();
            
            if (dna.equalsIgnoreCase("STOP") )   {
                break;
            }
            
            size = dna.length();
            rna = new StringBuffer();
            
            //scan through each letter and replace T with U
            for (int i = 0; i < size; i++) {
            	
            	base = dna.charAt(i);
            	
            	if (base == 'T') {
            		base = 'U';
            	}
            	
            	rna.append(base);
            }      
            
            System.out.println("RNA: " + rna.toString());
            System.out.println("");            
        }
    }
}