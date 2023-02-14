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
public class KamarIsian extends Kamar {

    private double biayaIsian, lamaSewaIsian;

    public double getBiayaIsian() {
        return biayaIsian;
    }

    public void setBiayaIsian(double biayaIsian) {
        this.biayaIsian = biayaIsian;
    }

    public double getLamaSewaIsian() {
        return lamaSewaIsian;
    }

    public void setLamaSewaIsian(double lamaSewaIsian) {
        this.lamaSewaIsian = lamaSewaIsian;
    }

    @Override
    double hitungBiayaKamar() {
        return getBiayaIsian() * getLamaSewaIsian();
    }

    @Override
    String getStatus() {
        return "KamarIsian";
    }
}
