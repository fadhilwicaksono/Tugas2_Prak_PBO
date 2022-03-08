package kalkulasi;

import java.util.Scanner;

public class PersegiPanjang implements  MenghitungBidang{
    private double p,l;
    double panjang, lebar;
    double input_p, input_l;

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public void input_pl() {
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        Scanner obj = new Scanner(System.in);
        System.out.print("Masukan p: ");
        double input_p = obj.nextDouble();
        System.out.print("Masukan l: ");
        double input_l = obj.nextDouble();
        persegiPanjang.setP(input_p);
        persegiPanjang.setL(input_l);
        panjang = persegiPanjang.getP();
        lebar = persegiPanjang.getL();
    }

    @Override
    public double luas_lingkaran() {
        return 0;
    }

    @Override
    public double luas_persegi_panjang() {
        return panjang * lebar;
    }

    @Override
    public double luas_permukaan_Balok(double t) {
        return 2 * ((panjang * lebar) + (panjang * t) + (lebar * t));
    }

    @Override
    public double luas_permukaan_tabung(double r, double t) {
        return 0;
    }

    @Override
    public double keliling_lingkaran() {
        return 0;
    }

    @Override
    public double keliling_persegi_panjang() {
        return 2*(panjang + lebar);
    }


    public void shows(){
        System.out.println("Luas     Persegi Panjang : " + luas_persegi_panjang());
        System.out.println("Keliling Persegi Panjang : " + keliling_persegi_panjang());


    }
}
