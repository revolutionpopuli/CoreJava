package Gun33._03_Ornek;

public class Ogrenci {

    private int id;
    private String ad;
    private String soyad;
    private int yas;

    private static int sayacId=0;

    public Ogrenci(String ad, String soyad, int yas) {
        this.id = ++sayacId;//önce arttır sonra işlem
        setAd(ad);
        setSoyad(soyad);
        setYas(yas);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }
}
