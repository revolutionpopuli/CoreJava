package Gun14;

import java.util.Scanner;

public class OdevS4 {
    public static void main(String[] args) {
        //Kullanıcın gireceği bir sayının kaç basamak olduğunu bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz=");
        int sayi= oku.nextInt();
        int basamaksayisi=0;

        while (sayi!=0) {

          sayi=sayi/10;
            basamaksayisi++;
        }
        System.out.println("basamaksayisi = " + basamaksayisi);




    }
}
