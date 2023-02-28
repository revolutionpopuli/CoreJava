package Gun36._04_PolymorphismSoru;

public class Ogrenci extends Kisi{

    private String subesi;
    public Ogrenci(String ad, String soyad, String gorevi, String subesi) {
        super(ad, soyad, gorevi);
        setSubesi(subesi);
    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "subesi='" + subesi + '\'' +
                '}';
    }
}
