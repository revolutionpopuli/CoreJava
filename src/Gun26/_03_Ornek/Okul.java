package Gun26._03_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // Ogretmen için not defteri programı yapılma isteniyor.
        // Her ogrencının okulNo(int), tamAdi(String) ve notu(int) vardır.
        // Öğretmenden 20 öğrenci için bu bilgileri alınız.
        // bütün öğrencileri yazdırınız. Sonra metodda yazdırınız

        Scanner oku = new Scanner(System.in);
        Scanner okuStr = new Scanner(System.in);
        ArrayList<Ogrenci> snf = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Ogrenci ogr = new Ogrenci();

            System.out.print("Öğrencinin Adı-Soyadı=");
            ogr.tamAdi = okuStr.nextLine();
            System.out.print("Öğrencinin Okul No=");
            ogr.okulNo = oku.nextInt();
            System.out.print("Öğrencinin Notu=");
            ogr.notu = oku.nextInt();

            snf.add(ogr);
        }


        //1.Yöntem
        //for(Ogrenci ogr:snf){

        //  System.out.println("ogr.okulNo = " + ogr.okulNo);
        //     System.out.println("ogr.tamAdi = " + ogr.tamAdi);
        //    System.out.println("ogr.notu = " + ogr.notu);

        //}

        bilgiYazdir(snf);
        //TODO : sınıf ortalamasını bir metodda bulduktan sonra geçen öğrencilerin
        //TODO : aynı metodda isimlerini yazdırınız.
        ortYazdir(snf);

    }

    public static void bilgiYazdir(ArrayList<Ogrenci> snf) {

        for (Ogrenci ogr : snf) {
            System.out.println(ogr.okulNo + " " + ogr.tamAdi + " " + ogr.notu);
        }
    }

    public static void ortYazdir(ArrayList<Ogrenci> snf) {
        int notTop = 0;
        for (Ogrenci ogr : snf) {
            notTop = notTop + ogr.notu;

        }

        int ort = notTop / snf.size();
        for (Ogrenci ogr : snf) {

            if (ogr.notu >= ort)
                System.out.println(ogr.okulNo + " " + ogr.tamAdi + " " + ogr.notu + " Geçti");
            else System.out.println(ogr.okulNo + " " + ogr.tamAdi + " " + ogr.notu + " Kaldı");
        }
    }
}