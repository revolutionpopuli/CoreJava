package Gun09;

import java.util.Scanner;

public class OdevS2 {
    public static void main(String[] args) {

        //Girilen bir şifrenin "Bayrak" kelimesine eşit olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Şifreyi Giriniz=");
        String girilen= oku.next();
        String sifre="Bayrak";

        if (girilen.equals(sifre)) {

            System.out.println("Şifre eşleşti");

        }



    }
}
