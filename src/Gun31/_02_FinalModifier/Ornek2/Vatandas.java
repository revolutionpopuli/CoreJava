package Gun31._02_FinalModifier.Ornek2;

public class Vatandas {

    String tamAd;
    final int tcNo;

    static int sayac=1;

    public Vatandas(String tamAd) {
        this.tcNo=sayac++;
        this.tamAd = tamAd;

    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "tamAd='" + tamAd + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}
