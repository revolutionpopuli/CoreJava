package Gun08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {
        //girilen bir sayının tek sayı olup olmadığını yazdırınız

        Scanner oku=new Scanner(System.in);

        System.out.print("Bir sayı giriniz=");
        int sayi= oku.nextInt();

        System.out.println("Sayı tek mi?"+(sayi%2!=0));// veya (sayi%2==1)



    }
}
