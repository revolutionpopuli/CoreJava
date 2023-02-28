package Gun40._01_Ornek;

public class Kartal extends Hayvan{
    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("et");
    }

    @Override
    void yemekMiktari() {
        System.out.println("1 kg");

    }

    @Override
    void gunlukUykusu() {
        System.out.println("5 saat");

    }

    @Override
    void sesi() {
        System.out.println("ciyaaak");

    }
}
