package Gun36._04_PolymorphismSoru;

public class OkulMain {
    public static void main(String[] args) {
       Ogrenci ogr=new Ogrenci("Ayşe", "Yılmaz","Öğrenci","5A");
       Calisan cal=new Calisan("ismet", "temur", "öğretmen","yazılım");

       Kisi.KimlikBelgesiYaz(ogr);
       Kisi.KimlikBelgesiYaz(cal);

    }
}
