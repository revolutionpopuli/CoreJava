package Gun29._04_Constructor;

public class Banka {
    String adi;
    int subeSayisi;
    int kurulusYili;

    Banka(){

    }

    public Banka(String adi, int subeSayisi, int kurulusYili) {
        this.adi = adi;
        this.subeSayisi = subeSayisi;
        this.kurulusYili = kurulusYili;
    }

    public Banka(String adi, int subeSayisi) {

        this(adi, subeSayisi, 0);
    }

    @Override
    public String toString() {
        String donecek= "Banka:" +
                "adi=" + adi  +
                ", subeSayisi=" + subeSayisi;

        if(kurulusYili>0)
            donecek+=", kurulusYili="+kurulusYili;
        return  donecek;
    }

}
