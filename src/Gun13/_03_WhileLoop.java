package Gun13;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        // Girilen 20 sayıdan sadece pozitif olanlarının toplamını bulunuz.

        Scanner oku=new Scanner(System.in);

        int sayac=0;
        int toplam=0;

        while (sayac<20) {

            System.out.print((sayac+1)+".Sayı=");
            int sayi=oku.nextInt();

            if (sayi>0) toplam=toplam+sayi;

            sayac++;

        }

        System.out.println("toplam = " + toplam);
    }
}
