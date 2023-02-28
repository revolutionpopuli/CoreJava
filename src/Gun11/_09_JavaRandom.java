package Gun11;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        //Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışınız.Kullanıcı bilirse tebrikler yazdırınız.
        //Hangi sayıya kadar sayı üretilecek. Yani sınırı alıcağım.
        //Bu sayıyı bulabilmek için tahmin sayısını alacağım.

        Scanner oku=new Scanner(System.in);
        System.out.print("Üretilecek sayı sınırı=");
        int sinir= oku.nextInt();


        int tutulanSayi=(int) (Math.random()*(sinir+1));

        System.out.print("Tahmininiz=");
        int tahmin= oku.nextInt();

        // if (tutulanSayi==tahmin) {
        //    System.out.println("Tebrikler Bildiniz");
       // }
       // else {
       //     System.out.println("Biledin ki Bilemedin ki :)");
       // }

        System.out.println((tutulanSayi==tahmin) ? "Tebrikler bildiniz" : "Bilemediniz");
        System.out.println("tutulanSayi = " + tutulanSayi);


    }
}
