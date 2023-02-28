package Gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {

        // Girilen bir sayının birler ve onlar
        // basamağının eşit olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Bir sayı giriniz=");
        int sayi= oku.nextInt();

        int birler=sayi%10;
        int onlar=(sayi/10)%10; // ya da (sayi%100)/10

        if (birler==onlar) {
            System.out.println("Eşit");
        }

        if (birler!=onlar) {
            System.out.println("Eşit Değil");
        }

    }
}
