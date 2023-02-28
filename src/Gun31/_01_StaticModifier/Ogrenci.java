package Gun31._01_StaticModifier;

public class Ogrenci {
    String ad;
    String soyad;
    static String okulAdi="yıldırım ilkokulu";//sen bir tanesin
    //hepsi için geçerli tek bir tane eleman
    //Tekrarlayan ve tüm nesneler için kullanılacak
    //değişkenler için STATIC kullanıyoruz.
    //static=sen bir tanesin
    //static varsa hafızadan tasarruf sağlar. hepsine atanır,
    //tek olarak hafızada bulunur
    //tipin, sınıfın, classın değişkeni


    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;

        //this.okulAdi="yıldırım ilkokulu"
        //500 kez aynı veri hafızada yer alıyordu, kötü hafıza kullanımı

    }

    @Override
    public String toString() {
        return "Student{" +
                "ad='" + ad + '\'' +
                ", soyad=" + soyad +
                ", okulAdi='" + okulAdi + '\'' +
                '}';
    }
}
