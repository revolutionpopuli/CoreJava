package Gun20;

import java.util.Arrays;

public class _04_JavaMethod {
    public static void main(String[] args) {
        //20 elemanlı bir dizinin elemanlarını bir fonksiyon aracılığıyla doldurunuz
        //ve aynı fonksiyonda yazdırınız.

        int[] dizi=new int[20];
        diziDoldurYazdir(dizi);

        int[] dizi2=new int[10];
        diziDoldurYazdir(dizi2);




    }
    public  static  void diziDoldurYazdir(int[]sayilar){
        for (int i = 0; i < sayilar.length; i++) {
            sayilar[i]=(int) (Math.random()*100);

        }
        {
            System.out.println(Arrays.toString(sayilar));
        }

    }


}
