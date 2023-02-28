package Gun36._04_PolymorphismSoru;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorevi;

    public Kisi(String ad, String soyad, String gorevi) {
        setAd(ad);
        setSoyad(soyad);
        setGorevi(gorevi);
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", gorevi='" + gorevi + '\'' +
                '}';
    }
    public static void KimlikBelgesiYaz(Kisi gelenKisi){
        System.out.println("****Kimlik Belgesi****");
        System.out.println("Adı="+gelenKisi.ad);
        System.out.println("Soyadı="+gelenKisi.soyad);
        System.out.println("Görevi="+gelenKisi.gorevi);
        //öğrenciyse şubesi
        //çalışansa departmanını yazacağız

        if(gelenKisi instanceof Ogrenci){//gelen kişi öğrenci mi
            //şubeyi yazacağız
            System.out.println("Şubesi="+((Ogrenci) gelenKisi).getSubesi());
        }
        else
        if(gelenKisi instanceof Calisan){//gelen kişi çalışan mı
            //departmanı yazacağız
            System.out.println("Departmanı="+((Calisan) gelenKisi).getDepartmani());
        }
    }
}
