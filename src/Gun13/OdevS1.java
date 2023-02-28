package Gun13;

import java.util.Scanner;

public class OdevS1 {
    public static void main(String[] args) {
        //Girilen bir sayıya kadar olan sayıların çarpım sonucunu bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("Bir SayI Giriniz=");
        int sayi= oku.nextInt();
        int carpim=1;
        int sayac=1;

        while (sayac<sayi) {

            carpim=carpim*sayac;
            sayac++;

        }

        System.out.println("Çarpım = " + carpim);

    }
}
