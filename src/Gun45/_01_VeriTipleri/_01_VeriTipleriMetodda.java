package Gun45._01_VeriTipleri;

import java.util.Arrays;

public class _01_VeriTipleriMetodda {
    public static void main(String[] args) {
        //ilkel tip
        int sayi=5;
        sayiArtir(sayi);
        System.out.println("sayi = " + sayi);
        
        sayi=sayiArtir2(sayi);
        System.out.println("sayi = " + sayi);
        
        //referans tip
        int[] dizi={1,2,3};
        diziSifirla(dizi);
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));
        
        //nesne tip, NULL alabilen ilkel tip
        String isim="ismet";
        kelimeSifirla(isim);
        System.out.println("isim = " + isim);

        // Özet: Temel fark:
        // 1- İlkel tipler sadece 1 değer saklarlar, bu yüzden metodlara sadece değeri gider
        // 2- Nesne tipler İlkel tipten tek farkı NULL değeri alabilmeleri, bu yüzden ilkel tip gibi davranırlar
        // 3- Referans tipler metoda gönderildiklerinde kendileri giderler. Eşitlemelerde referanslar eşitlenir.

        // Eşit mi
        // ilkel tiplerde  == ve equals farketmez değerler karşılaştırılır.
        // Referance ve Nesne tipler için  eşitlik kontorlünde == in manası  referansları aynı mı demek
        //                                                 equals in manası ise değerleri aynı mı demek
        
        
    }
    public static void sayiArtir(int sayi){//ilkel tipler aktarılan değerdir
        sayi=sayi+1;
    }
    public static int sayiArtir2(int sayi){//ilkel tipler aktarılan değerdir
        sayi=sayi+1;
        return sayi;
    }
    public static void diziSifirla(int[] a){//referans tiplerin metodlara adresi gider, yani kendisi, bu yüzden returne ihtiyacı yok
        a[0]=0;
        a[1]=0;
        a[2]=0;

    }
    public static void kelimeSifirla(String kelime){//nesne tip olduğundan ilkel tip gibi davranır, yani değeri gelir, kendisi değil
        kelime="";
    }
    
}
