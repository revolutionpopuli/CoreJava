package Gun16;

import java.util.Arrays;
import java.util.Scanner;

public class ÖdevS13 {
    public static void main(String[] args) {

        //Kullanıcıdan alacağınız 10 elemanlı bir diziyi doldurduktan sonra,
        //ayrı bir döngüde en büyük ve en küçük rakamın farkını bulunuz.


        Scanner oku=new Scanner(System.in);
        int[] dizi=new int[10];


        for (int i = 0; i < dizi.length ; i++) {
            System.out.print("Sayı=");
            dizi[i]= oku.nextInt();

            }

        System.out.println(Arrays.toString(dizi));

        int enb=dizi[0];
        int enk=dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if(dizi[i]>enb)
                enb=dizi[i];}

            for (int i = 0; i < dizi.length ; i++) {
                if (dizi[i]<enk)
                    enk = dizi[i];}

        System.out.println("Sonuç="+(enb-enk));




    }
}
