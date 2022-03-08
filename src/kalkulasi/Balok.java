package kalkulasi;
import java.util.Scanner;

public class Balok implements MenghitungRuang{
    private double t;
    double hasil_inputan_tinggi;

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public void input_tinggi() {
        Balok input_balok = new Balok();
        Scanner obj = new Scanner(System.in);
        System.out.print("Masukan t: ");
        double tinggi = obj.nextDouble();
        input_balok.setT(tinggi);
        hasil_inputan_tinggi = input_balok.getT();
    }

    @Override
    public double volume_balok(double hasil_luas_persegiP) {
        return hasil_luas_persegiP * hasil_inputan_tinggi;
    }

    @Override
    public double volume_tabung(double hasil_luas_lingkaran) {
        return 0;
    }
}
