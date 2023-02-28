package Gun33._03_Ornek;

import java.util.Scanner;

public class OkulMain {
    //  6- bir okul nesnesi oluşturup, bu okula max öğrenci miktarına ulaşana kadar kullanıcıdan alarak
    //     öğrenci ekleyiniz. Fakat oluşturacağınız öğrencilerin yaşı 15 i geçmemeli.
    //     bu yaşı geçen bir öğrenci eklenmek istenir ise yerine başka öğrenci isteyiniz.
    public static void main(String[] args) {
        //bir okulumuz olmalı, max kontenjanı ve adı olan
        Okul yeniOkul=new Okul("Kabataş İlkokulu", 3);
        Scanner okuInt=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);

        do{
            //scanner işlemleri, kullanıcıdan veri alma, öğrenci bilgi alma kısmı
            System.out.print("Öğrencinin Adı="); String ad=okuStr.nextLine();
            System.out.print("Öğrencinin Soyadı="); String soyad=okuStr.nextLine();
            System.out.print("Öğrencinin Yaşı="); int yas=okuInt.nextInt();

           if  (yas<15){//ise öğrenci ekle
               Ogrenci ogr=new Ogrenci(ad, soyad, yas);
               yeniOkul.ogrenciler.add(ogr);
           }
           else{
               System.out.println("Öğrenci yaşı okul için uygun değil");
           }

        }while (yeniOkul.ogrenciler.size()< yeniOkul.getKontenjan());
            //eklenen_ogrenci_sayisi<=max_ogrenci_sayisindan

        System.out.println("yeniOkul = " + yeniOkul);
        System.out.println("yeniOkul = " + yeniOkul.ogrenciler);
    }
}
