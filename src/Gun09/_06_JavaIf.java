package Gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {

        // Girilen bir öğrencinin notuna göre 50 den büyük-eşit ise geçtiniz,
        // küçük ise kaldınız yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Notu Giriniz=");
        int not= oku.nextInt();

        if (not>=50) {
            System.out.println("Geçtiniz :)");
        }

        if (not<50) {
            System.out.println("Kaldınız :(");
        }


    }
}
