package Gun18;

import java.util.Arrays;

public class _01_JavaArray {
    public static void main(String[] args) {

        // 100 elemanlı bir diziyi random (0-100 arası) doldurduktan sonra,
        // sadece tek elemanlarını bir başka yeni diziye atayınız.

        int[] dizi=new int[100]; // 100 elemanlı bir dizi

        for(int i=0; i< dizi.length; i++)
            dizi[i]=(int) (Math.random()*100); //0-100 arası random atar

        System.out.println("dizi="+ Arrays.toString(dizi));

        int[] tekler=new int[100]; // bir başka yeni dizi
        int j=0;
        for(int i=0; i< dizi.length; i++){

            if(dizi[i]%2==1) {
                tekler[j] = dizi[i];
                j++;
            }

        }

        System.out.println("tekler="+Arrays.toString(tekler));



    }
}
