package Gun16;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {

        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.

        Scanner oku=new Scanner(System.in);

        int[] dizi=new int[7];
        int toplam=0;

        for(int i=0; i<dizi.length; i++) {
            System.out.print("Sayı=");
            dizi[i]= oku.nextInt();
            toplam=toplam+dizi[i];
        }

        int ort=toplam/dizi.length;

        int adet=0;
        for(int i=0; i< dizi.length; i++){

            if(dizi[i]>ort && dizi[i]%2==1){
                System.out.println(dizi[i]);
            adet++;}
        }

        System.out.println("ort = " + ort);
        System.out.println("adet = " + adet);

    }
}
