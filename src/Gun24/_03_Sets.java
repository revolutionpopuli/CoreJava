package Gun24;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _03_Sets {
    public static void main(String[] args) {


        // SETS
        // HashSet : Hızlı, bunun için kendine özel bir sırada saklar
        // LinkedHashSet : eklendiği sırada saklar
        // TreeSet : herzaman sıralı tutar, kendinden sortlu

        //hızlı çalışmak için kendine özel bir sırada saklar
        HashSet<String>hs=new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");
        System.out.println("hs = " + hs);
        
        //eklenme sırasına göre elemanları saklar
        LinkedHashSet<String>lhs=new LinkedHashSet<>();
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("beş");
        System.out.println("lhs = " + lhs);
        
        //her zaman sıralı tutar, kendinden sortlu
        TreeSet<String>ts=new TreeSet<>();
        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("beş");
        System.out.println("ts = " + ts);


    }
}
