package Gun06;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        // Girilen bir stringin sadece son harfini yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir string değer giriniz=");
        String girilen= oku.nextLine();

        //uzunluk-1 ile son karaktere ulaşırız.

        int uzunluk=girilen.length();
        char sonHarf=girilen.charAt(uzunluk-1);
        System.out.println(sonHarf);

        //2. yöntem
        System.out.println("sonHarf = " + girilen.charAt(girilen.length()-1));





    }
}
