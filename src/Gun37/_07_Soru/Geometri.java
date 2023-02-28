package Gun37._07_Soru;

import Utility.MyFunc;

public class Geometri {
    public static void main(String[] args) {
        Dikdortgen d=new Dikdortgen();
        System.out.println("dikdörtgen alanı = "+d.alani(4, 5));
        System.out.println("dikdörtgen çevresi = "+d.cevresi(4, 5));

        Kare k=new Kare();
        System.out.println("kare alanı = "+k.alani(4));
        System.out.println("kare çevresi = "+k.cevresi(4));

        Daire dr=new Daire();
        System.out.println("daire alanı = " + dr.alani(3));
        System.out.println("daire çevresi = " + dr.cevresi(3));

        double yeniSayi= MyFunc.yuvarla(dr.cevresi(3));
        System.out.println("daire çevresi yeni= " + yeniSayi);

        System.out.printf("%-6.2f", dr.cevresi(3));
        // printf : formatlı (toplam kaç hane ye yaz, noktadan sonra kaç hane kullan) yazdırma
        //  % : virgülden sonraki değişkeni gözteriyor
        // -  :sola dayalı, eklenmezse sağa dayalı
        // 6  : toplamda ekrandan kaç digit kullanılacak
        // .  : ondalıklı bölümü gösteriyor
        // 2  : ondalıklı kısmından kaç hane alınacağını gösteriyor
        // f  : double veya float için kullanılıyor, tam sayılar için d kullanılır
        //      stringler için s kullanılır.


    }
}
