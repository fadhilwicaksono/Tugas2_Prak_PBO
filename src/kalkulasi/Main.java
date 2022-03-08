package kalkulasi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Balok_show cek2 = new Balok_show();
        cek2.input_tinggi();
        cek2.volume_balok(coba2.luas_persegi_panjang());
        System.out.println(cek2.hasil_inputan_tinggi);
        System.out.println("Volume Balok : "+ cek2.volume_balok(coba2.luas_persegi_panjang())); */
        //Coba Luas permukaan
        //Menu
        Scanner obj = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("~~||MENU||~~");
            System.out.println("1. Hitung Balok\n2. Hitung Tabung\n3. Keluar");
            System.out.print("Pilih : ");
            pilih = obj.nextInt();

            switch (pilih){
                case 1:
                    PersegiPanjang coba2 = new PersegiPanjang();
                    coba2.input_pl();
                    coba2.luas_persegi_panjang();
                    Balok_show cek2 = new Balok_show();
                    cek2.input_tinggi();
                    //System.out.println(cek2.hasil_inputan_tinggi);
                    coba2.shows();
                    cek2.volume_balok(coba2.luas_persegi_panjang());
                    System.out.println("Volume Balok : "+ cek2.volume_balok(coba2.luas_persegi_panjang()));
                    System.out.println("Luas Permukaan Balok: " +coba2.luas_permukaan_Balok(cek2.hasil_inputan_tinggi));
                    break;

                case 2:
                    Lingkaran coba = new Lingkaran();
                    coba.input_jari2();
                    coba.luas_lingkaran();

                    Tabung_Show cek = new Tabung_Show();
                    cek.input_tinggi();
                    cek.volume_tabung(coba.luas_lingkaran());
                    coba.shows();
                    System.out.println("Volume Tabung : " + cek.volume_tabung(coba.luas_lingkaran()));
                    System.out.println("Luas Permukaan Tabung : " + coba.luas_permukaan_tabung(coba.hasil_inputan_jari2, cek.hasil_inputan_tinggi));
                    break;
            }
        }while(pilih != 3);

    }
}

class Tabung_Show extends Tabung {
    public static void main(String[] args) {
        Tabung coba3 = new Tabung();
        Lingkaran coba = new Lingkaran();
        coba3.input_tinggi();
        coba3.volume_tabung(coba.luas_lingkaran());
        //coba3.shows();
        //System.out.println("Volume Tabung : " + coba3.volume_tabung(coba.luas_lingkaran()));
    }
}
class Balok_show extends Balok{
    public static void main(String[] args) {
        Balok coba4 = new Balok();
        PersegiPanjang coba = new PersegiPanjang();
        coba4.input_tinggi();
        coba4.volume_balok(coba.luas_persegi_panjang());
        //System.out.println("Volume Balok : "+ coba4.volume_balok(coba.luas_persegi_panjang()));
    }
}
