package Gun25;

import java.util.HashMap;

public class _03_JavaMaps {
    public static void main(String[] args) {
        //Bir kartvizit uygulamasını 2 için yapınız

        HashMap<String, String>vKartVizit=new HashMap<>();
        vKartVizit.put("isim", "Volkan Altıntaş");
        vKartVizit.put("email", "volkan@gmail.com");
        vKartVizit.put("adres", "Çekmeköy/Türkiye");
        vKartVizit.put("telefon", "05321234567");

        System.out.println("vKartVizit.get(isim) = " + vKartVizit.get("isim"));
        System.out.println("vKartVizit.get(telefon) = " + vKartVizit.get("telefon"));

        HashMap<String, String>eKartVizit=new HashMap<>();
        eKartVizit.put("isim", "Elba Gurbanov");
        eKartVizit.put("email", "elba@gmail.com");
        eKartVizit.put("adres", "Bakü/Türkiye");
        eKartVizit.put("telefon", "994521234567");

        //kartvizitlerim diye bir defteri nasıl tanımlarım
        //volkan ın kartviziti

        //     elba nın kartviziti
        HashMap<String, HashMap<String,String>>Kartvizitlerim=new HashMap<>();
        Kartvizitlerim.put("volkan", vKartVizit);
        Kartvizitlerim.put("elba", eKartVizit);

        //volkanın telefonuna nasıl ulaşırım
        System.out.println("Kartvizitlerim.get(volkan).get(telefon) = " + Kartvizitlerim.get("volkan").get("telefon"));
        System.out.println("Kartvizitlerim.get(elba).get(adres) = " + Kartvizitlerim.get("elba").get("adres"));
        System.out.println("Kartvizitlerim.get(volkan) = " + Kartvizitlerim.get("volkan"));


    }
}
