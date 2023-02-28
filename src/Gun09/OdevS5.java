package Gun09;

import java.util.Scanner;

public class OdevS5 {
    public static void main(String[] args) {
        //Girilen 2 kelimenin aynı uzunlukta olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("1. Kelimeyi Giriniz=");
        String kelime1= oku.next();
        System.out.print("2. Kelimeyi Giriniz=");
        String kelime2= oku.next();
        int uzunluk1= kelime1.length();
        int uzunluk2=kelime2.length();

        if (uzunluk1==uzunluk2) {

            System.out.println("Uzunluk AYNI");
        }

        if (uzunluk1!=uzunluk2) {
            System.out.println("uzunluk FARKLI");
        }





    }
}
