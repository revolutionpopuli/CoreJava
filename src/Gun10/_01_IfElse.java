package Gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir öğrencinin notuna göre 50 den büyük-eşit ise geçtiniz,
        // küçük ise kaldınız yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Notu Giriniz=");
        int not= oku.nextInt();

        //        1.Yöntem (önceki)
//        if (not>=50){  // hangi not girilirse girilsin kontrol edilir
//            System.out.println("tebrikler geçtiniz");
//        }
//
//        if (not < 50){ // hangi not girilirse girilsin kontrol edilir
//            System.out.println("tebrikler yaz okulu kazandınız");
//        }

        // 2.Yöntem olması gereken
        // Yukarıdaki iflerde herzaman kontrol edilme durumu vardır.
        // halbuki aşağıdaki IF-ELSE yapısında IF şartı çalıştığında ELSE
        // kontrol edilmesine gerek kalmaz.

        if (not>=50) {
            System.out.println("Tebrikler, geçtiniz.");
        }

        else {
            System.out.println("Tebrikler, yaz okulu kazandınız");
        }



    }

}
