package Gun07;

import java.util.Scanner;

public class _02_Soru {
    public static void main(String[] args) {
        //Girilen bir ad soyadın (tam ad) adını ve soyadını ayırıp, ayrı ayrı yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Adınız ve Soyadınız=");
        String tamAd= oku.nextLine();

        //ismet temur-> boşluğun indexinini bulurum buna göre ayırırım

        int boslukIndex=tamAd.indexOf(" ");
        String ad=tamAd.substring(0,boslukIndex); //Ismet
        String soyad=tamAd.substring(boslukIndex+1);
        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);



    }
}
