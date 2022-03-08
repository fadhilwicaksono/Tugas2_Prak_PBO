package kalkulasi;
import java.util.Scanner;
public class Lingkaran implements MenghitungBidang{
    private double r;
    double hasil_inputan_jari2;

    public void setR(double r) {
        this.r = r;
    }
    public double getR() {
        return r;
    }


    public void input_jari2() {
        Lingkaran input_lingkaran = new Lingkaran();
        Scanner obj = new Scanner(System.in);
        System.out.print("Masukan r: ");
        double jari2 = obj.nextDouble();
        input_lingkaran.setR(jari2);
        hasil_inputan_jari2 = input_lingkaran.getR();
    }

    @Override
    public double luas_lingkaran() {
        return phi * (hasil_inputan_jari2 * hasil_inputan_jari2);
    }

    @Override
    public double luas_persegi_panjang() {
        return 0;
    }

    @Override
    public double luas_permukaan_Balok(double t) {
        return 0;
    }

    @Override
    public double luas_permukaan_tabung(double r, double t) {
        return 2*phi*r*(r+t);
    }

    @Override
    public double keliling_lingkaran() {
        return phi*hasil_inputan_jari2*2;
    }

    @Override
    public double keliling_persegi_panjang() {
        return 0;
    }

    public void shows(){
        System.out.println("Luas Lingkaran     : " + luas_lingkaran());
        System.out.println("Keliling Lingkaran : " + keliling_lingkaran());


    }
}
