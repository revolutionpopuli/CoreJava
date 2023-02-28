package Gun33._02_Ornek;

public class ArabaMain {
    // Bir araba nesnesi oluşturulmak isteniyor. fields(Renk, Model, MotorHacmi, KapiSayisi)
    // Bu nesnenin verilerini OOP kurallarına uygun olarak verip alınız.
    // Main de 1 tane nesne oluşturup bunu kontrol ediniz.
    public static void main(String[] args) {
        // KURAL: genel yazılım kuralıdır.
        // bütün değişkenler private yapılır.
        // yani Kapsulleme ile kullanılır.
        // Eğer gerekiyorsa private kaldırılır.

        Araba arb1=new Araba();
        arb1.setRenk("kırmızı");
        arb1.setModel(2022);
        arb1.setMotorHacmi(1600);
        arb1.setKapiSayisi(4);

        System.out.println("arb1 = " + arb1);

        Araba arb2=new Araba("mavi", 2020, 1600, 8);

        System.out.println("arb2 = " + arb2);












    }
}
