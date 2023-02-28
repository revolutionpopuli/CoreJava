package Gun31._02_FinalModifier.Ornek3;

import java.util.Scanner;

public class Soru {
    public static void main(String[] args) {
        // Sabitler isimli bir Class da sabit bir şekilde
        // bir gündeki saat sayısı, bir saatteki dakika sayısı ve
        // bir dakikadaki saniye sayısını tanımlayınız.(bu degerler değiştirilemez olmalı)
        // mainde kullanıcıdan gun, saat, dakika alarak toplam
        // saniyeyi bulunuz.

        int gun=0;
        int saat=0;
        int dakika=0;

        Scanner oku=new Scanner(System.in);
        System.out.print("Gün=");
        gun= oku.nextInt();
        System.out.print("Saat=");
        saat= oku.nextInt();
        System.out.print("Dakika=");
        dakika= oku.nextInt();


        //1. Yöntem
        int toplamSaniye=gun*Sabitler.birGundekiSaatSayisi*Sabitler.birSaattekiDakikaSayisi*
         Sabitler.birDakikadakiSaniyeSayisi+saat*Sabitler.birSaattekiDakikaSayisi*Sabitler.birDakikadakiSaniyeSayisi+
         dakika*Sabitler.birDakikadakiSaniyeSayisi;

        System.out.println("Toplam Saniye = " + toplamSaniye);

        //2. Yöntem/Olması Gereken Yöntem
        System.out.println("Toplam Saniye="+Sabitler.toSecond(gun, saat, dakika));

    }
}
