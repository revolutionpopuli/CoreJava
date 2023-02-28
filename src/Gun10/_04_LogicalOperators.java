package Gun10;

import java.util.Scanner;

public class _04_LogicalOperators {
    public static void main(String[] args) {

        // Mantıksal (Lojik) ifadeler
        // && (shift 6) , ||  (alt <)  veya
        // Girilen sayı pozitif ve tek ise , ekrana uygun sayı girildi
        // degilse uygun sayı girilmedi yazdırınız.

        // hem tek hem pozitif  ->  (sayi%2 == 1) && (sayi > 0)


        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı=");
        int sayi= oku.nextInt();

        if (sayi%2==1 && sayi>0) {
            System.out.println("Uygun sayı girildi");
        }

        else {
            System.out.println("Ulgun sayı GİRİLMEDİ");
        }


    }
}
