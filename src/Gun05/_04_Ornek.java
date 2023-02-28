package Gun05;

import java.util.Scanner;

public class _04_Ornek {
    public static void main(String[] args) {
        //Kullanıcıdan adını ve soyadını ayrı ayrı okutarak alıp birlikte ekrana yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("adınız=");
        String ad= oku.next();

        System.out.print("soyadınız=");
        String soyad=oku.next();


        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println(ad+soyad);





    }
}
