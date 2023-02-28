package Gun17;

public class _02_JavaArray {
    public static void main(String[] args) {
        // 100 Elemanlı bir diziyi random olarak 100 e kadar olan sayılarla doldurunuz.
        // Sonrasında en büyük elemanı ve indexini bulunuz.

        int[] dizi=new int[100];

        for(int i=0; i< dizi.length; i++)
            dizi[i]=(int) (Math.random()*100);

        for(int i=0; i< dizi.length; i++)
            System.out.println(i+".kutu = " + dizi[i]);

        int enBuyuk=0;
        int enBuyukIndex=0;
        for(int i=0; i< dizi.length; i++){
            if (dizi[i]>enBuyuk){ // dizinin sıradaki elamanı enBukten büyük ise enBüyük o olsun
                enBuyuk=dizi[i];
            enBuyukIndex=i; }

        }


        System.out.println("enBuyuk = " + enBuyuk);
        System.out.println("enBuyukIndex = " + enBuyukIndex);

    }
}
