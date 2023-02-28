package Gun31._01_StaticModifier;

public class Okul {
    public static void main(String[] args) {

        //Ogrenci ogr1 = new Ogrenci("ismet", "temur", "yıldırım ilkokulu");
        //Aynı verinin 500 kez girişi yapılıyordu, bunu engellemek için, once cons.

        Ogrenci ogr1 = new Ogrenci("ismet", "temur");
        Ogrenci ogr2 = new Ogrenci("ahmet", "temiz");
        Ogrenci ogr3 = new Ogrenci("mehmet", "lemur");

        //.....
        //.....

        Ogrenci ogr499=new Ogrenci("nusret", "serin");
        Ogrenci ogr500=new Ogrenci("biret", "kılıç");

        //aynı verinin çok kez girişi engellendi
        //aynı verinin hafızada NESNE sayısı kadar engellendi.

    }
}
