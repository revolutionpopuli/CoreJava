package Gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {

       // Kullanıcının gireceği sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz=");
        int sayi= oku.nextInt();

        //1. Yöntem
        if (sayi%2==0) {
            System.out.println("Çift");
        }
        else {
            System.out.println("Tek");
        }

        //tek satırda yöntemi:Ternary
        String sonuc= (sayi%2==0) ? "çift" : "tek"; // (? if), (: else)
        //şart doğru ise ilk bölüm değilse son bölüm çalışır
        System.out.println("sonuc = " + sonuc);

        //direkt so nun içinde kullanma yöntemi
        System.out.println( (sayi %2==0) ? "çift" : "tek");


    }
}
