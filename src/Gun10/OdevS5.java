package Gun10;

import java.util.Scanner;

public class OdevS5 {
    public static void main(String[] args) {

        //Girilen 3 sayıdan en küçük olanını bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı1=");
        int sayi1= oku.nextInt();
        System.out.print("Sayı2=");
        int sayi2= oku.nextInt();
        System.out.print("Sayı3=");
        int sayi3= oku.nextInt();

        int enkucuk=sayi1;


        if (sayi2<enkucuk) {
            enkucuk=sayi2;
        }

        if (sayi3<enkucuk) {
            enkucuk=sayi3;
        }
        System.out.println("En Küçük = " + enkucuk);

    }
}
