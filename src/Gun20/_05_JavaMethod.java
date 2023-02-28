package Gun20;

import java.util.Scanner;

public class _05_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız

        int[] dizi = new int[5];

        for (int i = 0; i < dizi.length; i++) {
            Scanner oku = new Scanner(System.in);
            System.out.print("Sayı Giriniz=");
            dizi[i] = oku.nextInt();

        }

        ortalama(dizi);
        enBuyuk(dizi);
        enKucuk(dizi);

    }


    public static void enBuyuk(int[] sayilar) {
        int enb = 0;

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i]>enb) {
               sayilar[i]=enb;
            }

        }
        System.out.println("enb = " + enb);
    }

    public static void enKucuk(int[] sayilar) {
        int enk = 0;

        for (int i = 0; i < sayilar.length; i++) {


            if (sayilar[i]<enk) {
                sayilar[i]=enk;
            }
        }
        System.out.println("enk = " + enk);
    }

    public static void ortalama(int[] sayilar) {
        int toplam = 0;
        int ortalama = 0;
        for (int i = 0; i < sayilar.length; i++) {


            toplam = toplam + sayilar[i];
        }
        ortalama = toplam / sayilar.length;
        System.out.println("ortalama = " + ortalama);

    }
}