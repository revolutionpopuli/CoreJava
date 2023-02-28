package Gun10;

import java.util.Scanner;

public class OdevS1 {
    public static void main(String[] args) {
        //Girilen bir sayının birler ve onlar basamağının hem tek hem de eşit olup olmadığını kontrol ediniz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz=");
        int sayi= oku.nextInt();
        int birler=sayi%10;
        int onlar=(sayi%100)/10;

        if (birler%2!=0 && onlar%2!=0 && birler==onlar) {
            System.out.println("Uygun");
        }

        else {
            System.out.println("uygun DEĞİL");
        }



    }
}
