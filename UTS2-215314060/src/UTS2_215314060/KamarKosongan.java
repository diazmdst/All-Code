/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS2_215314060;

/**
 *
 * @author ASUS
 */
public class KamarKosongan extends Kamar {

    private double biayaKosong, lamaSewaKosong;

    public double getBiayaKosong() {
        return biayaKosong;
    }

    public void setBiayaKosong(double biayaKosong) {
        this.biayaKosong = biayaKosong;
    }

    public double getLamaSewaKosong() {
        return lamaSewaKosong;
    }

    public void setLamaSewaKosong(double lamaSewaKosong) {
        this.lamaSewaKosong = lamaSewaKosong;
    }

    @Override
    double hitungBiayaKamar() {
        return getBiayaKosong() * getLamaSewaKosong();
    }

    @Override
    String getStatus() {
        return "KamarKosongan";
    }
}
