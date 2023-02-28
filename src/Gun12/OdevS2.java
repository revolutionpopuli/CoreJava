package Gun12;

import java.util.Scanner;

public class OdevS2 {
    public static void main(String[] args) {
        //2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Üç Basamaklı Sayı=");
        int sayi= oku.nextInt();

        int yuzler=sayi/100;
        int onlar=(sayi%100)/10;
        int birler=sayi%10;

        switch (yuzler) {

            case 1: System.out.println("Yüz");break;
            case 2: System.out.println("İkiYüz");break;
            case 3: System.out.println("ÜçYüz");break;
            case 4: System.out.println("DörtYüz");break;
            case 5: System.out.println("BeşYüz");break;
            case 6: System.out.println("AltıYüz");break;
            case 7: System.out.println("YediYüz");break;
            case 8: System.out.println("SekizYüz");break;
            case 9: System.out.println("DokuzYüz");break;

        }

        switch (onlar) {
            case 1: System.out.println("On");break;
            case 2: System.out.println("Yirmi");break;
            case 3: System.out.println("Otuz");break;
            case 4: System.out.println("Kırk");break;
            case 5: System.out.println("Elli");break;
            case 6: System.out.println("Altmış");break;
            case 7: System.out.println("Yetmiş");break;
            case 8: System.out.println("Seksen");break;
            case 9: System.out.println("Doksan");break;

        }

        switch (birler) {

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
