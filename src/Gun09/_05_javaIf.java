package Gun09;

import java.util.Scanner;

public class _05_javaIf {
    public static void main(String[] args) {
        // Girilen bir sayının sadece, birler basamağını yazı ile yazdırınız
        // 1 -> bir    2-> iki

        Scanner oku=new Scanner(System.in);

        System.out.print("Bir sayı giriniz=");
        int sayi= oku.nextInt();

        //sayı %10, kalan her zaman son basamak (birler) olur

        int birler=sayi%10;

        if (birler==0) {System.out.println("sıfır");}
        if (birler==1) {System.out.println("bir");}
        if (birler==2) {System.out.println("iki");}
        if (birler==3) {System.out.println("üç");}
        if (birler==4) {System.out.println("dört");}
        if (birler==5) {System.out.println("beş");}
        if (birler==6) {System.out.println("altı");}
        if (birler==7) {System.out.println("yedi");}
        if (birler==8) {System.out.println("sekiz");}
        if (birler==9) {System.out.println("dokuz");}






    }
}
