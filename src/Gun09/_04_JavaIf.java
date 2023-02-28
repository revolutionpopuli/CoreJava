package Gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {

        // girilen bir sayının tek mi çift mi olduğunu yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.print("Sayı=");
        int sayi= oku.nextInt();

        int kalan=sayi%2;// mod % bize bölümden kalanı verir.

        if (kalan!=0) {
            System.out.println("Sayı Tek");
        }

        if (kalan==0) {
            System.out.println("Sayı Çift");
        }

    }
}
