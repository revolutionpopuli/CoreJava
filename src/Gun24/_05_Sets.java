package Gun24;

import java.util.HashSet;

public class _05_Sets {
    public static void main(String[] args) {
        HashSet<Integer>hs=new HashSet<>();
        hs.add(2);
        hs.add(5);
        hs.add(7);
        hs.add(34);
        hs.add(3);

        System.out.println("hs = " + hs);
        System.out.println("hs.size() = " + hs.size());

        hs.remove(2);//elemanın kendisinin değeri verilir ve öyle silinir
        System.out.println("remove sonrası " + hs);

        if(hs.contains(34))
            System.out.println("34 var");
        else System.out.println("34 yok");

        hs.clear();
        System.out.println("hs = " + hs);



    }
}
