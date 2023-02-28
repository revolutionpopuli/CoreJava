package Gun13;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar olan sayılardan sadece tek olanlarının
        // toplamını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz=");
        int sayi= oku.nextInt();

        int toplam=0;
        int sayac=0;

        while (sayac<sayi) {

            if (sayac%2!=0)
                toplam=toplam+sayac;
            sayac++;
        }

        System.out.println("toplam = " + toplam);

    }
}
