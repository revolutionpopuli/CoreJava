package Gun26._02_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {

        ArrayList<Ogrenci>liste=new ArrayList<>();
        Scanner oku=new Scanner(System.in);

        for(int i=0; i<3; i++){

            Ogrenci ogr = new Ogrenci();

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
        for (Ogrenci ogr:liste) {
            System.out.println("ogr.adi = " + ogr.adi);
            System.out.println("ogr.soyadi = " + ogr.soyadi);
            System.out.println("ogr.sinifi = " + ogr.sinifi);
            System.out.println("ogr.adresi = " + ogr.adresi);

        }


    }
}
