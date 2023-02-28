package Gun16;

import java.util.Arrays;
import java.util.Scanner;

public class ÖdevS14 {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız 10 elemanlı bir diziyi doldurduktan sonra,
        //ayrı bir döngüde çift rakam sayısını bulunuz ve yazdırınız

        int[] dizi=new int[10];
        Scanner oku=new Scanner(System.in);

        for (int i = 0; i < dizi.length ; i++) {

            System.out.print("Sayı=");
           dizi[i]=oku.nextInt();

        }
        int ciftMiktar=0;
        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i]%2==0)
                ciftMiktar++;

        }

        System.out.println(Arrays.toString(dizi));

        System.out.println("Çift Miktarı= " + ciftMiktar);



    }
}
