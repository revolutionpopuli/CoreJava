package Gun21;

import java.util.Scanner;

public class OdevS2 {
    public static void main(String[] args) {
        //"OrtaKelime" isminden bir method oluşturun.
        //Bu method String'i parametre olarak almalı.
        //Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
        //Ortadaki kelimeyi return yapınız.
        //Örnek: Ben Java'yı seviyorum.

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir cümle giriniz=");
        String cumle= oku.nextLine();

        System.out.print("Orta Kelime="+ortaKelime(cumle));
    }
  public static String ortaKelime(String cumle){

        String[] dizi=cumle.split(" ");
        String kelime=dizi[dizi.length/2];
        return kelime;



    }
}
