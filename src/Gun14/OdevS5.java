package Gun14;

import java.util.Scanner;

public class OdevS5 {
    public static void main(String[] args) {
        // Kullanıcın girdiği bir sayının ilk ve son basamaklarının eşit olup olmadığınız bulunuz

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz=");
        int sayi= oku.nextInt();
        int ters=0;

        while (sayi!=0) {
          ters=ters*10;
          ters=ters+sayi%10;
          sayi=sayi/10;



        }

        System.out.println("ters = " + ters);


    }
}
