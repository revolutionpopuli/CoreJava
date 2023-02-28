package Gun25;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMaps {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1001, "İsmet Temur");
        hm.put(1002, "Ali Yılmaz");
        hm.put(2001, "Veli Çınar");
        hm.put(5001, "Şahin Kaya");
        hm.put(2003, "Kemal Filiz");

        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());

        for (Integer k : hm.keySet()) {
            System.out.println("k = " + k);
        }
        for (String v : hm.values()) {
            System.out.println("v = " + v);
        }
        //Entry->girilen(veri) EntrySet->girilenlerin seti yani veriler
        for (Map.Entry<Integer, String> kv : hm.entrySet()) {
            System.out.println("kv.getKey() = " + kv.getKey());
            System.out.println("kv.getValue() = " + kv.getValue());
        }
    }
}
