package Gun12;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.(switch kullanınız)

        Scanner oku=new Scanner(System.in);
        System.out.print("1. Sayı=");
        int sayi1= oku.nextInt();
        System.out.print("2. Sayı=");
        int sayi2= oku.nextInt();

        System.out.println("Toplama T");
        System.out.println("Çıkarma Ç");
        System.out.println("Çarpma P");
        System.out.println("Bölme B");
        System.out.print("Seçiminiz=");

        Scanner oku1=new Scanner(System.in);
        String secim= oku.next();

        switch (secim.toUpperCase()) {

            case "T":
                System.out.println("Toplam=" + (sayi1 + sayi2));break;
            case "Ç":
                System.out.println("Çıkarma=" + (sayi1 - sayi2));break;
            case "P":
                System.out.println("Çarpımı=" + (sayi1 * sayi2));break;
            case "B":
                System.out.println("Bölümü=" + (sayi1 / sayi2));break;
            default:
                System.out.println("Hatalı Seçim");

        }




    }
}
