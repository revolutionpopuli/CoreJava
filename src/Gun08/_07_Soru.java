package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // kullanıcının gireceği 2 sayının birbirine
        // eşit mi olup olmadığını yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.print("birinci sayıyı giriniz=");
        int sayi1= oku.nextInt();

        System.out.print("ikinci sayıyı giriniz=");
        int sayi2= oku.nextInt();

        System.out.println("eşit mi?"+(sayi1==sayi2));

    }
}
