package Gun13;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar (girilen sayı dahil) olan sayıların toplamını bularak yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz=");
        int sayi= oku.nextInt();
        int sayac=0;
        int toplam=0;

        while (sayac<=sayi) {

            toplam=toplam+sayac;
            sayac++;


        }
        System.out.println("toplam = " + toplam);

        //2. yöntem
        toplam=0;
        while (sayi>0) {
            toplam=toplam+sayi;
            sayi--;
        }

        System.out.println("toplam2 = " + toplam);

    }
}
