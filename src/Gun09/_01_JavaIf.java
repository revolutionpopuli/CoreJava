package Gun09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {
        //Baklava dilimi=if
        //Girilen bir sayı 10 dan büyük ise ekrana 10 büyük yazdırınız
        //Algoritma
        //1-Başla -> main {
        //2-Sayı oku -> scanner işlemleri
        //3-Sayı>10 -> "!0 dan büyük" yaz -> if (sayi>10) sout
        //4-Dur  ->

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı=");
        int sayi= oku.nextInt();

        if (sayi>10)
        {
            System.out.println("10 dan büyük"); //şart doğru ise parantezlerin arası çalışacak

        }


    }
}
