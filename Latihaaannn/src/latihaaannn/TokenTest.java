/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihaaannn;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ASUS
 */
public class TokenTest 
{
   // execute application
   public static void main( String args[] )
   {
      // get sentence
      Scanner scanner = new Scanner( System.in );
      System.out.println( "Enter a sentence and press Enter" );
      String sentence = scanner.nextLine();

      // process user sentence
      StringTokenizer tokens = new StringTokenizer( sentence);
      System.out.printf( "Number of elements: %d\nThe tokens are:\n",
         tokens.countTokens() );

      while ( tokens.hasMoreTokens() )
         System.out.println( tokens.nextToken() );
   } // end main
} // end class TokenTest