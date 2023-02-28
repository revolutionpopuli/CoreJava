package Gun10;

import java.util.Scanner;

public class OdevS2 {
    public static void main(String[] args) {
        // Girilen bir kelimede bosluk veya A harfinin olup olmadığını kontrol ediniz.

        Scanner oku=new Scanner(System.in);
        System.out.print("kelime Giriniz=");
        String kelime= oku.next();


        if ( kelime.isEmpty()==true || kelime.contains("A")) {
            System.out.println("Uygun");
        }

        else {
            System.out.println("Uygun DEĞİL");
        }




    }
}
