package Gun26._01_JavaClasAndObject;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {

        // Bir okulda kayıt programı için Ogrenci bilgilerini alan modül yazılacaktır
        // Ogrenci ye ait bilgiler (adi, soyadi, sinifi ve adres) vardır.
        // bu yapıyı oluşturunuz.

        Scanner oku=new Scanner(System.in);

        ArrayList<Ogrenci>liste=new ArrayList<>();//Ogrenci tipinde bir list

        for(int i=0; i<3; i++) {
            Ogrenci ogr = new Ogrenci();//artık ogr bir varlık, Ogrenci ise onun tipi

            System.out.print("Öğrencinin Adı=");
            ogr.adi = oku.nextLine();
            System.out.print("Öğrencinin Soyadı=");
            ogr.soyadi = oku.nextLine();
            System.out.print("Öğrencinin Sınıfı=");
            ogr.sinifi = oku.nextLine();
            System.out.print("Öğrencinin Adresi=");
            ogr.adresi = oku.nextLine();

            liste.add(ogr);
        }

        for(Ogrenci ogr:liste) {
            System.out.println("ogr.adi = " + ogr.adi);
            System.out.println("ogr.soyadi = " + ogr.soyadi);
            System.out.println("ogr.sinifi = " + ogr.sinifi);
            System.out.println("ogr.adresi = " + ogr.adresi);

        }
    }
}

    class Ogrenci{
    String adi;
    String soyadi;
    String sinifi;
    String adresi;
    
    
}