package Gun25;

import java.util.HashMap;

public class _01_JavaMaps {
    public static void main(String[] args) {
        //Set-> HashSet, LinkedSet, TreeSet
        //Map->HashMap, LinkedHashMap, TreeMap

        //Anahtarımın tipi Integer, değerimin tipi String olacak
        HashMap<Integer, String>hm=new HashMap<>();
        hm.put(1001, "İsmet Temur");
        hm.put(1002, "Ali Yılmaz");
        hm.put(2001, "Veli Çınar");
        hm.put(5001, "Şahin Kaya");
        hm.put(2001, "Kemal Filiz");// 2001 deki bilgiyi Güncelliyor

        System.out.println("hm = " + hm);
        System.out.println("hm.get(2001) = " + hm.get(1002));
        System.out.println("hm.get(2001) = " + hm.get(2001));
        System.out.println("hm.keySet() = " + hm.keySet());
        System.out.println("hm.values() = " + hm.values());
        
        hm.remove(2001);//2001 anahtarındaki eleman silindi
        System.out.println("hm = " + hm);

        System.out.println("hm.size() = " + hm.size());
        
        hm.clear();
        System.out.println("hm = " + hm);
        
        
        
        
        
    }
}
