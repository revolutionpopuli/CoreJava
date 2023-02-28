package Gun24;

import java.util.HashSet;
import java.util.Iterator;

public class _04_Sets {
    public static void main(String[] args) {
        HashSet<String>renkler=new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red");//bu eklenmedi
        renkler.add("RED");//bu eklendi
        
        //Ekrana Yazdırma
        System.out.println("renkler = " + renkler);

        //Ekrana yazdırma tek tek
        for (String eleman:renkler) //foreach, dizinin içindeki sırasına gelmesi garanti değil
        {
            System.out.println("eleman = " + eleman);
        }

        //içindeki sıranın garanti edildiği yöntem
        Iterator gosterge= renkler.iterator();//hafızadaki ilk kutucuğun yerini aldım.
        //ben adım adım gideceğim, böylece içindeki sırayı takip edeceğim

        //adım adım gitme, bir sonraki bir sonraki
        while (gosterge.hasNext())//bir sonraki var mı?
        {
            System.out.println("gosterge.next() = " + gosterge.next());//o kutucuğu yazdır
            //if (böyleyse) gosterge.remove();//o andaki kutucuğu siler
        }
        
        
        
    }
}
