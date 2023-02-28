package Gun14;

import java.util.Scanner;

public class OdevS7 {
    public static void main(String[] args) {
        //Kullanıcından 10 sayı isteyiniz ve ekrana yazdırınız,
        // eğer sonra girilen sayı önce girilenden büyük ise dikkate almasın (pass geçsin).

        Scanner oku=new Scanner(System.in);
        int sayac = 0;

        int sonrakiSayi = Integer.MAX_VALUE;

        while (sayac<10) {

            System.out.print((sayac+1)+".Sayı Giriniz=");
            int sayi= oku.nextInt();

            if (sayi>sonrakiSayi) {
                System.out.println("Pas Geç"); continue;
            }

            else {

                System.out.println(sayi+" ");
            }

            sonrakiSayi = sayi;
            sayac++;

        }



    }
}
