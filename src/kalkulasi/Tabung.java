package kalkulasi;

import java.util.Scanner;

public class Tabung implements MenghitungRuang{
    private double t;
    double hasil_inputan_tinggi;

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public void input_tinggi() {
        Tabung input_tabung = new Tabung();
        Scanner obj = new Scanner(System.in);
        System.out.print("Masukan t: ");
        double tinggi = obj.nextDouble();
        input_tabung.setT(tinggi);
        hasil_inputan_tinggi = input_tabung.getT();
    }



    @Override
    public double volume_balok(double hasil_luas_persegiP) {
        return hasil_luas_persegiP * hasil_inputan_tinggi;
    }

    @Override
    public double volume_tabung(double hasil_luas_lingkaran) {
        return hasil_luas_lingkaran * hasil_inputan_tinggi;
    }
    public void shows(){
        //System.out.println("Volume Tabung : " + volume_tabung());

    }
}



