package Gun40._01_Ornek;

public abstract class Hayvan {
    private final int id;
    private String isim;
    private boolean vahsi;
    private String dogumTarihi;
    private static int idSayac=0;

    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {
        this.id = ++idSayac;
        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);
    }

    abstract void yiyecegi();
    abstract void yemekMiktari();
    abstract void gunlukUykusu();
    abstract void sesi();

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        System.out.println("******************");
        System.out.println("id="+id);
        System.out.println("isim="+isim);
        System.out.println("vahşi mi="+vahsi);
        System.out.println("doğum tarihi="+dogumTarihi);

        yiyecegi();
        yemekMiktari();
        gunlukUykusu();
        sesi();

        return "hayvandan türetildi";

    }
}
