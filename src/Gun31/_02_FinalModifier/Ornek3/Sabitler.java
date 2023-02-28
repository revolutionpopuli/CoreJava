package Gun31._02_FinalModifier.Ornek3;

public class Sabitler {

    final static int birGundekiSaatSayisi=24;
    final static int birSaattekiDakikaSayisi=60;
    final static int birDakikadakiSaniyeSayisi=60;

    public  static int toSecond(int gun, int saat, int dakika){

        int toplamSaniye=gun*Sabitler.birGundekiSaatSayisi*Sabitler.birSaattekiDakikaSayisi*
                Sabitler.birDakikadakiSaniyeSayisi+saat*Sabitler.birSaattekiDakikaSayisi*Sabitler.birDakikadakiSaniyeSayisi+
                dakika*Sabitler.birDakikadakiSaniyeSayisi;

        return toplamSaniye;
    }


    }




