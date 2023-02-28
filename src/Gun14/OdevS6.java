package Gun14;

import java.util.Scanner;

public class OdevS6 {
    public static void main(String[] args) {
        //Kullanıcnın gireceği bir sayının basamaklarına göre tersi olan sayıyı bulunuz.

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz=");
        int sayi= oku.nextInt();
        int ters=0;

        while (sayi>0) {
            ters=ters*10;
            ters=ters+sayi%10;
            sayi=sayi/10;



        }

        System.out.println("Tersi = " + ters);



    }
}
