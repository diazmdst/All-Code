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
public class Zodiac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tanggal, bulan;
        String nama, alamat, zodiac, sifat;
        
        Scanner input=new Scanner(System.in);
        System.out.print("Nama :");
        nama=input.nextLine();
        System.out.print("Alamat : ");
        alamat=input.nextLine();
        System.out.print("Tanggal lahir : ");
        tanggal=input.nextInt();
        System.out.print("Bulan lahir : ");
        bulan=input.nextInt();
        
        if ((tanggal>=20 && tanggal<=31 && bulan==1) || (tanggal>=1 && tanggal<=18 && bulan==2)){
            zodiac = "Aquarius";
            sifat = "Suka bertualang, kemanusiaan tinggi, progresif, tenang, penyendiri";
            System.out.println("Anda Berbintang : "+zodiac);
            System.out.println("Sifat Anda : "+sifat);
        }
        else if ((tanggal>=19 && tanggal<=31 && bulan==2) || (tanggal>=1 && tanggal<=20 && bulan==3)){
            zodiac = "Pisces";
            sifat = "Agak manja, setia, suka mengalah, tidak konsisten, suka berpikir, simpati dan empati";
            System.out.println("Anda Berbintang : "+zodiac);
            System.out.println("Sifat Anda : "+sifat);
        }
        else if ((tanggal>=21 && tanggal<=31 && bulan==3) || (tanggal>=1 && tanggal<=19 && bulan==4)){
            zodiac = "Aries";
            sifat = "Berani, suka tantangan, percaya diri tinggi, berjiwa pemimpin, bertindak cepat, pantang menyerah, suka memerintah";
            System.out.println("Anda Berbintang : "+zodiac);
            System.out.println("Sifat Anda : "+sifat);
        }
        else if ((tanggal>=20 && tanggal<=31 && bulan==4) || (tanggal>=1 && tanggal<=20 && bulan==5)){
            zodiac = "Taurus";
            sifat = "Suka hal spiritual, tabah, setia, senang berbagi, suka traveling, sensitif dan keras kepala, suka mengatur, tidak suka diatur";
            System.out.println("Anda Berbintang : "+zodiac);
            System.out.println("Sifat Anda : "+sifat);
        }
        else if ((tanggal>=21 && tanggal<=31 && bulan==5) || (tanggal>=1 && tanggal<=20 && bulan==6)){
            zodiac = "Gemini";
            sifat = "Supel, komunikatif, cerdas, tidak suka rutinitas,cepat bosan, spontanitas, pintar";
            System.out.println("Anda Berbintang : "+zodiac);
            System.out.println("Sifat Anda : "+sifat);
        }
        else if ((tanggal>=21 && tanggal<=31 && bulan==6) || (tanggal>=1 && tanggal<=22 && bulan==7)){
            zodiac = "Cancer";
            sifat = "Sabar, jujur, penuh emosi, tidak konsisten, daya ingat tinggi, intuisi kuat, tidak berani mengambil resiko, protektif";
            System.out.println("Anda Berbintang : "+zodiac);
            System.out.println("Sifat Anda : "+sifat);
        }
        else if ((tanggal>=23 && tanggal<=31 && bulan==7) || (tanggal>=1 && tanggal<=22 && bulan==8)){
            zodiac = "Leo";
            sifat = "Ramah, berani, leadership tinggi, egois, suka pamer, otoriter, kepercayaan diri tinggi";
            System.out.println("Anda Berbintang : "+zodiac);
            System.out.println("Sifat Anda : "+sifat);
        }
        else if ((tanggal>=23 && tanggal<=31 && bulan==8) || (tanggal>=1 && tanggal<=22 && bulan==9)){
            zodiac = "Virgo";
            sifat = "Pekerja keras, simple, tidak tenang, praktis dan kritis, analitis yang kuat, perfeksionis, pintar mengatur orang";
            System.out.println("Anda Berbintang : "+zodiac);
            System.out.println("Sifat Anda : "+sifat);
        }
        else if ((tanggal>=23 && tanggal<=31 && bulan==9) || (tanggal>=1 && tanggal<=22 && bulan==10)){
            zodiac = "Libra";
            sifat = "Mengutamakan kesetaraan, suka seni, suka berpura-pura, jarang marah, sering kebingungan, keinginan besar, teamwork";
            System.out.println("Anda Berbintang : "+zodiac);
            System.out.println("Sifat Anda : "+sifat);
        }
        else if ((tanggal>=23 && tanggal<=31 && bulan==10) || (tanggal>=1 && tanggal<=21 && bulan==11)){
            zodiac = "Scorpio";
            sifat = "Kreatif, keinginan kuat, suka kemewahan, pencemburu dan posesif, fanatik dan ekstrim, emosional, pesaing tangguh";
            System.out.println("Anda Berbintang : "+zodiac);
            System.out.println("Sifat Anda : "+sifat);
        }
        else if ((tanggal>=22 && tanggal<=31 && bulan==11) || (tanggal>=1 && tanggal<=21 && bulan==12)){
            zodiac = "Sagitarius";
            sifat = "Optimis, suka tantangan, bijaksana, religius dan berbelas kasih, boros, kurang tanggung jawab, wawasan luas, persuasif";
            System.out.println("Anda Berbintang : "+zodiac);
            System.out.println("Sifat Anda : "+sifat);
        }
        else if ((tanggal>=22 && tanggal<=31 && bulan==12) || (tanggal>=1 && tanggal<=19 && bulan==1)){
            zodiac = "Capricorn";
            sifat = "Bertanggung jawab, realistis, berpikir kritis, disiplin, serius dalam percintaan, perfeksionis";
            System.out.println("Anda Berbintang : "+zodiac);
            System.out.println("Sifat Anda : "+sifat);
        }
    }
    
}
