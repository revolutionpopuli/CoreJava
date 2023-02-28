package Gun09;

import java.util.Scanner;

public class OdevS1 {
    public static void main(String[] args) {

        //Girilen 1 sayının onlar basamağının tek olup olmadığını yazdırınız.

        Scanner oku=new Scanner(System.in);

        System.out.print("Bir sayı giriniz=");
        int sayi= oku.nextInt();

        int onlarbasamagi=(sayi%100)/10;


        if (onlarbasamagi%2==1) {
            System.out.println("Onlar Basamağı Tek");
        }

        if (onlarbasamagi%2==0) {
            System.out.println("Onlar Basamağı Tek Değil");
        }

    }
}
