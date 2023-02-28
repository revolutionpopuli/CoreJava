package Gun30._04_Soru;

public class Banka {
    public static void main(String[] args) {
        // Hesap (yatan(int), cekilen(int), bakiye(int)(direkt erişim olmamalı))
        // Musteri (hesapID(int), ad, soyad, MusteriHesap(Hesap tipinde))
        // Bir banka uygulaması için 1 müşteri tanımlayınız,
        // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,sonra 50 TL çekiniz.
        // Müşterinin toplam yatanı, toplam cekılenı ve kalan bakiyesini yazdırınız.
        // bakiyeye direkt para atanamadıgını kontrol ediniz.

        Musteri mus1 = new Musteri();
        mus1.hesapId = 12345;
        mus1.adi = "ismet";
        mus1.soyadi = "temur";

        mus1.hesabi=new Hesap();
        mus1.hesabi.paraYatir(100);
        mus1.hesabi.paraYatir(200);
        mus1.hesabi.paraCek(50);

        System.out.println("mus1.hesabi = " + mus1.hesabi);


    }
}
