package Gun09;

import java.util.Scanner;

public class OdevS3 {
    public static void main(String[] args) {
        //Girilen bir kelimenin ilk ve son harfinin aynı olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Kelime Giriniz=");
        String kelime= oku.next();

        char ilkHarf=kelime.charAt(0);
        int uzunluk=kelime.length();
        char sonHarf=kelime.charAt(uzunluk-1);

        if (ilkHarf==sonHarf) {
            System.out.println("ilk harf ve son harf AYNI");
        }

         if (ilkHarf!=sonHarf) {
             System.out.println("ilk harf ve son harf FARKLI");
         }





    }
}
