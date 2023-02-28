package Gun15;

import java.util.Scanner;

public class OdevS1 {
    public static void main(String[] args) {
        //Girilen bir sayının simetrik sayı (12321, 55555, 45554, 11611,77377)
        //sayı olup olmadığını bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz=");
        int sayi = oku.nextInt();

        String str = String.valueOf(sayi);
        int i = 0;
        int j = str.length() - 1;
        boolean kontrol = true;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) {
                kontrol = false;
                break;
            }
        }

        if (kontrol)
            System.out.println(sayi+" sayısı simetrik bir sayıdır.");
        else
            System.out.println(sayi+" sayısı simetrik bir sayı değildir.");

    }
}
