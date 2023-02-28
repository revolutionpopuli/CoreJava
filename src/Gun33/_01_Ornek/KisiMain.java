package Gun33._01_Ornek;

public class KisiMain {
    public static void main(String[] args) {

        Kisi kisi1=new Kisi();
        //kisi1.ad="ismet";
        // kisi1.soyad="temur";
        //kisi1.yas=-25;
        kisi1.yasAta(-25);
        System.out.println(kisi1.yasVer());

        kisi1.setAd("ismet");
        kisi1.setSoyad("temur");

        System.out.println("kisi1 = " + kisi1);

    }
    //değişkene direkt erişimi kapatıp
    //bir metod ile korumalı veri gönderme ve alma
    //buna Encapsulation denir.
}
