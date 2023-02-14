/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihaaannn;

/**
 *
 * @author ASUS
 */
import javax.swing.*;

class ConString {

    public static void main(String[] args) {

        String kal = "90/45:Dino komo :jl. gajah 34";
        String isi[] = kal.split(":");
        System.out.println(isi[2]);
    }
}
