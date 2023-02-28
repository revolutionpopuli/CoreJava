package Gun23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {
        // ArrayList Collection grubunun bir elemanı
        // Array i sıralarken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer>rakamlar=new ArrayList<>();
        
        rakamlar.add(50);
        rakamlar.add(5);
        rakamlar.add(456);
        rakamlar.add(45);
        rakamlar.add(3);

        System.out.println("rakamlar = " + rakamlar);

        //Sıralama İşareti
        Collections.sort(rakamlar);
        System.out.println("Sıralama = " + rakamlar);
        
        //Tersine Çevir
        Collections.reverse(rakamlar);
        System.out.println("reverse = " + rakamlar);
        
        //Max. ve Min. Eleman Bulma
        System.out.println("Collections.max(rakamlar) = " + Collections.max(rakamlar));
        System.out.println("Collections.min(rakamlar) = " + Collections.min(rakamlar));

        //Bütün elemanları Set Etme
        Collections.fill(rakamlar,0);//bütün elemanları sıfır atar
        System.out.println("Fill = " + rakamlar);

        //Replace
        Collections.replaceAll(rakamlar,0,5);//0 lara 5 atadı
        System.out.println("Replace = " + rakamlar);

        //Tanımlarken Değer Atama
        int[] dizi={2,3,4,5};
        ArrayList<Integer>liste=new ArrayList<>(Arrays.asList(2,3,4,5));
        System.out.println("Liste = " + liste);
        ArrayList<String>strListe=new ArrayList<>(Arrays.asList("3","4","5"));
        System.out.println("strListe = " + strListe);




    }
}
