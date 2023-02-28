package Gun40._01_Ornek;

public  class Kedi extends Hayvan {


    public Kedi(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecegi() {
        System.out.println("mama ve balık");
    }

    @Override
    void yemekMiktari() {
        System.out.println("100 gr");
    }

    @Override
    void gunlukUykusu() {
        System.out.println("15 saat");

    }

    @Override
    void sesi() {
        System.out.println("miyav");

    }
}
