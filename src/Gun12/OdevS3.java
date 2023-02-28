package Gun12;

import java.util.Scanner;

public class OdevS3 {
    public static void main(String[] args) {
        // 20-80 arasında üretilen bir sayının birler basamağını yazı ile yazdırınız.

        int min= 20;
        int max=80;

        int UretilenSayi= (int) (Math.random()*(max-min))+min;
        System.out.println("UretilenSayi = " + UretilenSayi);


        int birler=UretilenSayi%10;

        switch (birler) {
            case 0: System.out.println("Sıfır");break;
            case 1: System.out.println("Bir");break;
            case 2: System.out.println("İki");break;
            case 3: System.out.println("Üç");break;
            case 4: System.out.println("Dört");break;
            case 5: System.out.println("Beş");break;
            case 6: System.out.println("Altı");break;
            case 7: System.out.println("Yedi");break;
            case 8: System.out.println("Sekiz");break;
            case 9: System.out.println("Dokuz");break;

        }





    }
}
