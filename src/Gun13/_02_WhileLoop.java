package Gun13;

import java.util.Scanner;

public class _02_WhileLoop {
    public static void main(String[] args) {
        //Girilen 20 sayının toplamının sonucunu bulunuz.

        Scanner oku=new Scanner(System.in);

        int toplam=0;
        int sayac=1;

        while (sayac<=20) {

            System.out.print(sayac+".Sayı=");
            int sayi= oku.nextInt();
            sayac++;
            toplam=toplam+sayi;

        }

        System.out.println("toplam="+toplam);

    }
}
