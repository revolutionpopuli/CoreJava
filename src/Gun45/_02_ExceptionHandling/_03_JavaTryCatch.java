package Gun45._02_ExceptionHandling;

import java.time.LocalDate;

public class _03_JavaTryCatch {
    public static void main(String[] args) {
        System.out.println("Program başladı");
        try {//dene, hatanın başladığı yerin üstüne konur
            LocalDate tarih = LocalDate.of(2022, 02, 30);

        }catch (Exception ex){//ex isimli değişkende oluşan hataların bilgisi atanıyor
            //hata olduğunda yapılması istenenler buraya yazılıyor
            System.out.println("Hata oluştu lütfen tekrar deneyiniz");
            System.out.println("ex.toString() = " + ex.toString());
            //kendine mail at:gelen datayı ve hatayı
            //veri tabanı kalıcı yer yaz
        }
        System.out.println("Program çalışmaya devam etti");
        System.out.println("Program bitti");

        try{
            // Java çalışmaya devam
            // konuları öğrenmeye devam

        } // anlamadığın yer mi oldu ? kırılmadan DEVAM
        catch (Exception ex)
        {
            // hatanın sebebini anla
            // derse daha fazla odaklan
            // gereken videoları tekrar izle
            // arkadaşlarına hocana mutlaka sor
            // öğren ve kırılmadan devam et
        }

        //sonunda seni güzel bir meslek bekliyor.
    }
}
