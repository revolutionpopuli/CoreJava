package Gun32._03_Ornek;

import java.time.Month;

public class AylarMain {
    public static void main(String[] args) {

        //ayın kaç gün olduğu metod gerektiyor
        //ayın türkçe yazılışı metod gerektiyor
        //ayın gerçek sıra nosu metod gerektiyor

        //Java diyor ki bu şekilde tek bir kelime veya sayı olan
        //değerleri olacaksa, kolayı var.

        Aylar ay=Aylar.AGUSTOS;

        System.out.println("ay = " + ay);
        System.out.println("ay.ayNo = " + ay.ayNo);
        System.out.println("ay.gunMiktar = " + ay.gunMiktar);
        System.out.println("ay.ayAd = " + ay.ayAd);

        //Month.DECEMBER




    }
}
