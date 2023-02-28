package Gun17;

import java.util.Arrays;

public class _04_JavaArrayMethods {
    public static void main(String[] args) {

        //Arrays.toString(dizi)
        String[] isimler={"ahmet","melike","sümeyra","inanç","mert"};
        System.out.println("Arrays.toString()isimler = " + Arrays.toString(isimler));

        Arrays.sort(isimler);//alfabetik
        System.out.println("isimler = " + Arrays.toString(isimler));


        //diziler eşit mi?
        int[] a={1,8,3,54};
        int[] b={1,8,3,54};
        int[] c={1,8,2,54};
        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b));//true
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(a,c));//false
        
        Arrays.fill(c,7);//bütün kutucuklara 7 atar.
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));

        //Arrays.binarySearch(rakamlar, 5)   -> Sıralı dizide aranan elemanın indexi verir
        // aranan elaman birden fazla ise herhangi birini verebilir.
        // esas amacı var mı yok mu kontrolü, var ise indexini verir, yok ise negatif sayı döndürür
        
        int[] rakamlar={2,7,4,6,5};
        System.out.println("rakamlar = " + Arrays.toString(rakamlar));
        
        Arrays.sort(rakamlar);
        System.out.println("Arrays.sort(rakamlar) = " + Arrays.toString(rakamlar));
        System.out.println("Arrays.binarySearch(rakamlar,7) = " + Arrays.binarySearch(rakamlar,7));
                
        
        
    }
}
