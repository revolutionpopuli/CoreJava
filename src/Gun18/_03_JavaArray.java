package Gun18;

import java.util.Arrays;

public class _03_JavaArray {
    public static void main(String[] args) {
        // 10 elemanlı bir diziyi random (0-100 arası) doldurduktan sonra,
        // tek elemanlarını ayrı bir diziye, çift elemanları ayrı başka bir diziye,
        //sadece atanan elemanların sayısı kadar olacak şekilde atayınız.

        int[] dizi=new int[10];

        int tekMiktar=0;
        int ciftMiktar=0;
        for(int i=0; i< dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);
            if (dizi[i]%2==1)
                tekMiktar++;
            else
                ciftMiktar++;
        }
        System.out.println("dizi = " + Arrays.toString(dizi));
        System.out.println("tekMiktar = " + tekMiktar);
        System.out.println("ciftMiktar = " + ciftMiktar);

        int[] tekler=new int[tekMiktar];

        int[] ciftler=new int[ciftMiktar];


        int teklerinIndexi=0;
        int ciftlerinIndexi=0;

        for(int i=0; i< dizi.length; i++) {
            if(dizi[i]%2==1){
                tekler[teklerinIndexi]=dizi[i];
                teklerinIndexi++;}

           else {
                    ciftler[ciftlerinIndexi]=dizi[i];
                ciftlerinIndexi++;
            }
        }

        System.out.println("Tekler Sonra = " + Arrays.toString(tekler));
        System.out.println("Çiftler Sonra = " + Arrays.toString(ciftler));



    }
}
